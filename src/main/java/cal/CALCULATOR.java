package cal;
import java.util.Scanner;

public class CALCULATOR {

	public static class Perimeter_area {


		public static void main(String[] args) {
		int l,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the square to check ci");  // Manual input for length of square 
		l =s.nextInt();
		System.out.println("The area and perimeter of square:"); // area and perimeter of square result 
		System.out.println(Square_area(l));
		System.out.println(Square_perimeter(l));
		System.out.println("Enter the length of the rectangle");  //manual input for length of rectangle 
		l =s.nextInt();
		System.out.println("Enter the breadth of the rectangle");  //manual input for breadth of rectangle 
		b =s.nextInt();
		System.out.println("The area and perimeter of rectangle is:");  // area and perimeter of the rectangle result 
		System.out.println(rectangle_area(l,b));
		System.out.println(rectangle_perimeter(l,b));
	}
	}

}
