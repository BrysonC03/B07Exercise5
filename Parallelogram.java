package B07Exercise5;


public class Parallelogram {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Parallelogram(Point D, Point E, Point F) {
		this.A = D;	// lower-right
		this.B = E; // lower-left
		this.C = F; // upper-left
		this.D = new Point(D.x + (F.x - E.x), 
						   D.y + (F.y - E.y));
	}
	
	public double perimeter() {
		return this.A.distance(this.B) + 
				this.A.distance(this.D) + 
				this.C.distance(this.B) + 
				this.C.distance(this.D);
	}
	
	public double calculateArea() {
		double len = this.A.x - this.B.x;
		double height = this.C.y - this.B.y;
		return len * height;
	}
	
	public boolean isRectangle() {
		double dia = Math.pow(this.C.distance(this.D), 2);
		double side1 = Math.pow(this.A.distance(this.B), 2);
		double side2 = Math.pow(this.B.distance(this.C), 2);
		if (dia == side1 + side2) return true;
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return (int)(this.perimeter()+this.calculateArea());
	}
	
	// For this exercise, two identical parallelograms made from differing Points
	// will not be considered identical
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parallelogram other = (Parallelogram) obj;
		if (A != other.A || B != other.B || C != other.C || D != other.D)
			return false;
		return true;
	}
}