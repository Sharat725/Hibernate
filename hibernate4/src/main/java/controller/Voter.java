package controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Voter {
	
	@Id
	private String v_id;

	public String getV_id() {
		return v_id;
	}

	public void setV_id(String v_id) {
		this.v_id = v_id;
	}
	
	@OneToOne
	Person p;

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}
	

}
