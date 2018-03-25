package Test;

import claseNodo.Coche;
import claseNodo.House;
import claseNodo.Posicion;
import claseNodo.figura2D.Circulo;
import claseNodo.figura2D.Cuadrado;
import claseNodo.figura2D.Rectangulo;
import claseNodo.figura3D.Cubo;
import claseNodo.figura3D.Figura3D;
import claseNodo.figura3D.Tetraedro;
import claseNodo.personaje.ClaseAlta;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cubo cubo=new Cubo(new Cuadrado(22.2),12.8);
		Tetraedro tedraedro=new Tetraedro(new Rectangulo(12, 13), 4);
		Figura3D figura3D[]={cubo,tedraedro};
		Circulo[] ruedas= {new Circulo(2),new Circulo(2),new Circulo(2),new Circulo(2)};
		Cuadrado[] sillas= {new Cuadrado(1),new Cuadrado(1),new Cuadrado(1),new Cuadrado(1)};
		Cubo cuerpo=new Cubo(new Cuadrado(2),12);
		Coche[] coches= {new Coche(ruedas,sillas,cuerpo,"honda",1234,"verde"),new Coche(ruedas,sillas,cuerpo,"mercedes",1234,"verde")};
		House[] houses= {new House(figura3D,new Posicion(2,3),"moncloa"),new House(figura3D,new Posicion(12,13),"casa blanca")};
		ClaseAlta a=new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345");
		
		System.out.println(a.getHouse());
	}

}
