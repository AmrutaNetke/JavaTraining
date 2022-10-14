package PracticePackage;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int [] arr=new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i=0;i<5;i++) {
		 arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<5;i++) {
		System.out.print(arr[i]+" 1");
		}
	}

}
