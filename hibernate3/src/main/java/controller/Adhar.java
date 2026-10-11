package controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adhar {
	
	@Id
	private long a_no;

	public long getA_no() {
		return a_no;
	}

	public void setA_no(long a_no) {
		this.a_no = a_no;
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
