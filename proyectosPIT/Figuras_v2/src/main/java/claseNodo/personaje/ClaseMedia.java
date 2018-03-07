package claseNodo.personaje;

import java.util.Arrays;

import claseNodo.Coche;
import claseNodo.House;

public class ClaseMedia extends Persona{
	private House[] house=new House[1];
	private Coche[] coche=new Coche[1];

	public ClaseMedia(Coche c, House h,String nombre, String apellidos, int edad, boolean casado, String dni) {
		super(nombre, apellidos, edad, casado, dni);
		coche[0]=c;
		house[0]=h;
		// TODO Auto-generated constructor stub
	}

	
	public House[] getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

	
	public int getNumHouse() {
		// TODO Auto-generated method stub
		return 1;
	}

	
	public Coche[] getCoche() {
		// TODO Auto-generated method stub
		return coche;
	}

	
	public int getNumCoche() {
		// TODO Auto-generated method stub
		return 1;
	}

	
	public String toString() {
		return "ClaseMedia [house=" + Arrays.toString(house) + ", coche=" + Arrays.toString(coche) + ", getHouse()="
				+ Arrays.toString(getHouse()) + ", getNumHouse()=" + getNumHouse() + ", getCoche()="
				+ Arrays.toString(getCoche()) + ", getNumCoche()=" + getNumCoche() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + ", isCasado()=" + isCasado()
				+ ", getDni()=" + getDni() + "]";
	}

	
}
