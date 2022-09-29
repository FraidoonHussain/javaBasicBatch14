package Class12;

public class StringDemo {

	public static void main(String[] args) {
		String str=new String("java"); //this is proper way of creating an object
		
		String name = "Java"; //this is a shorter and more simpler way provided by Java creators to make our life easier.
		//Only works for String and wrapper classes.
		/*
		 * Counts the number of characters in a String including the spaces
		 */
		System.out.println(str.length());
		System.out.println(name.length());
		
		
	}

}
