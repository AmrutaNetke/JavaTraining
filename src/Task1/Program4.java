package Task1;

public class Program4 {
//	Program for function to print Fibonacci series
	
//	method to calculate fibonacii series
public void fibonaciiSeries(int n) {
	int prev=0;
	int next=1;
	System.out.print(prev+" "+next);
	int sum;
	for(int i=1;i<(n-1);i++) {
		sum=prev+next;
		System.out.print(" "+sum);
		prev=next;
		next=sum;
	}
}

	public static void main(String[] args) {
		Program4 pgm= new Program4();
		pgm.fibonaciiSeries(10);
	}
}

