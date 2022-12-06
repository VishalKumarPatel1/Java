package com.masai;

import java.util.Scanner;

public class Child extends Parent {

	
	@Override
	public void method1() {
		
		// TODO Auto-generated method stub
		System.out.println("Number is: " +getNumber());
		
		System.out.println("I'm inside method 1 of child class");
		
	}
	
	
     //specific
	public void method4() {
		System.out.println("I'm inside method 4 of chlid class");
	}
	
	
	
	
	
	public Child(int y) {
		super(y);
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter number between 1 to 10");
		
		int num=sc.nextInt();
		
        if(num<=10 && num>=1) {
			
//        	Parent ch= new Child(num);
//			ch.method1();
//			ch.method2();
//			ch.method3();
//			ch.method4();//Error
			
			
			Child ch= new Child(num);
			ch.method1();
			ch.method2();
			ch.method3();
			
			
			//downcasting
			
			Child sr=(Child)ch;
			sr.method4();
		}
        
        else {
        	System.out.println("Invalid Number");
        }
		
        
	}
	
	
	
	
	
}
