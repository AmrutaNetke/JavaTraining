package PracticePackage;

public class Parent {
	int parentBalance=50000;
public void balance() {
	System.out.println("Parent balance: "+parentBalance);
}
public static void main(String[] args) {
	Parent parent =new Parent();
	parent.balance();
	
	Child child = new Child();
	child.salary();
	child.balance();
	
	Parent parent1= new Child();
	int total=parent1.parentBalance + child.givenSalary;
	System.out.println("Total Parent balance:"+total);
	}
}

class Child extends Parent{
	int salary=45000;
	int givenSalary=30000;
	public void salary() {
		System.out.println("Child salary:"+salary);
	}
	
}
