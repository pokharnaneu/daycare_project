package edu.neu.csye6200.pojo;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student extends Person implements Comparable<Student>{
	
	@Column(name="mother_name")
	private String motherName;
	
	@Column(name="father_name")
	private String fatherName;
	
	@OneToMany(mappedBy="immunization")
	private List<Immunization> immunizationList;
	
	@ManyToOne
	private Classroom classroom;
	
	public Student(int id, String firstName, String lastName, int age, Date registrationDate, String motherName, String fatherName) {
		super(id, firstName, lastName, age, registrationDate);	
		this.motherName = motherName;
		this.fatherName = fatherName;
	}


	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public List<Immunization> getImmunizationList() {
		return immunizationList;
	}

	public void setImmunizationList(List<Immunization> immunizationList) {
		this.immunizationList = immunizationList;
	}

	
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return Integer.compare(this.getId(), student.getId());
	}
	
	
	
	
}
