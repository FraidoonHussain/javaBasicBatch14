package Class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName ="Fraidoon";
		String lastName = "Hussain";
		System.out.println(firstName+lastName); // this is used more
		System.out.println(firstName.concat(lastName));
		
		String str =" ";
		/*
		 * isEmpty() returns true if a String is empty this method will return false even if you have a space
		 * in a String variable however the isBlank method does not count the spaces
		 */
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		
	}

}
