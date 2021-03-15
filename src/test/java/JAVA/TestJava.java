package JAVA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJava {
	Perimeter_area junit= new Perimeter_area();  

	//JUnit test case for finding Area of rectangle 
	@Test
	public void rectangle_area_test() { 
			int result= Perimeter_area.rectangle_area(3,4);
			assertEquals (12,result);
	}
	
	//JUnit Test case for finding Perimeter of rectangle 
	@Test
	public void rectangle_perimetertest() { 
		int result= Perimeter_area.rectangle_perimeter(2,3);
		assertEquals (10,result);
	}
		
	//JUnit Test case for finding Area of Square
	@Test
	public void square_area_test() { 
		int result= Perimeter_area.Square_area(2);
		assertEquals (4,result);
	}
	
	//JUnit Test case for finding perimeter of the square
	@Test
	public void square_perimeter_test() {
		int result= Perimeter_area.Square_perimeter(4);
		assertEquals (16,result);
	}
}

