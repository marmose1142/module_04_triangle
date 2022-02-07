package by.epam.triangle.entity;

import java.util.Objects;

public class Triangle {
	private TriangleTops a;
	private TriangleTops b;
	private TriangleTops c;

	public Triangle() {

	}

	public Triangle( TriangleTops a, TriangleTops b, TriangleTops c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public TriangleTops getA() {
		return a;
	}

	public void setA(TriangleTops a) {
		this.a = a;
	}

	public TriangleTops getB() {
		return b;
	}

	public void setB(TriangleTops b) {
		this.b = b;
	}

	public TriangleTops getC() {
		return c;
	}

	public void setC(TriangleTops c) {
		this.c = c;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, c);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return Objects.equals(a, other.a) && Objects.equals(b, other.b) && Objects.equals(c, other.c);
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
