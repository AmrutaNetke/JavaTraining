package Task3;
public class Program1 {
	public void printPersonDetails(int age, long mobileNumber, int employeeId, String address) {
		System.out.println("Person age:" +age);
		System.out.println("Person mobile number: "+mobileNumber);
		System.out.println("Person employ id: "+employeeId);
		System.out.println("Person address: "+address);
	}
	public void printPersonDetails(int age, long mobileNumber, int employeeId, int balance) {
		System.out.println("Person age:" +age);
		System.out.println("Person mobile number: "+mobileNumber);
		System.out.println("Person employ id: "+employeeId);
		System.out.println("Person balance: "+balance);
	}
	public void printPersonDetails(String fatherName, int age, String address) {
		System.out.println("Person father Name:" +fatherName);
		System.out.println("Person age: "+age);
		System.out.println("Person address: "+address);
	}
	
	public static void main(String[] args) {
		Program1 pgm=new Program1();
		System.out.println("Person1:");
		pgm.printPersonDetails(25,9988776655l,101,"Old Colony");
		
		System.out.println("Person2:");
		pgm.printPersonDetails(45,7766554433l,102,75000);
		
		System.out.println("Person3:");
		pgm.printPersonDetails("Mr. Vinay", 55,"New Colony");
	}

}
