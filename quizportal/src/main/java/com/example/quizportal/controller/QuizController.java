package com.example.quizportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizportal.entity.Questions;
import com.example.quizportal.entity.Quiz;
import com.example.quizportal.entity.UserQuiz;
import com.example.quizportal.entity.Users;
import com.example.quizportal.service.QuizService;

@RestController
public class QuizController {

	
	@Autowired
	QuizService quizService;
	
	@RequestMapping(value = "admin/{emailid}/{password}",method=RequestMethod.POST)
	public String checkAdminLogin(@PathVariable("emailid") String emailid,@PathVariable("password") String password) {
		if(emailid.equals("admin.quizportal@postman.com") && password.equals("admin@123")) {
			return "Admin logged in successfully";
		}
		else {
			return "Admin Login Failed";
		}
	}
	
		@RequestMapping(value = "Signup",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String Signup(@RequestBody Users u) {
			return quizService.saveUser(u);
		}
		
		@RequestMapping(value = "checkUsersLogin/{emailid}/{password}",method=RequestMethod.POST)
		public String checkUsersLogin(@PathVariable("emailid") String emailid,@PathVariable("password") String password) {
			List<Users> listOfUsers = quizService.getAllUsers();
			Users s = listOfUsers.get(0);
			if(s.equals(emailid) && s.equals(password)) {
				return "User logged in successfully";
			}
			else {
				return "User Not Found";
			}
		}
	
		@RequestMapping(value = "getAllUsers",method=RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
		public List<Users> getAllUsers() {
			return quizService.getAllUsers();
		}
		
		@RequestMapping(value = "addQuestion",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String addQuestion(@RequestBody Questions que) {
			return quizService.addQuestion(que);
		}
		
		@RequestMapping(value = "findquestionsById/{qid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public Questions findQuestionsById(@PathVariable("qid") int id) {
			return quizService.findQuestions(id);
		}
				
		@RequestMapping(value = "createQuiz",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String createQuiz(@RequestBody Quiz qu) {
			return quizService.createQuiz(qu);
		}
		
		@RequestMapping(value = "attemptQuiz",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String attemptQuiz(@RequestBody UserQuiz uq) {
			return quizService.attemptQuiz(uq);
		}
		
		@RequestMapping(value = "checkResults",method=RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String checkResults() {
			return quizService.checkResult();
		}
		
		
		
	
}
