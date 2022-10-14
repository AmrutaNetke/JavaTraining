package Task4;

class Shape{
	public void printShape() {
		System.out.println("This is This is shape");
	}
}

class Rectange extends Shape{
	public void printShape() {
		super.printShape();
		System.out.println("This is rectangular shape");
	}
}

class Circle extends Shape{
	public void printShape() {
		System.out.println("This is circular shape");
	}
}

class Square extends Rectange{
	public void printShape() {
		super.printShape();
		System.out.println("Square is a rectangle");
	}
}

public class Program2 {
	public static void main(String[] args) {
	Square square = new Square();
	square.printShape();
}
}
