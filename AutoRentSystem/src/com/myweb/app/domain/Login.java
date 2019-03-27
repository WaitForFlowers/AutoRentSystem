package com.myweb.app.domain;

public class Login {
 
	private int id;
	private String username;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Login(int id, String username, String date) {
		super();
		this.id = id;
		this.username = username;
		this.date = date;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", date=" + date + "]";
	}

	


	
	
}
