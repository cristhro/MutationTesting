package es.tfg.ejemplos.claseNodo.figura2D;

import es.tfg.ejemplos.claseNodo.Figura;

public class Circulo implements FiguraEsferica2D, Figura{
	private double radio;

	public Circulo(Circulo c) {
		this.radio=c.getRadio();
	}
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public double getRadio() {
		// TODO Auto-generated method stub
		return radio;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}
	
	
}
