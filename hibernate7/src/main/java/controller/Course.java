package controller;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	private int c_id;
	private String c_name;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	@ManyToMany
	List<Student> ll;
	public List<Student> getLl() {
		return ll;
	}
	public void setLl(List<Student> ll) {
		this.ll = ll;
	}
	
	

}
