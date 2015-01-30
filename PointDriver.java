/* Driver for Point class
	Brian Capouch
	30 January 2015
*/


public class PointDriver {

	public static void main(String[] args ) {
	
	// Create three points
	Point lowerLeft = new Point();
	Point upperRight = new Point();
	Point middlePoint = new Point();

	// Give them some values
	lowerLeft.x = 0.0;
	lowerLeft.y = 0.0;

	upperRight.x = 1280.0;
	upperRight.y = 1024.0;

	middlePoint.x = 640.0;
	middlePoint.y = 512.0;

	// Print one of the points
	upperRight.printPoint();
	// Clear it
	upperRight.clear();
	// Print it again
	upperRight.printPoint();
	}
}
