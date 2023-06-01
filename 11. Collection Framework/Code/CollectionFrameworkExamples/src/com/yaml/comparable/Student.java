package com.yaml.comparable;

public class Student implements Comparable<Student> {
	
	private Integer id;
	private int age;
	private String name;

	public Student() {
		super();
	}

	public Student(Integer id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	//this ~ student
	// this s10 -> [s1]
	// s10 < s1 	| s10 == s1	 | s10 > s1
	// -ve [s10,s1] | 0 => [s1]	 | +ve [s1,s10]
	/*
	public int compareTo(Student student) {
		return this.id < student.id ? -1 : (this.id == student.id ? 0 : 1);
	}
	*/
	
	public int compareTo(Student student) {
		return (this.age - student.age);
	}
	
}
