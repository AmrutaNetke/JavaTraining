package UseCase;

interface Colony{
	public void maintenanceOfHome(Home home);
}
class Home implements Colony{
	String address;
	String homeOwner;
	int bedroom;
	Home(String homeOwner,String address,int bedroom){
		this.homeOwner=homeOwner;
		this.address= address;
		this.bedroom=bedroom;
	}
	@Override
	public void maintenanceOfHome(Home home) {
		System.out.println("Maintenance of " +home.homeOwner +"'s Home");
	}
}
class Child extends Home{
	private static int bedroom;
	String childName;
	Child(String childName,Home home)
	{
		super(home.homeOwner, home.address, home.bedroom);
		this.childName=childName;
	}

}

public class UseCase5 {
	public static void main(String[] args) {
		Home home1= new Home("Mr Shaha", "Ring road,Colony1,Pune", 5);
		
		Child child1OfHome1 = new Child("ram",home1);
		System.out.println("For "+child1OfHome1.childName+" of Home1");
		child1OfHome1.maintenanceOfHome(home1);
		
		Child child2OfHome1= new Child("Sham",home1);
		System.out.println("For "+child2OfHome1.childName+" of Home1");
		child2OfHome1.maintenanceOfHome(home1);

		Home home2= new Home("Mr Oberoy", "Ring road, Colony1,Pune", 5);
		
		Child child1OfHome2= new Child("Seeta",home2);
		System.out.println("For child1 of Home2");
		child1OfHome2.maintenanceOfHome(home2);
	}
}
