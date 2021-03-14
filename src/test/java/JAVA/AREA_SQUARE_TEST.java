package JAVA;

import static org.junit.Assert.*;

import org.junit.Test;

public class AREA_SQUARE_TEST {

	@Test
	public void square_area_test() {
		Perimeter_area junit= new Perimeter_area(); 
		int result= Perimeter_area.Square_area(2);
		assertEquals (4,result);
}
}
