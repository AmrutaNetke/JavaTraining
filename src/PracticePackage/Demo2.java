package PracticePackage;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int [] arr=new int[10];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i=0;i<10;i++) {
		 arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+ " is Even");
			}else {
				System.out.println(arr[i]+ " is Odd");
			}
		}
	}

}
