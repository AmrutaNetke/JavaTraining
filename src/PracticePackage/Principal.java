package PracticePackage;

public class Principal{

int age;
String name;
String education;

public Principal(){
age=35;
name="Mr Shaha";
education="M.A.";
}

public Principal(int inputAge,String inputName, String inputEducation){
age=inputAge;
name=inputName;
education=inputEducation;
}

public static void main(String[] args){
Principal pal1= new Principal();
Principal pal2= new Principal(45,"Mr Bajaj","Phd");
System.out.println("Object1");
System.out.println(pal1.age);
System.out.println(pal1.name);
System.out.println(pal1.education);
System.out.println("Object2  parameterized ");
System.out.println(pal2.age);
System.out.println(pal2.name);
System.out.println(pal2.education);
}
}