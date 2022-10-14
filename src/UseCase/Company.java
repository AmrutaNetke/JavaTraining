package UseCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
	Map<Integer,List<Project>> mapOfEmployee=new HashMap<Integer,List<Project>>();
	List<Project> list= new ArrayList<Project>();
	public void addToMapOfEmployee(int empId,Project project1,Project Project2) {
		list.add(project1);
		list.add(Project2);
		mapOfEmployee.put(empId,list);
	}
	public void addToMapOfEmployee(int empId,Project project1) {
		list.add(project1);
		mapOfEmployee.put(empId,list);
	}
	public Map<Integer, List<Project>> getFromMap() {
		return mapOfEmployee;
	}

	public void getInformation(int empId) {
		System.out.println("* Name Of Employee: " +this.employeeName);
		System.out.println("* Employee salary: " +this.empSalary);
		System.out.println("* Department: " +this.empDepartment);
		System.out.println("* Project Details:");
		for (Map.Entry<Integer, List<Project>> entry : mapOfEmployee.entrySet()) {
			List<Project> val = entry.getValue();
			int count=1;
			for (Project eachProject : val) {
				System.out.println(count);
				System.out.println("  Project Id: " +eachProject.projectId);
				System.out.println("  Project Name: " +eachProject.projectName);
				System.out.println("  Manager Name: " +eachProject.managerName);
				count++;
			}
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
	Map<String,List<Employee>> mapOfProject=new HashMap<String,List<Employee>>();
	public void addToMapOfProject(String projectId,Employee e1,Employee e2) {
		li.add(e1);
		li.add(e2);
		mapOfProject.put(projectId,li);
	}
	public void addToMapOfProject(String projectId,Employee e1) {
		li.add(e1);
		mapOfProject.put(projectId,li);
	}
	public Map<String, List<Employee>> getFromMap() {
		return mapOfProject;
	}
	public void getInformation(String projectId) {
		System.out.println("* Project ID: " +this.projectId);
		System.out.println("* Name Of Project: " +this.projectName);
		System.out.println("* Manager Name: " +this.managerName);
		System.out.println("* Employee List:");
		for (Entry<String, List<Employee>> entry : mapOfProject.entrySet()) {
			List<Employee> employee = entry.getValue();
			int count=1;
			for (Employee eachEmployee : employee) {
				System.out.println(count);
				System.out.println("  Employee Name: " +eachEmployee.employeeName);
				System.out.println("  Employee ID: " +eachEmployee.empId);
				System.out.println("  Employee Salary: " +eachEmployee.empSalary);
				System.out.println("  Employee Department: " +eachEmployee.empDepartment);
				count++;

			}				
		}

	}
}


public class Company {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Employee1",55000.45,"Department1");
		Employee emp2 = new Employee(102,"Employee2",45000.45,"Department2");

		Project project1= new Project("A001", "Project1", "Manager1");
		Project project2= new Project("B001", "Project2", "Manager2");

		emp1.addToMapOfEmployee(101, project1, project2);
		emp2.addToMapOfEmployee(102, project1);
		project1.addToMapOfProject("A001", emp1);
		project2.addToMapOfProject("B002", emp1);

		System.out.println("Employee1 information=> " );
		emp1.getInformation(101);
		System.out.println("Project 2 information=> ");
		project2.getInformation("A001");
	}

}
