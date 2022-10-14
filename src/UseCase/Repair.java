package UseCase;
class Driver {
	String driverName;
	String license;
	String mobile;
	Driver(){
		driverName="Kumar";
		license="MH 347532";
		mobile="8877665544";
	}
	Driver(String name){
		this.driverName=name;
	}
	Driver(String name,String license){
		this.driverName=name;
		this.license=license;
	}
	Driver(String name,String license,String mobile){
		this.driverName=name;
		this.license=license;
		this.mobile=mobile;
	}
	public void drive() {
		System.out.println("Drive method of Car ");
	}	
}

class Car extends Driver{
	String carName;
	Car(){
		super();                   
		this.carName="Tata";	
	}
	Car(String carName,String driverName){
		super();  
		this.carName=carName;
	}
	Car(String carName,String driverName, String license){
		super(driverName,license);
		this.carName=carName;	
	}
	Car(String carName,String driverName, String license, String mobile){
		super(driverName,license,mobile);
		this.carName=carName;	
	}
	public void getIntoCar() {
		super.drive();
	}
}

abstract class Tools{
	public static void getTools(String carName){
		switch(carName)	{
		case "Thar": System.out.println("Tools for Thar");
		break;
		case "Maruti": System.out.println("Tools for Maruti");
		break;
		default: System.out.println("Toos for Tata");
		}
	}
}

interface Work{
	public void repair();

}
public class Repair extends Car implements Work {
	Repair(){
		super();
	}

	Repair(String carName, String driverName){
		super(carName,driverName);
	}
	Repair(String carName, String driverName, String license){
		super(carName,driverName,license);
	}
	Repair(String carName, String driverName, String license, String mobile){
		super(carName,driverName,license,mobile);
	}

	@Override
	public void repair() {
		Tools.getTools(carName);
		System.out.println("Car has been repaired");
	}
	public static void main(String[] args) {
		Repair repair1 = new Repair();
		
		System.out.println("Car Name: "+ repair1.carName);
		System.out.println("Car Driver Name: "+repair1.driverName);
		System.out.println("License Number: "+repair1.license);
		System.out.println("Mobile number: "+repair1.mobile);
		repair1.repair();
		repair1.getIntoCar();                   
		
		System.out.println("*****************");

		Repair repair2 = new Repair("Thar","Amar","MH30 7645");
		System.out.println("Car Name: "+ repair2.carName);
		System.out.println("Car Driver Name: "+repair2.driverName);
		System.out.println("License Number: "+repair2.license);
		repair2.repair();
		repair2.getIntoCar();
		
		System.out.println("*****************");

		Repair repair3 = new Repair("Maruti","Amit","MH29 8945","9999999999");
		System.out.println("Car Name: "+ repair3.carName);
		System.out.println("Car Driver Name: "+repair3.driverName);
		System.out.println("License Number: "+repair3.license);
		System.out.println("Mobile number: "+repair3.mobile);
		repair3.repair();
		repair3.getIntoCar();


	}
}



