
public class Circle {

	double radius;
	Point center;
	
	public Circle(double radius, Point center) {
		this.radius = radius;
		this.center = center;
	}
	
	public double perimeter() {
		return 2*Math.PI*this.radius;
	}
	
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
	
	@Override
	public int hashCode() {
		return (int)(3*radius + 9*center.x + 11*center.y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (this.center.x != other.center.x)
			return false;
		if (this.center.y != other.center.y)
			return false;
		if (this.radius != other.radius)
			return false;
		return true;
	}
}
