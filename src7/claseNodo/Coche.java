package claseNodo;

import java.util.Arrays;

import claseNodo.figura2D.*;
import claseNodo.figura3D.Cubo;

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
	
	@Override
	public String toString() {
		return "Coche [rueda=" + Arrays.toString(rueda) + ", sillas=" + Arrays.toString(sillas) + ", cuerpo=" + cuerpo
				+ ", color=" + color + ", matricula=" + matricula + ", marca=" + marca + ", getRueda()="
				+ Arrays.toString(getRueda()) + ", getSillas()=" + Arrays.toString(getSillas()) + ", getCuerpo()="
				+ getCuerpo() + ", getColor()=" + getColor() + ", getMatricula()=" + getMatricula() + ", getMarca()="
				+ getMarca() +  "]";
	}

}
