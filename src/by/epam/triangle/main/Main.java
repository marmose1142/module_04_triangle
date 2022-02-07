package by.epam.triangle.main;

import by.epam.triangle.entity.*;
import by.epam.triangle.logic.*;
import by.epam.triangle.view.*;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
 *  периметра и точки пересечения медиан. */

public class Main {

	public static void main(String[] args) {
		double perimeterTriangle;
		double areaTriangle;

		Triangle triangle = new Triangle(new TriangleTops(2.0, 3.0), new TriangleTops(4.5, 9.0),
				new TriangleTops(10.0, 7.5));
		TriangleLogic triangleLogic = new TriangleLogic();
		TriangleView triangleView = new TriangleView();

		double sideAB = triangleLogic.calculatingSideLength(triangle.getA(), triangle.getB());
		double sideBC = triangleLogic.calculatingSideLength(triangle.getB(), triangle.getC());
		double sideAC = triangleLogic.calculatingSideLength(triangle.getA(), triangle.getC());

		perimeterTriangle = triangleLogic.calculatingPerimeterTriangle(sideAB, sideBC, sideAC);
		areaTriangle = triangleLogic.calculatingAreaTriangle(sideAB, sideBC, sideAC, perimeterTriangle);

		triangleView.printPerimeterTriangle(perimeterTriangle);
		triangleView.printAreaTriangle(areaTriangle);
		triangleView.printMedianIntersectionPoint(triangleLogic.calculatingMedianIntersectionPoint(triangle));

	}

}
