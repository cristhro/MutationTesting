package claseNodo.personaje;

import java.util.Arrays;

import claseNodo.Coche;
import claseNodo.House;

public class ClaseAlta extends Persona{
	private House[] houses=new House[1];
	private Coche[] coches=new Coche[1];

	public ClaseAlta(House[] hs,Coche[] cs,String nombre, String apellidos, int edad, boolean casado, String dni) {
		super(nombre, apellidos, edad, casado, dni);
		this.houses=hs;
		this.coches=cs;
		// TODO Auto-generated constructor stub
	}

	
	public House[] getHouse() {
		// TODO Auto-generated method stub
		return houses;
	}

	
	public int getNumHouse() {
		// TODO Auto-generated method stub
		return houses.length;
	}

	
	public Coche[] getCoche() {
		// TODO Auto-generated method stub
		return coches;
	}

	
	public int getNumCoche() {
		// TODO Auto-generated method stub
		return coches.length;
	}

	
	public String toString() {
		return "ClaseAlta [houses=" + Arrays.toString(houses) + ", coches=" + Arrays.toString(coches) + ", getHouse()="
				+ Arrays.toString(getHouse()) + ", getNumHouse()=" + getNumHouse() + ", getCoche()="
				+ Arrays.toString(getCoche()) + ", getNumCoche()=" + getNumCoche() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + ", isCasado()=" + isCasado()
				+ ", getDni()=" + getDni() + "]";
	}
	

}
