package claseNodo.personaje;

import claseNodo.Coche;
import claseNodo.House;

public class ClaseBaja extends Persona{
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

}
