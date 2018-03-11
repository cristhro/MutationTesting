package Test.TestPersonaje;

import static org.junit.Assert.*;

import org.junit.Test;

import claseNodo.Coche;
import claseNodo.House;
import claseNodo.Posicion;
import claseNodo.figura2D.Circulo;
import claseNodo.figura2D.Cuadrado;
import claseNodo.figura2D.Rectangulo;
import claseNodo.figura3D.Cilindro;
import claseNodo.figura3D.Cubo;
import claseNodo.figura3D.Esfera;
import claseNodo.figura3D.Figura3D;
import claseNodo.figura3D.Tetraedro;
import claseNodo.personaje.ClaseAlta;
import claseNodo.personaje.ClaseBaja;
import claseNodo.personaje.ClaseMedia;
import claseNodo.personaje.Vagabundo;


public class Test_personaje {


	@Test
	public void test1() {
		assertNotNull("should not be null", new Vagabundo("Juan", "alonso", 10, false, "12234"));		
		assertEquals(new Vagabundo("Juan", "alonso", 10, false, "12234").getNombre(), new Vagabundo("Juan", "alonso", 10, false, "12234").getNombre());
		assertEquals(new Vagabundo("Juan", "alonso", 120, false, "12234").getApellidos(), new Vagabundo("Juan", "alonso", 120, false, "12234").getApellidos());
		assertEquals(new Vagabundo("Juan", "alonso", 10, false, "12").getDni(), new Vagabundo("Juan", "alonso", 10, false, "12").getDni());
		assertEquals(new Vagabundo("Juan", "alonso", 0, false, "12234").getEdad(), new Vagabundo("Juan", "alonso", 0, false, "12234").getEdad());
		assertEquals(new Vagabundo("Juan", "alonso", 10, true, "12234").isCasado(), new Vagabundo("Juan", "alonso", 10, true, "12234").isCasado());
		assertEquals(""+new Vagabundo("Juan", "alonso", 10, true, "12234").getHouse(),""+new Vagabundo("Juan", "alonso", 10, true, "12234").getHouse());


	}

	@Test
	public void test2() {
		Cubo cubo=new Cubo(new Cuadrado(22.2),12.8);
		Figura3D figura3D[]={cubo};
		Circulo[] ruedas= {new Circulo(20),new Circulo(22),new Circulo(22),new Circulo(20)};
		Cuadrado[] sillas= {new Cuadrado(1),new Cuadrado(1),new Cuadrado(1),new Cuadrado(1)};
		Cubo cuerpo=new Cubo(new Cuadrado(102),12);
		//Coche[] coches= {new Coche(ruedas,sillas,cuerpo,"mercedes",1234)};
		ClaseBaja a=new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345");
		assertEquals(a.toString(), new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345").toString());
		assertNotNull("should not be null",new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345"));
		assertEquals(a.getNombre(),new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345").getNombre());
		assertEquals(a.getApellidos(), new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345").getApellidos());
		assertEquals(a.getDni(), new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345").getDni());
		assertEquals(a.getEdad(),new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345").getEdad());
		assertEquals(a.isCasado(), new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345").isCasado());
		assertEquals(a.getHouse(),""+new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345").getHouse());
		assertEquals(a.setCoche(new Coche(ruedas,sillas,cuerpo,"mercedes",1234)),new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345").setCoche(new Coche(ruedas,sillas,cuerpo,"mercedes",1234)));
		assertEquals(""+a.addHouse(new House(figura3D,new Posicion(20,30),"casa de campo")), ""+new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345").addHouse(new House(figura3D,new Posicion(20,30),"casa de campo")));

		//fail("Not yet implemented");
	}

	@Test
	public void test3() {
		Esfera esfera=new Esfera(12.8);
		Tetraedro tedraedro=new Tetraedro(new Rectangulo(12, 13), 4);
		Figura3D figura3D[]={esfera,tedraedro};
		Circulo[] ruedas= {new Circulo(20),new Circulo(22),new Circulo(22),new Circulo(20)};
		Cuadrado[] sillas= {new Cuadrado(1),new Cuadrado(1),new Cuadrado(1),new Cuadrado(1)};
		Cubo cuerpo=new Cubo(new Cuadrado(102),12);
		Coche coche= new Coche(ruedas,sillas,cuerpo,"mercedes",1234);
		House house= new House(figura3D,new Posicion(12,13),"casa blanca");
		ClaseMedia a=new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345");
		assertEquals(a.toString(), new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345").toString());
		assertNotNull("should not be null",new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345"));
		assertEquals(a.getNombre(), new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345").getNombre());
		assertEquals(a.getApellidos(), new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345").getApellidos());
		assertEquals(a.getDni(), new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345").getDni());
		assertEquals(a.getEdad(),new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345").getEdad());
		assertEquals(a.isCasado(),new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345").isCasado());
		assertEquals(a.getHouse(),""+new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345").getHouse());
		assertEquals(""+a.setCoche(new Coche(ruedas,sillas,cuerpo,"honda",1000)),new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345").setCoche(new Coche(ruedas,sillas,cuerpo,"honda",1000)) );
		assertEquals(""+a.setHouse(new House(figura3D,new Posicion(20,30),"casa de campo")),new ClaseMedia(coche,house, "pepe", "alonso", 40, false, "12345").setHouse(new House(figura3D,new Posicion(20,30),"casa de campo"))
				);
		//fail("Not yet implemented");

	}
	
	
	@Test
	public void test4() {
		Cubo cubo=new Cubo(new Cuadrado(22.2),12.8);
		Tetraedro tedraedro=new Tetraedro(new Rectangulo(12, 13), 4);
		Figura3D figura3D[]={cubo,tedraedro};
		Circulo[] ruedas= {new Circulo(2),new Circulo(2),new Circulo(2),new Circulo(2)};
		Cuadrado[] sillas= {new Cuadrado(1),new Cuadrado(1),new Cuadrado(1),new Cuadrado(1)};
		Cubo cuerpo=new Cubo(new Cuadrado(2),12);
		Coche[] coches= {new Coche(ruedas,sillas,cuerpo,"honda",1234),new Coche(ruedas,sillas,cuerpo,"mercedes",1234)};
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
		assertEquals(""+a.addCoche(new Coche(ruedas,sillas,cuerpo,"honda",1000)), ""+new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").addCoche(new Coche(ruedas,sillas,cuerpo,"honda",1000)));
		assertEquals(""+a.addHouse(new House(figura3D,new Posicion(20,30),"casa de campo")), ""+new ClaseAlta(houses,coches, "pepe", "alonso", 40, false, "12345").addHouse(new House(figura3D,new Posicion(20,30),"casa de campo")));
		//fail("Not yet implemented");

	}

}
