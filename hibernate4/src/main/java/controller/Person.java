package controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private int p_id;
	private String p_name;
	private long p_phno;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public long getP_phno() {
		return p_phno;
	}
	public void setP_phno(long p_phno) {
		this.p_phno = p_phno;
	}
	
	@OneToOne
	Voter v;
	public Voter getV() {
		return v;
	}
	public void setV(Voter v) {
		this.v = v;
	}
	

}
