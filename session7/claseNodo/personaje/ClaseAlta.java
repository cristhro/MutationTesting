package claseNodo.personaje;

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

	@Override
	public House[] getHouse() {
		// TODO Auto-generated method stub
		return houses;
	}

	@Override
	public int getNumHouse() {
		// TODO Auto-generated method stub
		return houses.length;
	}

	@Override
	public Coche[] getCoche() {
		// TODO Auto-generated method stub
		return coches;
	}

	@Override
	public int getNumCoche() {
		// TODO Auto-generated method stub
		return coches.length;
	}
	

}
