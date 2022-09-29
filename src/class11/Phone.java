package class11;

public class Phone {

	String color;
	String model;
	String make;
	int size;
	boolean batterylife;

	void call() {
		System.out.println("Please answer the phone.....");
	}

	void textmessage() {
		System.out.println("Siri send a text message");
	}

	public static void main(String[] args) {

		Phone iphone = new Phone();
		iphone.color = "White";
		iphone.model = "14 pro";
		iphone.size = 128;
		iphone.batterylife = true;
		iphone.make = "Apple";

	}

}
