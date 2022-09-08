package com.example.quizportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizportal.dao.QuizDao;
import com.example.quizportal.entity.Questions;
import com.example.quizportal.entity.Quiz;
import com.example.quizportal.entity.UserQuiz;
import com.example.quizportal.entity.Users;

@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;
	
	public String saveUser(Users u) {
		if(quizDao.UserSignup(u) > 0) {
			return "User Registered Successfully";
		}
		else {
			return "User Is Not Registered";
		}
	}
	
	public List<Users> getAllUsers() {
		return quizDao.userLogin();
		}
	
	
	public String addQuestion(Questions q) {
		if(quizDao.addQuestion(q) > 0) {
			return "Question added Successfully";
		}
		else {
			return "Error in adding Questions";
		}
	}
	
	public Questions findQuestions(int qid) {
		return quizDao.findQuestions(qid);
	}
	
	
	public String createQuiz(Quiz qu) {
		if(quizDao.createQuiz(qu) > 0) {
			return "Quiz created Successfully";
		}
		else {
			return "Error in Creating Quiz";
		}
	}
	
	
	public String attemptQuiz(UserQuiz uq) {
		if(quizDao.attemptQuiz(uq) > 0) {
			return "UserQuiz created Successfully";
		}
		else {
			return "Error in Creating userQuiz";
		}
	}
	
	public String checkResult() {
		return quizDao.Results();
		}
	
	
	
}