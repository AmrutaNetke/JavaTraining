package Task2;
//program to find a factorial of a number
public class Program3 {
	int factorial=1;
	public int getFactorial(int num) {
		factorial=factorial*num;
		if(num>1) {
			return getFactorial(num-1);
		}
		return factorial;
	}
	
public static void main(String[] args) {
	Program3 pgm3= new Program3();
	System.out.println("Factorial: "+pgm3.getFactorial(4));
}
}
