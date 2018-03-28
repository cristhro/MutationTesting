package Test.TestClaseNodo_otras;

import claseNodo.Coche;
import claseNodo.House;
import claseNodo.Posicion;
import claseNodo.figura2D.Circulo;
import claseNodo.figura2D.Cuadrado;
import claseNodo.figura2D.Rectangulo;
import claseNodo.figura3D.Cubo;
import claseNodo.figura3D.Esfera;
import claseNodo.figura3D.Figura3D;
import claseNodo.figura3D.Tetraedro;
import claseNodo.personaje.ClaseAlta;
import claseNodo.personaje.ClaseBaja;

public class Prueba {

	public static void main(String[] args) {
		
		Cubo cubo=new Cubo(new Cuadrado(22.2),12.8);

		Figura3D figura3D[]={cubo};
		House house= new House(figura3D,new Posicion(12,13),"casa blanca");
		ClaseBaja a=new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345");
		a.setHouse(house);
		System.out.println(a.toString());
		//a.addHouse(house);
		System.out.println(a.toString());
	}

}
