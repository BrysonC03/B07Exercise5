package exercise4;

public class Rectangle{
	Point A1;
	Point B1;

	Point A2;
	Point B2;

	public Rectangle(Point A, Point B){
		this.A1 = A;
		this.B1 = B;

		A2 = new Point(A1.x, B1.y);
		B2 = new Point(B1.x, A1.y);
	}

	public double perimeter(){
		return (A1.distance(A2) + A1.distance(B2)) * 2; 
	}

	public boolean isSquare(){
		return perimeter() == 4 * A1.distance(A2);
	}
}