package claseNodo.figura3D;

import claseNodo.figura2D.Circulo;

public class Cilindro implements Figura3D {
	Circulo c;
	private double altura=0;

	public Cilindro(Circulo c,double altura) {
		this.c=c;
		this.altura=altura;
		// TODO Auto-generated constructor stub
	}
	
	public Cilindro(Cilindro c) {
		this.c=c.getFiguraBase();
		this.altura=c.altura;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea3D() {
		// TODO Auto-generated method stub
		return 2*c.getArea()+c.perimetro()*this.altura;
	}

	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return this.altura;
	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return c.getArea()*this.altura;
	}

	@Override
	public Circulo getFiguraBase() {
		// TODO Auto-generated method stub
		return c;
	}
	


	
}
