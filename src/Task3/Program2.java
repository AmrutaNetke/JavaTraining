package Task3;
 class Parent {
	public void parentMethod() {
		System.out.println("This is parent class");
	}
}

 class Child extends Parent{
	 public void childMethod() {
			System.out.println("This is child class");
		}
}

 public class Program2{
	 public static void main(String[] args) {
	 Parent parent = new Parent();
	 Child child = new Child();
	 Parent parent1 = new Child();
	 parent.parentMethod();
	 child.childMethod();
	 parent1.parentMethod();
	 }
 }