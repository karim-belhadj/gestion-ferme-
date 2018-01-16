package com.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name = "loginmodels")
public class LoginModel {

   @Id
	private int idlog;
	private String login;
	private String pwd;
	private int role;

	
	public int getIdlog() {
		return idlog;
	}

	public void setIdlog(int idlog) {
		this.idlog = idlog;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public LoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public LoginModel(int idlog, String login, String pwd, int role) {
		super();
		this.idlog = idlog;
		this.login = login;
		this.pwd = pwd;
		this.role = role;
	}

	@Override
	public String toString() {
		return "LoginModel [idlog=" + idlog + ", login=" + login + ", pwd="
				+ pwd + ", role=" + role + "]";
	}

	

}
