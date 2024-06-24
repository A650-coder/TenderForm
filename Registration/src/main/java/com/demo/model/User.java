package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="userdb")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length=10)
	private int userid;
	@Column(length=15)
	private String fname;
	@Column(length=15)
	private String mname;
	@Column(length=15)
	private String lname;
	@Column(length=40)
	private String fullname;
	@Column(length=15)
	private long mobileno;
	@Column(length=20)
	private String email;
	@Column(length=20)
	private String password;
	@Column(length=20)
	private String confirm_password;
	public User(int userid, String fname, String mname, String lname, String fullname, long mobileno, String email,
			String password, String confirm_password) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.fullname = fullname;
		this.mobileno = mobileno;
		this.email = email;
		this.password = password;
		this.confirm_password = confirm_password;
	}
	public User() {
		super();
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
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
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", fullname="
				+ fullname + ", mobileno=" + mobileno + ", email=" + email + ", password=" + password
				+ ", confirm_password=" + confirm_password + "]";
	}
	


	
}
