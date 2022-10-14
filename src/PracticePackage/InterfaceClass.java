package PracticePackage;
interface Vehicle{
	public void engineStructure();
	static void sittingStructure() {
		System.out.println("Sitting structure for car is same");
	}
	
}
class Tigor implements Vehicle{
	public void engineStructure() {
		System.out.println("Ingine Structor for Tigor car");
	}
}

class Thar implements Vehicle{
	public void engineStructure() {
		System.out.println("Ingine Structor for Thar car");
	}

}
public class InterfaceClass {
public static void main(String[] args) {
	Tigor tig = new Tigor();
	tig.engineStructure();
	Vehicle.sittingStructure();
	
	Thar thar = new Thar();
	thar.engineStructure();
	Vehicle.sittingStructure();
	
}
}
