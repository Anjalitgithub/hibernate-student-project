package com.techpalle.model;
import javax.persistence.*;


@Entity
public class Student {
	@Id
 private int sid;
 private String sname;
 private String scourse;
 private String gender;
 private String email;
 private String education;
public Student(int sid, String sname, String scourse, String gender, String email, String education) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.scourse = scourse;
	this.gender = gender;
	this.email = email;
	this.education = education;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getScourse() {
	return scourse;
}
public void setScourse(String scourse) {
	this.scourse = scourse;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
 
}
