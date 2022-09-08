package com.example.quizportal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int quizid;
	private String name;
	private int qid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuizid() {
		return quizid;
	}
	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", quizid=" + quizid + ", name=" + name + ", qid=" + qid + "]";
	}
	
	
	
}
