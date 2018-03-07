package es.tfg.ejemplos.claseNodo.personaje;

import es.tfg.ejemplos.claseNodo.Coche;
import es.tfg.ejemplos.claseNodo.House;

import java.util.Arrays;

public class ClaseBaja extends Persona {
	private House[] house=new House[1];
	

	public ClaseBaja(House h,String nombre, String apellidos, int edad, boolean casado, String dni) {
		super(nombre, apellidos, edad, casado, dni);
		house[0]=h;
		// TODO Auto-generated constructor stub
	}


	@Override
	public House[] getHouse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumHouse() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Coche[] getCoche() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumCoche() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "ClaseBaja{" +
				"house=" + Arrays.toString(house) +
				'}';
	}
}
