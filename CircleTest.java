package B07Exercise5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	public void testPerimeter() {
		Point centre = new Point(0,0);
		double radius = 5.5;
		Circle circle = new Circle(radius, centre);
		assertEquals(2*Math.PI*5.5, circle.perimeter());
	}
	
	@Test
	public void testPerimeterNull() {
		Point centre = new Point(5,0);
		double radius = 0;
		Circle circle = new Circle(radius, centre);
		assertEquals(0, circle.perimeter());
	}
	
	@Test
	public void testArea() {
		Point centre = new Point(0,0);
		double radius = 10.01;
		Circle circle = new Circle(radius, centre);
		assertEquals(10.01*10.01*Math.PI, circle.area());
	}
	
	@Test
	public void testAreaNull() {
		Point centre = new Point(5,2);
		double radius = 0;
		Circle circle = new Circle(radius, centre);
		assertEquals(0, circle.area());
	}
	
	@Test
    public void testHashCode() {
		Point centre = new Point(1,2);
		double radius = 5;
		Circle circle = new Circle(radius, centre);
        assertEquals(46, p.hashCode());
    }

}
