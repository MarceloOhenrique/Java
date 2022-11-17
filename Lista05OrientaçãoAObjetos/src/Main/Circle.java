package Main;

public class Circle {

	public double radius;
	
	public double area() {
		
		return 3.14 * (this.radius * this.radius);
	}
	
	public double circumference() {
		
		return 3.14 * (this.radius * 2);
	}
	
	public void enlargeCircle(double radiusIncrease) {
		
		this.radius += this.radius * (radiusIncrease / 100);
	}


}
