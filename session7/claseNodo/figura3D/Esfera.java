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
	
	@Override
	public double getArea3D() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return c.getRadio()*2;
	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return 4.0/3.0*Math.PI*Math.pow(c.getRadio(), 3);
	}

	@Override
	public Circulo getFiguraBase() {
		// TODO Auto-generated method stub
		return c;
	}


}
