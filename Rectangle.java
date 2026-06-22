package exercise4;

public class Rectangle{
	Point A1;
	Point B1;

	Point A2;
	Point B2;

	public Rectangle(Point A, Point B){
		this.A = A;
		this.B = B;

		Point A2 = new Point(A1.x, B1.y);
		Point B2 = new Point(B2.x, A2.y);
	}

	public double perimeter(){
		return (A1.distance(A2) + A1.distance(B1)) * 2; 
	}

	public boolean isSquare(){
		return perimeter() == 4 * A1.distance(A2);
	}
}