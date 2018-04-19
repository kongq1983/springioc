package com.kq.springioc;
/**
 * TODO
 * @author kongqi
 * @date  2018-04-17 08:36 
 * @since 
 */
public class Student {
	private String id;
	private String name;
	private Teacher teacher;
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
	}
	
	
}
