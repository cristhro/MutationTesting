package Test.TestPersonaje_exhaustiva;

import static org.junit.Assert.*;

import org.junit.Test;

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

public class TestClaseAlta_exhaustiva {

	/*
	 * ClaseAlta
	 */
	@Test
	public void test4() {
		Cubo cubo=new Cubo(new Cuadrado(22.2),12.8);
		Tetraedro tedraedro=new Tetraedro(new Rectangulo(12, 13), 4);
		Figura3D figura3D[]={cubo,tedraedro};
		Circulo[] ruedas= {new Circulo(2),new Circulo(2),new Circulo(2),new Circulo(2)};
		Cuadrado[] sillas= {new Cuadrado(1),new Cuadrado(1),new Cuadrado(1),new Cuadrado(1)};
		Cubo cuerpo=new Cubo(new Cuadrado(2),12);
		Coche[] coches= {new Coche(ruedas,sillas,cuerpo,"honda",1234,"negro"),new Coche(ruedas,sillas,cuerpo,"mercedes",1234,"negro")};
		House[] houses= {new House(figura3D,new Posicion(2,3),"moncloa"),new House(figura3D,new Posicion(12,13),"casa blanca")};
		ClaseAlta a=new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345");
		assertEquals(a.toString(), new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").toString());
		assertNotNull("should not be null",new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345"));
		assertEquals(a.getNombre(), new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").getNombre());
		assertEquals(a.getApellidos(), new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").getApellidos());
		assertEquals(a.getDni(), new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").getDni());
		assertEquals(a.getEdad(),new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").getEdad());
		assertEquals(a.isCasado(), new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").isCasado());
		assertEquals(a.getHouse(),""+new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").getHouse());
		assertEquals(""+a.addCoche(new Coche(ruedas,sillas,cuerpo,"honda",1000,"verde")), ""+new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").addCoche(new Coche(ruedas,sillas,cuerpo,"honda",1000,"verde")));
		assertEquals(""+a.addHouse(new House(figura3D,new Posicion(20,30),"casa de campo")), ""+new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").addHouse(new House(figura3D,new Posicion(20,30),"casa de campo")));
		House house= new House(figura3D,new Posicion(12,13),"casa blanca");
		assertEquals(a.setHouse(house),a.setHouse(house));
		Coche coche2= new Coche(ruedas,sillas,cuerpo,"mercedes",1234,"amarillo");
		assertEquals(a.setCoche(coche2),a.setCoche(coche2));


		//fail("Not yet implemented");

	}

}
