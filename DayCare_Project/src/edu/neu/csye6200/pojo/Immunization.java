package edu.neu.csye6200.pojo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="immunization")
public class Immunization {
	
	@ManyToOne
	private Student student;
	
}
