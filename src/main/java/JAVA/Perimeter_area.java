package JAVA;

import java.util.Scanner;

public class Perimeter_area {
	static int Square_area(int l)  //calculates and returns the area of Square
	{
		return(1*l);
	}
	
	static int Square_perimeter(int l) //calculates and returns the Perimeter of Square
	{
		return(4*l);
	}
	
	static int rectangle_perimeter(int l,int b) //calculates and returns the perimeter of rectangle 
	{
		return(2*(l+b));
	}
	
	static int rectangle_area(int l,int b)   //calculates and returns the area of rectangle 
	{
		return(l*b);
	}

	public static void main(String[] args) {
	int l,b;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the length of the square");  // Manual input for length of square 
	l =s.nextInt();
	System.out.println("The area and perimeter of square is:"); // area and perimeter of square result 
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
