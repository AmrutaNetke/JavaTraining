package PracticePackage;

public class Demo1 {
public static void main(String[] args) {
	String str=" We are revising the concepts of core java";
	
	System.out.println("Upper case "+str.toUpperCase());
	System.out.println("Lower case case "+str.toUpperCase());
	
	String str2="Concatinated string";
	System.out.println("Concatination: "+str.concat(str2));
	
	String[] words = str.split(" ");
	for(int i=0;i<words.length;i++) {
		System.out.println(words[i]);
	}
	
	System.out.println("Substring:"+str.substring(4));
	System.out.println("Substring method2:"+str.substring(1,4));
	
	System.out.println("Length of string:"+ str.length());
	
	String str3="CONCATINATED string";
	System.out.println("Equality "+str2.equals(str3));
	
	System.out.println("Ignoring case "+str2.equalsIgnoreCase(str3));

	char[] ch = str3.toCharArray();
	for(int i=0;i<ch.length;i++) {
		System.out.print(ch[i]+" ");
	}
	
	System.out.println();
	
	System.out.println("charAT "+str.charAt(5));
	
	System.out.println("Trim method: "+str.trim());
	
	System.out.println("Contains "+str.contains("We"));
	
	System.out.println("Replace: "+str.replace('W', 'Z'));
}
}





//We are revising the concepts of core java\n
//toUpper
//tolower
//concat
//split
//substring
//length
//equals
//equalIgnoreCase
//toCharArray
//charAt
//trim
//contains
//
//B
//08:11 AM
//Ba