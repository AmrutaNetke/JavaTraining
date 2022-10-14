package PracticePackage;
abstract class Car{
	public abstract void repair();
	public abstract void toolUsed();	
}
class Suzuki extends Car{
	public void repair() {
		System.out.println("Reparing type is of  Suzuki car");
	}
	public void toolUsed() {
		System.out.println("Tools used are SuzukiTool1, SuzukiTool2");
	}
	
}
class Tata extends Car{
	public void repair() {
		System.out.println("Reparing type is of  Tata car");
	}
	public void toolUsed() {
		System.out.println("Tools used are TataTool1, TataTool2");
	}
	
}
public class AbstractClass {
	public static void main(String[] args) {
	Suzuki suzu = new Suzuki();
	suzu.repair();
	suzu.toolUsed();
	
	Tata tata = new Tata();
	tata.repair();
	tata.toolUsed();
}
}
