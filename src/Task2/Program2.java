package Task2;
//program to print only odd values in a array.
public class Program2 {
public static void main(String[] args) {
	int [] arr= {37,56,23,69,52,97};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			System.out.println(arr[i]);
		}
		}
	}
}
