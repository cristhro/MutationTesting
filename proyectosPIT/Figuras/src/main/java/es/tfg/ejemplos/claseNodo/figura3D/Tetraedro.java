package es.tfg.ejemplos.claseNodo.figura3D;

import es.tfg.ejemplos.claseNodo.figura2D.Rectangulo;

public class Tetraedro implements Figura3D  {
	private Rectangulo rectangulo;
	private double altura=0;
	

	@Override
	public double getArea3D() {
		// TODO Auto-generated method stub
		return 4*rectangulo.getArea2D();
	}

	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return Math.sqrt(2)/12*Math.pow(rectangulo.getLadoLargo(), 2);
	}

	@Override
	public Rectangulo getFiguraBase() {
		// TODO Auto-generated method stub
		return rectangulo;
	}

}
