package UseCase;

public class Product {
	String rawMaterail;
	String productName;

	Product(String rawMaterail, String productName){
		this.rawMaterail=rawMaterail;
		this.productName=productName;
	}
	public void methodOfProcess() {
		switch(productName) {
		case "Doll":
			System.out.println("Process to develope a Doll");
			break;
		case "Keyboard":
			System.out.println("Process to develope a Keyboard");
			break;
		default:
			System.out.println("Enter correct product name");
		}
	}
	public void packProduct() {
		switch(productName) {
		case "Doll":
			System.out.println("Packed in Cover");
			break;
		case "Keyboard":
			System.out.println("Packed in Box");
			break;
		default:
			System.out.println("Enter correct product name");
		}	
	}
	public static void main(String[] args) {
		Product product= new Product("Cotton","Doll");
		product.methodOfProcess();
		product.packProduct();

	}

}


