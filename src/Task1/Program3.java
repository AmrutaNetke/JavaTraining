package Task1;

public class Program3 {
//	Program static function to print even numbers from 1- 50 numbers. 
	
	public static void printEvenNumbers(int number) {
		for(int i=1;i<number;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Event numbers from 1-50 are: ");
		printEvenNumbers(50);
	}

}
