package JAVA;

import static org.junit.Assert.*;

import org.junit.Test;

public class PERIMETER_REC_TEST {

	@Test
		public void rectangle_perimetertest() {
			Perimeter_area junit= new Perimeter_area(); 
			int result= Perimeter_area.rectangle_perimeter(2,3);
			assertEquals (15,result);
	}

}
