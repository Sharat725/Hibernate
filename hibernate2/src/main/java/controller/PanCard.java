package controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PanCard {
	@Id
	private String pan_no;

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
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
