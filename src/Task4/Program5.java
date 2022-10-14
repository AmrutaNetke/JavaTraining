package Task4;
class Rectangle1{
		int length, breadth;
		Rectangle1(int length, int breadth){
			this.length=length;
			this.breadth=breadth;
		}
		public void area() {
			System.out.println("Area is:"+length*breadth);
		}
		public void perimeter() {
			System.out.println("perimeter is:"+(2*(length+breadth)));
		}
	}

class Square1 extends Rectangle1{
			public Square1(int s) {
				super(s,s);
			}
	}

public class Program5 {
		public static void main(String[] args) 
		{
		Rectangle1 rect = new Rectangle1(10,20);
		Square1 square= new Square1(10);
		System.out.println("Area and Perimeter of Rectangle is");
		rect.area();
		rect.perimeter();
		System.out.println("Area and Perimeter of Square is");
		square.area();
		square.perimeter();
	}
}
