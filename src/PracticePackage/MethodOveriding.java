package PracticePackage;
class Builder{
//	Builder(){
//		System.out.println("Constructed Home");
//	}
	public void construction() {
		System.out.println("Construction service");
	}
	public void maintenance() {
		System.out.println("Maintenance of Home");
	}
	
}
class Maintenance extends Builder{
//	Maintenance(){
//		super();
//		System.out.println("Construction is of Villa type");
//	}
	public void construction() {
		super.construction();
		System.out.println("Construction is of villa type");
	}
	public void maintenance() {
		super.maintenance();
		System.out.println("electricity maintenance is  provided");
		System.out.println("Plumbing maintenance is provided");
	}
}
public class MethodOveriding {
	public static void main(String[] args) {
	Maintenance mainten= new Maintenance();
	mainten.construction();
	mainten.maintenance();
}
}