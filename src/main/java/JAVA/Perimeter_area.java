package JAVA;

import java.util.Scanner;

public class Perimeter_area {
	static int Square_area(int l)
	{
		return(l*l);
	}
	
	static int Square_perimeter(int l)
	{
		return(4*l);
	}
	
	static int rectangle_perimeter(int l,int b)
	{
		return(2*(l+b));
	}
	
	static int rectangle_area(int l,int b)
	{
		return(l*b);
	}

	public static void main(String[] args) {
	int l,b;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the length of the square");
	l =s.nextInt();
	System.out.println("The area and perimeter of square is:");
	System.out.println(Square_area(l));
	System.out.println(Square_perimeter(l));
	System.out.println("Enter the length of the rectangle");
	l =s.nextInt();
	System.out.println("Enter the breadth of the rectangle");
	b =s.nextInt();
	System.out.println("The area and perimeter of rectangle is:");
	System.out.println(rectangle_area(l,b));
	System.out.println(rectangle_perimeter(l,b));
}
}
