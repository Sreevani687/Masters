package com.Sample;

public class Student {
	private int id;
	private String name;
	private String departmentName;

	public Student(int id, String name, String departmentName) {
		super();
		this.id = id;
		this.name = name;
		this.departmentName = departmentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", departmentName=" + departmentName + "]";
	}
	

}
