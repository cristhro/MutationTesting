package es.tfg.ejemplos.claseNodo.personaje;

import es.tfg.ejemplos.claseNodo.Coche;
import es.tfg.ejemplos.claseNodo.House;

public class Vagabundo extends Persona{

	public Vagabundo(String nombre, String apellidos, int edad, boolean casado, String dni) {
		super(nombre, apellidos, edad, casado, dni);
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
		return 0;
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

}
