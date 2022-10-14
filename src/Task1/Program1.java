package Task1;

public class Program1 {
//	Program 1 Local, Instance and Static variable
	int num=43;                                          //Instance variable
	static char ch ='A';                                  //Static variable
public static void main(String[] args) {
	String str="Java";                                   //Local variable
	System.out.println("Local variable value: " +str);         
	Program1 pgm= new Program1();
	System.out.println("Instance variable value: " +pgm.num);
	System.out.println("Static variable value: " +ch);
}


}
