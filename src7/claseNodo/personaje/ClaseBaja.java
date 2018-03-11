package claseNodo.personaje;

import java.util.Arrays;

import claseNodo.Coche;
import claseNodo.House;

public class ClaseBaja extends Persona{
	private House[] house=new House[1];
	private Coche[] coche=null;
	

	public ClaseBaja(House h, String nombre, String apellidos, int edad, boolean casado, String dni) {
		super(nombre, apellidos, edad, casado, dni);
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
		return this.house.length;
	}
	
	public House[] setHouse(House nuevo) {
		if(nuevo!=null) {
			this.house[0]=nuevo;
			return this.house;
		}else {
			return this.house;
		}
	}

	public House[] addHouse(House nueva) {
		House[] tmp=new House[this.house.length+1];
		for(int i=0;i<this.house.length;i++) {
			tmp[i]=this.house[i];
		}
		
		tmp[tmp.length-1]=nueva;
		this.house=tmp;
		
		return this.house;
	}
	
	@Override
	public Coche[] getCoche() {
		// TODO Auto-generated method stub
		return this.coche;
	}
	
	public String setCoche(Coche nuevo) {
		if(nuevo!=null) {
			this.coche=new Coche[1];
			coche[0]=nuevo;
			return this.coche.toString();
		}
		return "no tiene coche";
	}

	@Override
	public int getNumCoche() {
		// TODO Auto-generated method stub
		if(this.coche==null) {
			return 0;
		}else {
			return this.coche.length;
		}
		
	}

	@Override
	public String toString() {
		return "ClaseBaja [house=" + Arrays.toString(house) + ", coche=" + Arrays.toString(coche) + ", getHouse()="
				+ Arrays.toString(getHouse()) + ", getNumHouse()=" + getNumHouse() + ", getCoche()="
				+ Arrays.toString(getCoche()) + ", getNumCoche()=" + getNumCoche() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + ", isCasado()=" + isCasado()
				+ ", getDni()=" + getDni() + "]";
	}
	
}

