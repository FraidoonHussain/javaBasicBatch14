package class11;

public class Dog {

	//a class has state
	//attributes or properties or fields
	String name;
	String color;
	String breed;
	int age;
	double weight;
	
	//These are the behavior of a dog
	//these behaviors also have other names, Methods or functions but in Java its called methods.
	void bark () {
		System.out.println("Dog is barking");
	}
	
	void sleep () {
		System.out.println("Dog is sleeping");
	
	}
	public static void main(String[] args) {
		//new Dog (); --> it creates an object of class Dog
	Dog dog1 = new Dog (); // this is creating object from a class
	dog1.bark();	//this is calling a behavior on an object
	dog1.sleep();
	}

}
