package com.ey.day6q1;

import java.util.*;

public class Stack {
	Contact[] c = new Contact[5];
	public Stack(Contact[] c) {
		super();
		this.c = c;
	}
	public Stack() {
		// TODO Auto-generated constructor stub
	}
	public boolean push(Contact contact){
		try {
			System.out.println("Stack push");
			int i=0;
			while(this.c[i]!=null ) {
				i++;
			}
			this.c[i]=contact;
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Stack is full");
			return false;
		}
		catch (Exception e) {
	        // Handle other exceptions
	        e.printStackTrace();
	        return false;
	    }
	}
	public Contact pop() {
		try {
			System.out.println("Stack pop");
			int i=0;
			while(this.c[i]!=null) {
				i++;
			}
			i-=1;
			Contact temp = this.c[i];
			this.c[i]=null;
			return temp;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Stack is Empty.");
		}
		catch (Exception e) {
	        // Handle other exceptions
	        e.printStackTrace();
	    }
		return null;
	}
	@Override
	public String toString() {
		return "Stack [c=" + Arrays.toString(c) + "]";
	}
}
