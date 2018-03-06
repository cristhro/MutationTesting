package claseNodo.figura3D;

import claseNodo.figura2D.Cuadrado;

public class Cubo implements Figura3D{
	private double altura=0;
	private Cuadrado cuadrado;
	
	public Cubo(Cubo c) {
		this.altura=c.altura;
		this.cuadrado=c.cuadrado;
	}
	public Cubo(double altura, Cuadrado cuadrado) {
		super();
		this.altura = altura;
		this.cuadrado = cuadrado;
	}

	
	public double getArea3D() {
		// TODO Auto-generated method stub
		return 6*cuadrado.getArea2D();
	}

	
	public double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

	
	public double getVolumen() {
		// TODO Auto-generated method stub
		return altura*cuadrado.getArea2D();
	}

	
	public Cuadrado getFiguraBase() {
		// TODO Auto-generated method stub
		return cuadrado;
	}
	
	public String toString() {
		return "Cubo [altura=" + altura + ", cuadrado=" + cuadrado + ", getArea3D()=" + getArea3D() + ", getAltura()="
				+ getAltura() + ", getVolumen()=" + getVolumen() + ", getFiguraBase()=" + getFiguraBase()
				+ "]";
	}

	
}
