package com.ey.day5_q4;

public class EmployeeTester {
	public static void main(String[] args) {
		EmployeeValidator ev= new EmployeeValidator();
		Employee e1=new Employee(1,"Yaswanth","Sai");
		Employee e2=new Employee(2,"ansruta","Snigdha");
		Employee e3=new Employee(3,"Nabeel","baig");
		Employee e4=new Employee(4,"ram","dhanush");
		Employee e5=new Employee(5,"sivani","reddy");
		ev.addemployee(e1);
		ev.addemployee(e2);
		ev.addemployee(e3);
		ev.addemployee(e4);
		ev.addemployee(e5);
		ev.list();
		ev.fnamesort();
	}
}