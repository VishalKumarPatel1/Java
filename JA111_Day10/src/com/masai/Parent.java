package com.masai;



public  class Parent {

   final int Number;
   
   public  void method1() {
	   System.out.println("inside method 1 of Parent 2");
   }
   
   
   public final void method2() {
	   
	   //System.out.println();
	   
	   System.out.println("I'm inside method 2 of parent");
	   
   }
   
   
   public final void method3() {
	   
	   System.out.println("I'm inside method 3 of parent");
   }
   

public int getNumber() {
	return this.Number;
}



  public Parent(int y) {
	  Number=y;
  }
   
   
   
   
	 
}
