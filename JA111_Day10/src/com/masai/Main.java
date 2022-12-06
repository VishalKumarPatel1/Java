package com.masai;

public class Main {

	
	
	
	public static Person generatePerson(Person person) {
		
		
			return person;
		
		
	}
	
	
	public static void main(String[] args) {


		Person newStudent = generatePerson(new Student());
		
		Person newInstructor = generatePerson(new Instructor());
		
		System.out.println(newStudent);
		System.out.println(newInstructor);
		
		

	}

}
