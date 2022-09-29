package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is just 1 example of non primitive data type
		
		String name="Fraidoon";
		String address="1234 address street";
		String phone="123 456 7890";
		
		int age=17;
		//String age="17", //anything you put inside the "" becomes String
		
		//ctr+space -> auto completes the statement
		//Syso +ctlr +space 
		
		System.out.println(name);
		
		// "My name is" + Fraidoon  //to concatenate 2 Strings together we use +
		
		System.out.println("My name is " +name);
		
		//Fraidoon is 17
		
		System.out.println(name + " is "+ age);
		
		String fruit ="apple";
		double price=1.99;
		
		//The price of the apple is 1.99
		
		
		fruit="mango";
		price=5.99;
				
		System.out.println("The price of the "+fruit+" is "+price);
		
		
		/*to attach any value (int, double, boolean, char, String etc)
		 * to a String we use +
		 * + next to the String acts as Concatenation
		 */
		
		
		
		
		
		
		
	}

}
