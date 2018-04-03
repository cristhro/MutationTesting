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
		assertEquals(a.getCoche(),""+new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").getCoche());
		assertEquals(""+a.addCoche(new Coche(ruedas,sillas,cuerpo,"honda",1000,"verde")), ""+new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").addCoche(new Coche(ruedas,sillas,cuerpo,"honda",1000,"verde")));
		assertEquals(""+a.addHouse(new House(figura3D,new Posicion(20,30),"casa de campo")), ""+new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").addHouse(new House(figura3D,new Posicion(20,30),"casa de campo")));
		House house= new House(figura3D,new Posicion(12,13),"casa blanca");
		assertEquals(a.setHouse(house),a.setHouse(house));
		assertEquals(a.setHouse(null),a.setHouse(null));
		Coche coche2= new Coche(ruedas,sillas,cuerpo,"mercedes",1234,"amarillo");
		assertEquals(a.setCoche(coche2),a.setCoche(coche2));
		assertEquals(a.setCoche(null),a.setCoche(null));
		assertEquals(a.getNumCoche(),a.getNumCoche());
		assertEquals(a.getNumHouse(),a.getNumHouse());
		
		ClaseAlta no_coche_no_house=new ClaseAlta(null,null, "pepe", "alonso", 40, false, "12345");
		assertEquals(no_coche_no_house.getNumHouse(),no_coche_no_house.getNumHouse());
		assertEquals(no_coche_no_house.getHouse(),no_coche_no_house.getHouse());
		assertEquals(no_coche_no_house.setHouse(house),no_coche_no_house.setHouse(house));
		assertEquals(no_coche_no_house.getNumCoche(),no_coche_no_house.getNumCoche());
		assertEquals(no_coche_no_house.getCoche(),no_coche_no_house.getCoche());
		assertEquals(no_coche_no_house.setHouse(null),no_coche_no_house.setHouse(null));
		assertEquals(no_coche_no_house.setCoche(coche2),no_coche_no_house.setCoche(coche2));
		assertEquals(no_coche_no_house.setCoche(null),no_coche_no_house.setCoche(null));
		assertEquals(""+no_coche_no_house.addCoche(null), 
				""+no_coche_no_house.addCoche(null));
		assertEquals(""+no_coche_no_house.addHouse(null),  
				""+no_coche_no_house.addHouse(null));
		assertEquals(no_coche_no_house.addCoche(new Coche(ruedas,sillas,cuerpo,"honda",1000,"verde")), 
				no_coche_no_house.addCoche(new Coche(ruedas,sillas,cuerpo,"honda",1000,"verde")));
		assertEquals(no_coche_no_house.addHouse(new  House(figura3D,new Posicion(20,30),"casa de campo") ), 
				no_coche_no_house.addHouse(new  House(figura3D,new Posicion(20,30),"casa de campo")));
		assertEquals(no_coche_no_house.getHouse(),no_coche_no_house.getHouse());
		assertEquals(no_coche_no_house.getCoche(),no_coche_no_house.getCoche());
		
	}

}
