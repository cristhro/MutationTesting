package claseNodo.personaje;

import java.util.Arrays;

import claseNodo.Coche;
import claseNodo.House;

public class Vagabundo extends Persona{
	private House[] houses=null;
	private Coche[] coche=null;

	public Vagabundo(String nombre, String apellidos, int edad, boolean casado, String dni) {
		super(nombre, apellidos, edad, casado, dni);
		// TODO Auto-generated constructor stub
	}

	

	
	public House[] getHouse() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getNumHouse() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public Coche[] getCoche() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getNumCoche() {
		// TODO Auto-generated method stub
		return 0;
	}



	
	public String toString() {
		return "Vagabundo [getHouse()=" + Arrays.toString(getHouse()) + ", getNumHouse()=" + getNumHouse()
				+ ", getCoche()=" + Arrays.toString(getCoche()) + ", getNumCoche()=" + getNumCoche() + ", getNombre()="
				+ getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + ", isCasado()="
				+ isCasado() + ", getDni()=" + getDni() + "]";
	}

	
}
