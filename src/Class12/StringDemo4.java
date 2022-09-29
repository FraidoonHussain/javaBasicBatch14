package Class12;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Fraidoon";
		String str2 ="Fraidoon";
		String str3 = new String ("Fraidoon");
		
		if(str.equals(str2)) {
			System.out.println("I found it");
		}
		/*
		 * equals checks if two Strings are exactly the same with exact same case
		 * equalsIgnoreCase checks if two Strings are exactly the same but does not care about the
		 * case of letters
		 */
		if(str.equalsIgnoreCase(str2)) {
			System.out.println("I found it with equalsIgnoreCase");
			}
			
		
		}
		
	}


