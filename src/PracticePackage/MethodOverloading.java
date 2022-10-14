package PracticePackage;

public class MethodOverloading {
	int balance=50000;
	public int card() {
		int deduction=10000;
		return (balance-10000);
		
	}
	public int card(String bank, int cutting) {
		if(bank=="Indian") {
			return (balance-cutting);
		}
		if(bank=="Poland") {
			return (cutting*45);
		}
		else
			return balance;
	}
	
public static void main(String[] args) {
	MethodOverloading mo= new MethodOverloading();
	System.out.println(mo.card());
	System.out.println(mo.card("Indian", 20000));
	System.out.println(mo.card("Poland",500));;
	
	
	
}
}
