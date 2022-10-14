package Temporary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import UseCase.Employee;

class Employee{
	int empId;
	String employeeName;
	double empSalary;
	String empDepartment;

	Employee(int empId,String employeeName,double empSalary,String empDepartment){
		this.empId=empId;
		this.employeeName=employeeName;
		this.empSalary=empSalary;
		this.empDepartment=empDepartment;
	}
	List<Project> listOfProject= new ArrayList<Project>();
	public void addToList(Project project1) {
		listOfProject.add(project1);
	}
	public void addToProjectList(Project project1,Project project2) {
		listOfProject.add(project1);
		listOfProject.add(project2);
	}
	public List<Project> getFromProjectList() {
		return listOfProject;
	}
public void getInformation() {
	System.out.println("* Name Of Employee: " +this.employeeName);
	System.out.println("* Employee salary: " +this.empSalary);
	System.out.println("* Department: " +this.empDepartment);
	System.out.println("* Project Details:");
	List<Project> list = this.getFromProjectList();
	for (Project project : list) {
		System.out.println();
	}
}
}

class Project{
	String projectId;
	String projectName;
	String managerName;
	List<Employee> li= new ArrayList<Employee>();

	Project(String projectId, String projectName, String managerName){
		this.projectId=projectId;
		this.projectName=projectName;
		this.managerName=managerName;
	}
	
	List<Project> listOfEmployee= new ArrayList<Project>();
	public void addToList(Project project1) {
		listOfEmployee.add(project1);
	}
	public void addToList(Project project1,Project project2) {
		listOfEmployee.add(project1);
		listOfEmployee.add(project2);
	}

	
	
}
















public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
