package edu.neu.csye6200.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher extends Person implements Comparable<Teacher> {
	
	@Column(name="assigned")
	private boolean assigned; // true: teacher is assigned already, false: teacher is free to be assigned to a student
	
	@ManyToOne
	private Classroom classroom;
	
	public Teacher(int id, String firstName, String lastName, int age, Date registrationDate) {
		super(id, firstName, lastName, age, registrationDate);
	}

	public boolean isAssigned() {
		return assigned;
	}

	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}

	@Override
	public int compareTo(Teacher teacher) {
		// TODO Auto-generated method stub
		return Integer.compare(this.getId(), teacher.getId());
	}
	
	
	
}
