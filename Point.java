public class Point {
	public double x,y;

	public void printPoint() {
	  System.out.println("X coordinate: " +  this.x);
	  System.out.println("Y coordinate: " +  this.y);
	}
	
	public void clear() {
	  x = 0.0;
	  y = 0.0;
	}
}
