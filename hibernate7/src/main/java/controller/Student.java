package controller;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int std_id;
	private String std_name;
	private char std_sec;
	
	
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public char getStd_sec() {
		return std_sec;
	}
	public void setStd_sec(char std_sec) {
		this.std_sec = std_sec;
	}
	
	
	@ManyToMany
	List<Course> l;


	public List<Course> getL() {
		return l;
	}
	public void setL(List<Course> l) {
		this.l = l;
	}
	

}
