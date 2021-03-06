package es.tfg.ejemplos.claseNodo;

import es.tfg.ejemplos.claseNodo.figura2D.Circulo;
import es.tfg.ejemplos.claseNodo.figura2D.Cuadrado;
import es.tfg.ejemplos.claseNodo.figura3D.Cubo;

public class Coche {
	private Circulo[] rueda;
	private Cuadrado[] sillas;
	private Cubo cuerpo;
	private String color;
	private int matricula;
	private String marca;
	
	public Coche(Circulo[] rueda, Cuadrado[] sillas, Cubo cuerpo, String color, int matricula) {
		super();
		this.rueda = rueda;
		this.sillas = sillas;
		this.cuerpo = cuerpo;
		this.color = color;
		this.matricula = matricula;
	}
	
	public Coche(Coche c) {
		super();
		this.rueda = c.rueda;
		this.sillas = c.sillas;
		this.cuerpo = c.cuerpo;
		this.color = c.color;
		this.matricula = c.matricula;
	}

	public Circulo[] getRueda() {
		return rueda;
	}

	public void setRueda(Circulo[] rueda) {
		this.rueda = rueda;
	}

	public Cuadrado[] getSillas() {
		return sillas;
	}

	public void setSillas(Cuadrado[] sillas) {
		this.sillas = sillas;
	}

	public Cubo getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(Cubo cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
