package Class4;

public class moreIfElsePractice4 {

	public static void main(String[] args) {
		
		/*Create a Java program and declare int
		 * Variable that will hold a week. Based on the value of 
		 * the variable your program should print the name of the week.
		 
	*/
		int week =2;
		
		if (week ==1) 
		{
			System.out.println("Monday");
		}
		else if(week==2)
		{
			System.out.println("Tuesday");
		}
	
		
		int[] x = {23,45,9,91,33};
		
		System.out.println(x[3]);
		
		String [] Weekdays = {"Monday","Tuesday","Wednesday","Thursday","Fraiday","Saturday","Sunday"};
		
		System.out.println(Weekdays.length);
		
		int index = 0; // created an int variable named index with the value of 0
		/*
		while (index < Weekdays.length) { // while loop with if condition index value is less than Weekdays.lenght value
			
			System.out.println(Weekdays[index]); //print out Weekdays with the current value of index variable
			
			index = index + 2; //increase value of index by 1
		}
		*/
		
		for (index=2; index <= x.length-3; index++) { 
			
			System.out.println(Weekdays[index]);
		}
		

		
	
		

		
	}

}
