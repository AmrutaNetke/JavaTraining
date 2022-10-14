package Assignment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program1 {
		public static void main(String[] args) throws FileNotFoundException {
				String str="";
				File file= new File("FilesForTesting\\SampleFile.txt");
				if(file.exists())
					System.out.println("File exists");
				else
					System.out.println("Doent exists");
				
				Scanner sc= new Scanner(file);
				if(sc.hasNextLine()) {
				str=sc.nextLine();
				}
				sc.close();
				String[] words = str.split(" ");
				int count=0;
				for(String eachWord:words) {
					if(eachWord.contains("is"))
						count++;
				}
				System.out.println("Data in file is=> "+str);
				System.out.println("is combination reapeated for "+ count +" times");
		}
		}