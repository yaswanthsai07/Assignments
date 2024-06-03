package com.ey.day5_q3;

import java.util.*;

public class MoviesTester {
	public static void main(String[] args) {
		MoviesValidator mv=new MoviesValidator();
		Movies m1= new Movies("chandama","27-07","ravi","surya",2.30);
		Movies m2= new Movies("rakhi","27-07","bheem","dvv",1.50);
		Movies m3= new Movies("Magadheere","27-07","rahul","ram",2.30);
		Movies m4= new Movies("RRR","27-07","ss.Rajamouli","Raju",2.45);
		mv.addmovie(m1);
		mv.addmovie(m2);
		mv.addmovie(m3);
		mv.addmovie(m4);
		Scanner sc=new Scanner(System.in);
		System.out.println("1-create");
		System.out.println("2-sort by director");
		System.out.println("3-sort by producer");
		System.out.println("enter your choice");
		int a = sc.nextInt();
		if (a==1) {
			System.out.println("enter the movie name");
			String s1=sc.next();
			System.out.println("enter the movie date");
			String s2=sc.next();
			System.out.println("enter the movie director name");
			String s3=sc.next();
			System.out.println("enter the movie producer name");
			String s4=sc.next();
			System.out.println("enter the movie duration");
			Double d1=sc.nextDouble();
			Movies m= new Movies(s1,s2,s3,s4,d1);
			mv.addmovie(m);
			mv.list();
		}
		else if (a==2) {
			mv.directorsort();
		}
		else if (a==3) {
			mv.producersort();
		}
	}


}
