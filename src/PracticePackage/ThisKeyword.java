package PracticePackage;

public class ThisKeyword {
//	this can be used to refer current class instance variable.
//	this can be used to invoke current class method (implicitly)
//	this() can be used to invoke current class constructor.
//	this can be passed as an argument in the method call.
//	this can be passed as argument in the constructor call.
//	this can be used to return the current class instance from the method
	int num,num1;
	public ThisKeyword() {
		System.out.println("I am in Default Constructor");                   //this can be used to refer current class instance variable.
	}
	public ThisKeyword(String str) {
		this();                                     //this() can be used to invoke current class constructor.
		System.out.println(str);
	}
	public ThisKeyword(ThisKeyword key) {          //this can be passed as argument in the constructor call.
		key.printValue();
	}
	
	public ThisKeyword assignValue(int num) {
		this.num=num;                          //this can be used to refer current class instance variable.
		num=10;
		System.out.println(this.num);
		System.out.println(num);
		this.printValue();               //	this can be used to invoke current class method 
		this.method3(this);   
		ThisKeyword tk= new ThisKeyword();
		return this;                     //this can be used to return the current class instance from the method
	}
	public void printValue() {
		                                 //this can be used to invoke current class method (implicitly)
		System.out.println("Method called by this reference");
	}
	public void method3(ThisKeyword tk) {
		tk.printValue();
	}
	
	public static void main(String[] args) {
		
		ThisKeyword key= new ThisKeyword("I am in Parameterized constructor");
		ThisKeyword key1=key.assignValue(10);
		key1.printValue();
	
	}
	
}
