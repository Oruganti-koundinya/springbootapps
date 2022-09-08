package com.example.quizportal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.quizportal.entity.Questions;
import com.example.quizportal.entity.Quiz;
import com.example.quizportal.entity.UserQuiz;
import com.example.quizportal.entity.Users;

@Repository
public class QuizDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	public int UserSignup(Users u) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
				manager.persist(u);						
			transaction.commit();
			return 1;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	public List<Users> userLogin() {
		EntityManager manag = emf.createEntityManager();
		Query query = manag.createQuery("select u from Users u");  			
		List<Users> listOfUsers = query.getResultList();
		return listOfUsers;
	}
	
	public int addQuestion(Questions q) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
				manager.persist(q);						
			transaction.commit();
			return 1;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}

	public Questions findQuestions(int qid){
		EntityManager manager = emf.createEntityManager();					
		Questions q = manager.find(Questions.class, qid);					
		return q;
	}
	
	
	public int createQuiz(Quiz quiz) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
				manager.persist(quiz);						
			transaction.commit();
			return 1;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	public int attemptQuiz(UserQuiz uq) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction transaction  = manager.getTransaction();
			transaction.begin();
				manager.persist(uq);						
			transaction.commit();
			return 1;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	
	public String Results() {
		EntityManager manag = emf.createEntityManager();
		Query qry = manag.createQuery("select count(uq.userid) from questions q,userquiz uq where q.answer = uq.useranswer");  			
		List result1 = qry.getResultList();
		Query qry1 = manag.createQuery("select uq.emailid from questions q,userquiz uq where q.answer = uq.useranswer");  			
		List result2 = qry1.getResultList();
		result2.addAll(result1);
		String s = "Emailid  : " + result2.get(0) + " Score : " + result2.get(1);
		return s;
	}
	
}
