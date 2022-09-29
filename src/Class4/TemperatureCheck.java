package Class4;

public class TemperatureCheck {

	public static void main(String[] args) {
		/*
		 * Create a Java program and name it Temperature Check.
		 * Create variable to store temperature. Your program should check if temperature is
		 * below 32 then it should print out "Water will freeze with temperature", otherwise
		 *"Water will Not freeze with temperature".
		 */
		double temperature=35;
		
		if (temperature <32) {
			System.out.println("Water will freeze with temperature");
		}
		
		else {
			System.out.println("Water will not freeze with temperature");
		}
	}

}
