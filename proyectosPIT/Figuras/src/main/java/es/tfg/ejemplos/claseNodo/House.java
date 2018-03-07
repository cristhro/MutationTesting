
package es.tfg.ejemplos.claseNodo;

import es.tfg.ejemplos.claseNodo.figura3D.Figura3D;

import java.util.Arrays;

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
	


	@Override
	public Posicion getPos() {
		// TODO Auto-generated method stub
		return posicion;
	}

	@Override
	public String getNomDir() {
		// TODO Auto-generated method stub
		return dir;
	}

	public Figura3D[] getFigura3D() {
		return figura3D;
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
		return "House{" +
				"figura3D=" + Arrays.toString(figura3D) +
				", posicion=" + posicion +
				", dir='" + dir + '\'' +
				'}';
	}
}
