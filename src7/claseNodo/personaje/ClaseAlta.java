package claseNodo.personaje;

import java.util.Arrays;

import claseNodo.Coche;
import claseNodo.House;
import claseNodo.Imprimir;

public class ClaseAlta extends Persona{
	private House[] houses=new House[1];
	private Coche[] coches=new Coche[1];

	public ClaseAlta(House[] hs,Coche[] cs,String nombre, String apellidos, int edad, boolean casado, String dni) {
		super(nombre, apellidos, edad, casado, dni);
		this.houses=hs;
		this.coches=cs;
		// TODO Auto-generated constructor stub
	}

	
	public String getHouse() {
		// TODO Auto-generated method stub
		String s="";
		for(int i=0;i<this.houses.length;i++)
		{
			s+=houses[i].toString();
		}
		return s;
	}

	
	public int getNumHouse() {
		// TODO Auto-generated method stub
		return houses.length;
	}

	
	public String getCoche() {
		// TODO Auto-generated method stub
		String s="";
		for(int i=0; i<coches.length;i++) {
			s+=coches[i].toString();
		}
		return s;
		
	}

	
	public int getNumCoche() {
		// TODO Auto-generated method stub
		return coches.length;
	}

	public String addHouse(House nueva) {
		House[] tmp=new House[this.houses.length+1];
		for(int i=0;i<this.houses.length;i++) {
			tmp[i]=houses[i];
		}
		
		tmp[tmp.length-1]=nueva;
		this.houses=tmp;
		
		String s="";
		for(int i=0; i<this.houses.length;i++) {
			s+=this.houses[i].toString();
		}
		return s;
	}
	
	public String addCoche(Coche nueva) {
		Coche[] tmp=new Coche[this.houses.length+1];
		for(int i=0;i<this.houses.length;i++) {
			tmp[i]=coches[i];
		}
		
		tmp[tmp.length-1]=nueva;
		this.coches=tmp;
		
		String s="";
		for(int i=0; i<this.coches.length;i++) {
			s+=this.coches[i].toString();
		}
		
		return s;
	}
	
	public String setCoche(Coche coche2) {
		// TODO Auto-generated method stub
		if(coche2!=null) {
			if(this.coches!=null && this.coches[0]!=null) {
				return this.coches[0].toString();
			}else {
				return "no tiene coche";
			}
		}else {
			if(this.coches!=null && this.coches[0]!=null) {
				this.coches[0]=coche2;
				return this.coches[0].toString();
			}else {
				return "no tiene coche";
			}
		}
	
	}
	
	public String setHouse(House nuevo) {
		if(nuevo!=null) {
			if(houses!=null && houses[0]!=null) {
				this.houses[0]=nuevo;
				return this.houses[0].toString();
			}else {
				return "no ha sido poder construir una casa";
			}
			
		}else {
			if(houses!=null && houses[0]!=null) {
				return this.houses[0].toString();
			}else {
				return "no ha sido poder construir una casa";
			}
		}
	}
	
	public String toString() {
		return "ClaseAlta [houses=" + Arrays.toString(houses) + ", coches=" + Arrays.toString(coches) + ", getHouse()="
				+ getHouse() + ", getNumHouse()=" + getNumHouse() + ", getCoche()="
				+ getCoche() + ", getNumCoche()=" + getNumCoche() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + ", isCasado()=" + isCasado()
				+ ", getDni()=" + getDni() + "]";
	}
	

}
