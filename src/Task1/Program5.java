package Task1;

public class Program5 {
//	program to print each character in a string.
	
public static void main(String[] args) {
	String str="Java Programming";
	char[] eachChar = str.toCharArray();
	for(int i=0;i<str.length();i++) {
		System.out.println(eachChar[i]);
	}
}
}
