package Class3;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * type of casting => data type casting= converting
		 * converting one data type to another
		 */
	
		byte box1=127;  //smallest box
		short box2=3333; //slightly large box
		int box3=4567454; //large box most commonly used
		long box4=4545454;//Slightly large box
		float box5=41454545;//larger box
		double box6=454545456;//largest
		
		
		int number=(int)15.2; //we can't store the decimal number in a box of type doubble
		System.out.println(number);
		
		byte smallerBox=(byte)box2;
		System.out.println(smallerBox);
		
		long box7=box1; //we can do this because box 7 is larger than box1
		
		//as box6 is larger it is double we need type casting to assign the value
		float box8=(float)box6;
		
		
		char a=(char)65;
		System.out.println (a);
		
		
	}

}
