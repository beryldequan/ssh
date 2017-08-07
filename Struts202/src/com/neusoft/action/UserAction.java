package com.neusoft.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private String id;
	private String username;
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute()throws Exception{
		return null;
	}
	public String reg(){
		if(username.equals("")||password.equals(null)){
			return "reginput";
		}
		else{
			return "regsuccess";
		}
	}
	public String login(){
		if(username.equals("admin")&&password.equals("123")){
			return "success";
		}
		else
			return "input";
	}
}
