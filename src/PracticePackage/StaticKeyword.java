package PracticePackage;

public class StaticKeyword {
	static{
		System.out.println("Static block");
	}
	static class NestedClass{
	static int a=10;
	int b=20;
	}
public static void main(String[] args) {
	System.out.println(StaticKeyword.NestedClass.a);
	NestedClass nc= new NestedClass();
	System.out.println(nc.b);
}
}
