package com.collections.comparable;

import java.util.Objects;

public class Student {
	int id;
	String name;
	Student(){
		
	}
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public int hashCode(){
		return id+name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(this== obj) {
			return true;
		}
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return this.id==s.id && Objects.equals(this.name, s.name);
		}return false;
	}
	@Override
	public String toString() {
		return id+" "+name;
	}

}
