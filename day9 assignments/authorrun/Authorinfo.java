package com.ey.authorrun;

import java.time.LocalDate;
import java.util.List;

import com.ey.authdetails.Author;

import com.ey.authorservies.AuthorService;
import com.ey.authorservies.AuthorServiceImpl;


public class Authorinfo {
	 public static void main(String[] args) {
	        // Create a list of authors
	        List<Author> authorList = List.of(
	                new Author(567675789L, "Sai", "Yash", "Kohli", LocalDate.of(1980, 5, 15), "male", "New York", 9876543210L),
	                new Author(987654321L, "Doe", "Jane", "Smith", LocalDate.of(1985, 8, 20), "female", "Los Angeles", 1234567890L),
	                new Author(666666623L, "Johnson", "Michael", "Brown", LocalDate.of(1975, 3, 10), "male", "Chicago", 6543210987L)
	        );

	        // Create an instance of AuthorServiceImpl
	        //AuthorService authorService = new AuthorServiceImpl();
	        
	        AuthorService authorService=new AuthorServiceImpl();

	        // Test the methods
	        System.out.println("Unique surnames: " + authorService.getUniqueSurnames(authorList));
	        System.out.println("Authors from New York: " + authorService.getAuthorsByCity(authorList, "New York"));
	        System.out.println("Female average age: " + authorService.femaleAverageAge(authorList));
	        System.out.println("Mobile number of author with adhar card 987654321: " + authorService.getMobileByAdhar(authorList, 987654321L));
	    }
	}
