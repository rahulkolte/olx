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
@Table(name = "student")
public class Student {

	private long studentId;
	private String studentName;
	private Set<Course> courses = new HashSet<Course>();

	public Student() {
	}

	public Student(String studentName) {
		this.studentName = studentName;
	}

	public Student(String studentName, Set<Course> courses) {
		this.studentName = studentName;
		this.courses = courses;
	}

	@Id
	@GeneratedValue
	@Column(name = "s_id")
	public long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course", joinColumns = { @JoinColumn(name = "s_id") }, inverseJoinColumns = {
			@JoinColumn(name = "c_id") })
	public Set<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}