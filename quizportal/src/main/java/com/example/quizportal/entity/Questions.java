package com.example.quizportal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "questions")
public class Questions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int qid;
	private String question;
	private String opt1;
	private String opt2;
	private String opt3;
	private String answer;
	
	
	public Questions() {}

	public int getQid() {
		return qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOpt1() {
		return opt1;
	}

	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}

	public String getOpt2() {
		return opt2;
	}

	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}

	public String getOpt3() {
		return opt3;
	}

	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	@Override
	public String toString() {
		return "Questions [qid=" + qid + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3="
				+ opt3 + ", answer=" + answer + "]";
	}
	
	
}


