package Task5;
class Member {
		String name;
		int age;
		long phoneNumber;
		String address;
		double salary;
		public void printSalary() {
			System.out.println("Salary is " +salary);
		}
	}
	 
	class Employee extends Member{
		int specialization;
		Employee(String name,int age, long phoneNumber, String address, double salary){
			super.name=name;
			super.age=age;
			super.phoneNumber=phoneNumber;
			super.address=address;
			super.salary=salary;
		}
	}

	class Manager extends Member{
		String department;
		Manager(String name,int age, long phoneNumber, String address, double salary){
			super.name=name;
			super.age=age;
			super.phoneNumber=phoneNumber;
			super.address=address;
			super.salary=salary;
		}
	}
	public class Program1 {
		public static void main(String[] args) {

		Employee emp= new Employee("Ram",34,9988776655l,"Surat",50000);
		System.out.println("Name:"+emp.name);
		System.out.println("age:"+emp.age);
		System.out.println("phoneNumber:"+emp.phoneNumber);
		System.out.println("address:"+emp.address);
		System.out.println("salary:"+emp.salary);
		emp.printSalary();
		
		Manager manage= new Manager("Sham",43,9988776650l,"Mumbai",70000);
		System.out.println("Name: "+manage.name);
		System.out.println("age: "+manage.age);
		System.out.println("phoneNumber: "+manage.phoneNumber);
		System.out.println("address: "+manage.address);
		System.out.println("salary: "+manage.salary);
		manage.printSalary();

		}
}
