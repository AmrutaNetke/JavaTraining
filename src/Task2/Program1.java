package Task2;
//program to calculate multiplication of two numbers using switch condition.

public class Program1 {

	public static void main(String[] args) {
		int a=10;
		int b=35;
		char operation='*';
		switch(operation) {
		case '+':
			System.out.println("Multiplication is: "+(a+b));
			break;
		case '-':
			System.out.println("Multiplication is: "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication is: "+(a*b));
			break;
		case '/':
			System.out.println("Multiplication is: "+(a/b));
			break;
		default:
			System.out.println("Enter valid operator");
		}

	}

}
