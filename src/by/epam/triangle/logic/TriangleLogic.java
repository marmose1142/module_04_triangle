package by.epam.triangle.logic;

import by.epam.triangle.entity.Triangle;
import by.epam.triangle.entity.TriangleTops;

public class TriangleLogic {

	public double calculatingSideLength(TriangleTops first, TriangleTops second) {

		double dx = second.getX() - first.getX();
		double dy = second.getY() - first.getY();

		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

	}

	public double calculatingPerimeterTriangle(double ab, double bc, double ac) {

		return ab + bc + ac;

	}

	public double calculatingAreaTriangle(double ab, double bc, double ac, double perimeterTriangle) {
		double triangleSemiperimeter;
		double areaTriangle;

		triangleSemiperimeter = perimeterTriangle / 2;
		areaTriangle = Math.sqrt(triangleSemiperimeter * (triangleSemiperimeter - ab) * (triangleSemiperimeter - bc)
				* (triangleSemiperimeter - ac));

		return areaTriangle;

	}

	public TriangleTops calculatingMedianIntersectionPoint(Triangle triangle) {
		TriangleTops medianIntersectionPoint = new TriangleTops(
				(triangle.getA().getX() + triangle.getB().getX() + triangle.getC().getX()) / 3,
				(triangle.getA().getY() + triangle.getB().getY() + triangle.getC().getY()) / 3);

		return medianIntersectionPoint;
	}

}
