package controller;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Trainer {

	@Id
	private int t_id;
	private String i_name;
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	
	@OneToMany
	List<Student> l1;
	public List<Student> getL1() {
		return l1;
	}
	public void setL1(List<Student> l1) {
		this.l1 = l1;
	}
	
}
