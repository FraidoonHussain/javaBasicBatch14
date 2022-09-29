package class11;

public class Employee {

	String name;
	String id;
	String department;
	double salary;
	String shift;
	
	void work() {
		System.out.println(name+" is working on shift" +shift);
	}
	void takeLeaves () {
		System.out.println(name+" is going on leaves");
	}

}

