package Task2;
//program to check a number is a palindrome
public class Program6 {

	public static void main(String[] args) {
    int number=1232;
    int reverse=0,reminder;
    int temp=number;
    while(temp!=0) {
    	reminder=temp%10;
    	reverse=reverse*10+reminder;
    	temp=temp/10;
    }
    if(number==reverse) {
    	System.out.println("Number is palindrome");
    }
    else {
    	System.out.println("Number is not palindrome");
    }
	}

}
