package claseNodo;

import java.util.Arrays;

import claseNodo.figura3D.Figura3D;

public class House implements Direccion {
	private Figura3D[] figura3D=null;
	private Posicion posicion=null;
	private String dir;
	
	public House(Figura3D[] figura3d, Posicion posicion, String dir) {
		super();
		figura3D = figura3d;
		this.posicion = posicion;
		this.dir = dir;
	}
	


	
	public Posicion getPos() {
		// TODO Auto-generated method stub
		return posicion;
	}

	
	public String getNomDir() {
		// TODO Auto-generated method stub
		return dir;
	}

	public String getFigura3D() {
		return figura3D.toString();
	}

	public void setFigura3D(Figura3D[] figura3d) {
		figura3D = figura3d;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}



	@Override
	public String toString() {
		return "House [figura3D=" + Arrays.toString(figura3D) + ", posicion=" + posicion + ", dir=" + dir
				+ ", getPos()=" + getPos() + ", getNomDir()=" + getNomDir() + ", getFigura3D()="
				+ getFigura3D() + ", getPosicion()=" + getPosicion() + ", getDir()=" + getDir()
				+ "]";
	}

	
	
}
