package PracticePackage;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextFilePractice {
public static void main(String[] args) throws FileNotFoundException {
	File file = new File("E:\\ExcelFolder\\SampleFile.txt");
//	method1
//	if(file.exists())
//		System.out.println("File exist");
//	else
//		System.out.println("File doesnt exist");
//	method2
//	if(file.isDirectory())
//		System.out.println("It is directory ie Folder");
	
//	method3
//	System.out.println(file.getAbsolutePath());
	
//	method4
//	System.out.println(file.getName());
	
//	method 5
//	System.out.println(file.length());
	
//	method6
//	file.mkdir();
	
//  To read data
	String str = null;
	Scanner sc = new Scanner(file);
	if(sc.hasNextLine()) {
		str=sc.nextLine();
	}
//To open file
//	try {
//	if(!Desktop.isDesktopSupported()) {
//		System.out.println("Not supported");
//		return;
//	}
//	Desktop desktop= Desktop.getDesktop();
//	if(file.exists()) {
//		desktop.open(file);
//	}
//	}catch(Exception e) {
//		e.printStackTrace();
//	}
	
//	To write into file but earlier data will get vanish
//	try {
//		FileWriter fileWriter = new FileWriter(file);
//		fileWriter.append(" Welcome back");
//		fileWriter.close();
//		System.out.println("Scuccess");
//	}catch(Exception e) {
//		e.printStackTrace();
//	}
	
	try {
		FileWriter fWriter= new FileWriter(file);
		BufferedWriter bufferWriter=new BufferedWriter(fWriter);
		bufferWriter.write(" New String Added");
		bufferWriter.close();
		System.out.println("Success");
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
}
