package edu.neu.csye6200.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="classroom")
public class Classroom {
	
	@Column(name="id")
	private int id;
	
	@Column(name="capacity")
	private int capacity; 
	
	@OneToOne(fetch = FetchType.LAZY) //not sure how to represent this in4 Agecategory
	private AgeCategory category;
	
	@OneToMany(mappedBy="teacher")
	private List<Teacher> teachers;
	
	@OneToMany(mappedBy="student")
	private List<Student> students;
	
	@Column(name="max_group_size")
	private int maxGroupSize;
	
	@Column(name="classroom_full")
	private boolean classroomFull; //is the classroom full?
	
	public Classroom(int id, int capacity, AgeCategory category, List<Teacher> teachers, List<Student> students,
			int maxGroupSize, boolean classroomFull) {
		super();
		this.id = id;
		this.capacity = capacity;
		this.category = category;
		this.teachers = teachers;
		this.students = students;
		this.maxGroupSize = maxGroupSize;
		this.classroomFull = classroomFull;
	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public AgeCategory getCategory() {
		return category;
	}
	public void setCategory(AgeCategory category) {
		this.category = category;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getMaxGroupSize() {
		return maxGroupSize;
	}
	public void setMaxGroupSize(int maxGroupSize) {
		this.maxGroupSize = maxGroupSize;
	}
	public boolean isClassroomFull() {
		return classroomFull;
	}
	public void setClassroomFull(boolean classroomFull) {
		this.classroomFull = classroomFull;
	}
	
	
	
}
