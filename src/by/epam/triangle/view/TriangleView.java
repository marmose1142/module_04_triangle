package by.epam.triangle.view;

import by.epam.triangle.entity.TriangleTops;

public class TriangleView {

	public void printPerimeterTriangle(double perimeterTriangle) {
		System.out.println("Perimeter of triangle = " + perimeterTriangle);
	}

	public void printAreaTriangle(double areaTriangle) {
		System.out.println("Area of triangle = " + areaTriangle);
	}

	public void printMedianIntersectionPoint(TriangleTops medianIntersectionPoint) {
		System.out.print(medianIntersectionPoint.getX() + ";" + medianIntersectionPoint.getY());
	}

}
