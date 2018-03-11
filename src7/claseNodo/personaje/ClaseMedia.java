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

	public String setHouse(House nuevo) {
		if(nuevo!=null) {
			if(house!=null && house[0]!=null) {
				this.house[0]=nuevo;
				return this.house[0].toString();
			}else {
				return "no ha sido poder construir una casa";
			}
			
		}else {
			if(house!=null && house[0]!=null) {
				return this.house[0].toString();
			}else {
				return "no ha sido poder construir una casa";
			}
		}
	}
	
	public String getHouse() {
		// TODO Auto-generated method stub
		return house.toString();
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
				+ getHouse() + ", getNumHouse()=" + getNumHouse() + ", getCoche()="
				+ Arrays.toString(getCoche()) + ", getNumCoche()=" + getNumCoche() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + ", isCasado()=" + isCasado()
				+ ", getDni()=" + getDni() + "]";
	}

	public String setCoche(Coche coche2) {
		// TODO Auto-generated method stub
		if(coche2!=null) {
			if(this.coche!=null && this.coche[0]!=null) {
				return this.coche[0].toString();
			}else {
				return "no tiene coche";
			}
		}else {
			if(this.coche!=null && this.coche[0]!=null) {
				this.coche[0]=coche2;
				return this.coche[0].toString();
			}else {
				return "no tiene coche";
			}
		}
	
	}

	
}
