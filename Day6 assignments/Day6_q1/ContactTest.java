package com.ey.day6q1;

import java.util.*;

import java.time.LocalDate;
import java.util.Date;

public class ContactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c = new Contact("s","yash","sai",LocalDate.of(2002, 02, 07),"male","9898987878");
		Contact c1 = new Contact("b","manu","uu",LocalDate.of(2002, 07, 24),"female","636578932");
		Stack s=new Stack();
		s.push(c);
		System.out.println(s.pop());
		s.push(c);
		for(int i=0;i<5;i++) {
			s.push(c1);
		}
		System.out.println(s);
	}
}
