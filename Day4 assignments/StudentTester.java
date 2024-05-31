package com.ey.task4;

import java.util.Date;


public class StudentTester
{
	public static void main(String[]args) {
		Student[] student=new Student[5];
		Student.setAdmissionCounter(10);
		student[0]=new Student("Yash" ,new Date(100,1,7) ,new Integer[] {86,45,67});
		student[0].setGrade();
		student[1]=new Student("Ram"    ,new Date(100,1,14),new Integer[] {45,72,68});
		student[1].setGrade();
		student[2]=new Student("Snigdha",new Date(101,2,14),new Integer[] {51,69,98});
		student[2].setGrade();
		student[3]=new Student("Nabeel",new Date(102,5,6),new Integer[] {96,70,87});
		student[3].setGrade();
		student[4]=new Student("Sivani",new Date(102,2,18),new Integer[] {76,80,87});
		student[4].setGrade();
		StudentService sc=new StudentService();
		sc.displayallStudents(student);
	}
}