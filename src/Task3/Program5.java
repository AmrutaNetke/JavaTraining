package Task3;

abstract class  Bank{
	public abstract void getBalance();
}

class BankA extends Bank{
	String deposit="$100";
	@Override
	public void getBalance() {
		System.out.println("Deposit of Bank A is: "+deposit);		
	}
	
}
class BankB extends Bank{
	String deposit="$200";
	@Override
	public void getBalance() {
		System.out.println("Deposit of Bank A is: "+deposit);		
	}
	
}
class BankC extends Bank{
	String deposit="$300";
	@Override
	public void getBalance() {
		System.out.println("Deposit of Bank A is: "+deposit);		
	}
	
}
public class Program5 {

	public static void main(String[] args) {
		BankA bankA= new BankA();
		bankA.getBalance();
		BankB bankB= new BankB();
		bankB.getBalance();
		BankC bankC= new BankC();
		bankC.getBalance();
	}

}
