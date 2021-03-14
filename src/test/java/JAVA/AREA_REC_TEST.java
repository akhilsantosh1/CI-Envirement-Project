package JAVA;

import static org.junit.Assert.*;

import org.junit.Test;

public class AREA_REC_TEST {

	@Test
	public void rectangle_area_test() {
			Perimeter_area junit= new Perimeter_area(); 
			int result= Perimeter_area.rectangle_area(3,4);
			assertEquals (12,result);
	}
}

