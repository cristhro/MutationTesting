package claseNodo.personaje;

import java.util.Arrays;

import claseNodo.Coche;
import claseNodo.House;

public class ClaseBaja extends Persona{
	private House[] house=new House[1];
	

	public ClaseBaja(House h,String nombre, String apellidos, int edad, boolean casado, String dni) {
		super(nombre, apellidos, edad, casado, dni);
		house[0]=h;
		// TODO Auto-generated constructor stub
	}

	
	public House[] getHouse() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getNumHouse() {
		// TODO Auto-generated method stub
		return 1;
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
		return "ClaseBaja [house=" + Arrays.toString(house) + ", getHouse()=" + Arrays.toString(getHouse())
				+ ", getNumHouse()=" + getNumHouse() + ", getCoche()=" + Arrays.toString(getCoche())
				+ ", getNumCoche()=" + getNumCoche() + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getEdad()=" + getEdad() + ", isCasado()=" + isCasado() + ", getDni()=" + getDni()
				+ "]";
	}

	
}
