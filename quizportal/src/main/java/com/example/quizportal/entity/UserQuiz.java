package com.example.quizportal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "userquiz")
@Table(name = "userquiz")
public class UserQuiz {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	private String emailid;
	private int quizid;
	private int qid;
	private String useranswer;
	
	public UserQuiz() {}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public int getQuizid() {
		return quizid;
	}

	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getUseranswer() {
		return useranswer;
	}

	public void setUseranswer(String useranswer) {
		this.useranswer = useranswer;
	}

	@Override
	public String toString() {
		return "UserQuiz [userid=" + userid + ", emailid=" + emailid + ", quizid=" + quizid + ", qid=" + qid
				+ ", useranswer=" + useranswer + "]";
	}
	
}

