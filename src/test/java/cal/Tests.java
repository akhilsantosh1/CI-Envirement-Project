package cal;

import static org.junit.Assert.*;

import org.junit.Test;

import cal.CALCULATOR.Perimeter_area;

public class Tests {

	CALCULATOR junit= new CALCULATOR(); 

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
		assertEquals (4,result);
	}
	
	@Test
	public void square_perimeter_test() {
		int result= Perimeter_area.Square_perimeter(4);
		assertEquals (16,result);
	}
}

