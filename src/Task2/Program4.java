package Task2;
//program to reverse a string
public class Program4 {

	public static void main(String[] args) {
		String str= "Programing";
		String reverse="";
		System.out.println("Original string is: " +str);
		for(int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reversed string is: " +reverse);
	}

}
