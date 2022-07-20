package com.svkp.collections;

public class Student implements Comparable<Student> {
    public int rollno;
    public String name;
    public int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		if(rollno==st.rollno)
			return 0;
		else if(rollno>st.rollno)
			return 1;
		else
			return -1;
	}

}
