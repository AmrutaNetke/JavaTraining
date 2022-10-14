package Task4;
interface AdvancedArithmetic{
	public int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int sum=0;
		if(n<=1000) {
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				sum=sum+i;
			else
				continue;
		}
	}
		return sum;
	}
}

public class Program4 {
public static void main(String[] args) {
	MyCalculator myCal= new MyCalculator();
	System.out.println(myCal.divisor_sum(6));
}
}	
