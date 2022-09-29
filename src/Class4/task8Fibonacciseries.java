package Class4;

import java.util.Scanner;


public class task8Fibonacciseries {

	public static void main(String[] args) {
		
		// Write a Java Program to print the first 10 numbers of Fibonacci series
		
		int n, k;
		
		Scanner arr= new Scanner (System.in);
		
		n=arr.nextInt ();
		arr.close ();
		
		int array[] = new int [n];
		
		array[0]=0;
		array [1]=1;
		for(k=2;k<n;k++)array[k]=array [k-1]+array[k-2];
		
		System.out.println("Nth number in Fibonacci series is " +array[n-1]);
		

	}

}
