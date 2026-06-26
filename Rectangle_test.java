package exercise4;
import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class Rectangle_test {

	@Test
	void test_perimeter(){
		Point pA = new Point(1,0);
		Point pB = new Point(0,1);
		Rectangle r = new Rectangle(pA, pB);
		assertEquals(r.perimeter(), 4);
	}
	
	@Test
	void test_isSquare1(){
		Point pA = new Point(1,0);
		Point pB = new Point(0,1);
		Rectangle r = new Rectangle(pA, pB);
		assertTrue(r.isSquare());
	}
	
	@Test
	void test_isSquare2(){
		Point pA = new Point(1,0);
		Point pB = new Point(0,2);
		Rectangle r = new Rectangle(pA, pB);
		assertFalse(r.isSquare());
	}

}