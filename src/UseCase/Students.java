package UseCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Students {
	String studentName;
	int [] arr=new int[6];
	Map<String,List<Object>> map= new HashMap();
	List<Object> li = new ArrayList();
	public Students(String studentName,int[] arr){
		this.arr=arr;
		this.studentName=studentName;
	}

	public void getResult() {
		char grade;
		boolean flag=true;
		for(int eachNumber:arr) {
			if(eachNumber<45) {
				flag=false;
				li.add("Failed");
				map.put(studentName, li);
				break;
			}
		}
		if(flag) {
			int sum=0;
			int average=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
			average= sum/arr.length;
			if(average>=80)
				grade='A';
			else if(average>=60 && average<80)
				grade='B';
			else if(average>=40 && average<60)
				grade='C';
			else
				grade='D';
			li.add(grade);
			li.add(average);
		}
	}
	public void displayResult() {
		map.put(studentName, li);
		for(Map.Entry m :map.entrySet()) {
			System.out.println(m.getKey()+"=> "+m.getValue());
		}

	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of students");
		int count = sc.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter student Name:");
			sc.nextLine();
			String studentName = sc.nextLine();
			int [] subject=new int[6];
			System.out.println("Enter the Subject marks:");
			for(int j=0;j<6;j++) {
				subject[j]=sc.nextInt();
			}
			Students student = new Students(studentName,subject);
			student.getResult();
			student.displayResult();
		}

	} 
}



