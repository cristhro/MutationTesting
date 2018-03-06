package claseNodo.figura3D;

import claseNodo.figura2D.Circulo;

public class Esfera implements Figura3D{
	Circulo c;

	

	public Esfera(Circulo c) {
		super();
		this.c = c;
	}
	
	public Esfera(Esfera e) {
		super();
		this.c = e.c;
	}
	
	
	public double getArea3D() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public double getAltura() {
		// TODO Auto-generated method stub
		return c.getRadio()*2;
	}

	
	public double getVolumen() {
		// TODO Auto-generated method stub
		return 4.0/3.0*Math.PI*Math.pow(c.getRadio(), 3);
	}

	
	public Circulo getFiguraBase() {
		// TODO Auto-generated method stub
		return c;
	}

	
	public String toString() {
		return "Esfera [c=" + c + ", getArea3D()=" + getArea3D() + ", getAltura()=" + getAltura() + ", getVolumen()="
				+ getVolumen() + ", getFiguraBase()=" + getFiguraBase() + "]";
	}


}
