package Task3;
public class Program4 {
	int num;
	public Program4() {
		System.out.println("I am in Default Constructor");                   
	}
	public Program4(String str) {
		this();                           //To invoke current class constructor          
		System.out.println(str);
	}
	
	public Program4(Program4 pgm) {          
		this.printValue();                  //Call methods from constructor
	}
	
	public Program4 assignValue(int num) {
		this.num=num;                         // To access global variable
		num=10;
		System.out.println(this.num);
		System.out.println(num);
		this.printValue();                   //To call non-static methods  
		return this;                     
	}
	
	public void printValue() {
		System.out.println("Method called by this reference");
	}
	
	public static void main(String[] args) {
		Program4 key= new Program4("I am in Parameterized constructor");
		Program4 key1=key.assignValue(30);         //Return object reference from method
		key1.printValue();
	}
}
