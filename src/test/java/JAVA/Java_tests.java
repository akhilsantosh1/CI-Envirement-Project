package JAVA;

import static org.junit.Assert.*;

import org.junit.Test;

public class Java_tests {
	Perimeter_area junit= new Perimeter_area(); 

	@Test
	public void rectangle_area_test() {
			int result= Perimeter_area.rectangle_area(3,4);
			assertEquals (12,result);
	}
	
	@Test
	public void rectangle_perimetertest() { 
		int result= Perimeter_area.rectangle_perimeter(2,3);
		assertEquals (10,result);
	}
		
	@Test
	public void square_area_test() { 
		int result= Perimeter_area.Square_area(2);
		assertEquals (3,result);
	}
	
	@Test
	public void square_perimeter_test() {
		int result= Perimeter_area.Square_perimeter(4);
		assertEquals (16,result);
	}
}

