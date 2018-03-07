package es.tfg.ejemplos.claseNodo.personaje;

import es.tfg.ejemplos.claseNodo.Coche;
import es.tfg.ejemplos.claseNodo.House;

public class ClaseMedia extends Persona {
	private House[] house=new House[1];
	private Coche[] coche=new Coche[1];

	public ClaseMedia(Coche c, House h,String nombre, String apellidos, int edad, boolean casado, String dni) {
		super(nombre, apellidos, edad, casado, dni);
		coche[0]=c;
		house[0]=h;
		// TODO Auto-generated constructor stub
	}

	@Override
	public House[] getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

	@Override
	public int getNumHouse() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Coche[] getCoche() {
		// TODO Auto-generated method stub
		return coche;
	}

	@Override
	public int getNumCoche() {
		// TODO Auto-generated method stub
		return 1;
	}

}
