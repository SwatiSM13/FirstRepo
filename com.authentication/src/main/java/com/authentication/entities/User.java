package com.authentication.entities;
import jakarta.persistence.*;

@Entity
public class User {
	
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String username;
private String password;
private String gender;
private String email;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Long id, String username, String password, String gender, String email) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.gender = gender;
	this.email = email;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
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
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender + ", email="
			+ email + "]";
}
}
