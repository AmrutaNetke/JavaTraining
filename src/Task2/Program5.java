package Task2;
//Create a class, constructor, method

public class Program5 {
//	Constructor
public Program5(){
	System.out.println("This is a Constructor");
}
//Method
public void program5() {
	System.out.println("This is a method");
}

public static void main(String[] args) {
	Program5 pgm=new Program5();       //Constructor called on object creation
	pgm.program5();                    //Calling method
}
}
