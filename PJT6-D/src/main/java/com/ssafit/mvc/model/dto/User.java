package com.ssafit.mvc.model.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String id;
	private String email;
	private String password;
	private String nickname;
	private String registDate;
	//0번은 관리자 1번은 일반 2번은 vip 이런식?
	private int grade;
	
	public User() {}
	
	
	public User(String id, String email, String password, String nickname, Date regist_date, int grade) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.registDate = registDate;
		this.grade = grade;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", nickname=" + nickname
				+ ", registDate=" + registDate + ", grade=" + grade + "]";
	}
	
	
}
