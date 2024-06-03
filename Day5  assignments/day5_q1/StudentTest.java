package com.ey.day5_q1;

public class StudentTest {
	public static void main(String[] args) {
		StudentService ss= new StudentService();
		Address a1=new Address("Guntur");
		Student s1=new Student("sai","Yash",a1);
		System.out.println(ss.addProduct(s1));
		Address a2=new Address("hyd");
		Student s2=new Student("ansruta","Snigdha",a2);
		System.out.println(ss.addProduct(s2));

		ss.listStudents();
		System.out.println(ss.isvalidStudent(s1, s2));
	}

}