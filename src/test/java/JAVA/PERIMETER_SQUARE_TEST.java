package JAVA;

import static org.junit.Assert.*;

import org.junit.Test;

public class PERIMETER_SQUARE_TEST {

	@Test
	public void square_perimeter_test() {
		Perimeter_area junit= new Perimeter_area(); 
		int result= Perimeter_area.Square_perimeter(4);
		assertEquals (16,result);
	}

}
