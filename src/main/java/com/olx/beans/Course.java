package com.olx.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {


	
	private long courseId;
	private String courseName;
	private Set<Student> students = new HashSet<Student>();

	public Course() {}

	public Course(String courseName) {
			this.courseName = courseName;
		}

	public Course(String courseName, Set<Student> students) {
			this.courseName = courseName;
			this.students = students;
		}

	@Id
	@GeneratedValue
	@Column(name = "c_id")
	public long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student", joinColumns = { @JoinColumn(name = "c_id") }, inverseJoinColumns = {
			@JoinColumn(name = "s_id") })
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}



}
