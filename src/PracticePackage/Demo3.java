package PracticePackage;

public class Demo3 {
public static void main(String[] args) {
	int num=20;
	
	int sum=0;
	
	while(num!=0){
		num=num/2;
		if(num%2!=0) {
		continue;
	}
		sum=sum+num;
	}
		System.out.println("sum is : "+sum);
}
}
