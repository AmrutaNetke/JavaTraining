package Temporary;


class Driver {
	static String name;
	static String licence;
	static String mobileNumber;

	public Driver() {
		Driver.name = "Bapu mete";
		Driver.licence = "fourWheeler";
		Driver.mobileNumber = "7350177177";
		System.out.println(name);
		System.out.println(licence);
		System.out.println(mobileNumber);

	}

	public void driver(String name, String mobileNumber, String licence) {
		System.out.println("name of drver is=" + name);
		System.out.println("mobile number of driver=" + mobileNumber);
		System.out.println("licence type =" + licence);
	}

	public void driver(String name) {
		System.out.println("name of drver is=" + name);
	}

	public void driver(String name, String licence) {
		System.out.println("name of drver is=" + name);
		System.out.println("licence type= " + licence);

	}

	public void drive() {
		System.out.println("this is method of driver class");
	}
}

class Car extends Driver {
	static String carName;

	public Car() {
		super();
		Car.carName = "swift";

	}

	public Car(String carName) {
		System.out.println(carName);

	}

	public void getIntoCar() {
		super.drive();
	}

}

interface Work {
	public void repair();

}

abstract class Tools implements Work {
	String tool1;
	String tool2;
	String tool3;

	public void get_Tools() {
		this.tool1 = "Hand Wrenches/Spanners";
		this.tool2 = "Specialty Wrenches";
		this.tool3 = "Pliers";
	}

	public void displayname() {
		System.out.println("tools are: ");
		System.out.println(this.tool1);
		System.out.println(this.tool2);
		System.out.println(this.tool3);
	}
}

public class Repair extends Tools implements Work {

	@Override
	public void repair() {
		System.out.println("this is the method of Work interface");
		System.out
				.println("we repair the car using tool" + super.tool1 + "," + super.tool2 + "," + super.tool3 + "...");

	}

	public static void main(String[] args) {
		Repair repair = new Repair();
		repair.get_Tools();
		repair.displayname();
		repair.repair();
		Car c = new Car();
		c.getIntoCar();
		Car c1 = new Car("Toyota");
		c.driver("breeza");
		c.driver("ertica", "FourWheeler");
		c.driver("vishal balasaheb mete", "9767417572", "HEAVY+FOURWHEELER");

	}

}
