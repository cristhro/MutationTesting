package es.tfg.ejemplos;


import claseNodo.House;
import claseNodo.Posicion;
import claseNodo.figura2D.Circulo;
import claseNodo.figura2D.Cuadrado;
import claseNodo.figura3D.Cilindro;
import claseNodo.figura3D.Cubo;
import claseNodo.figura3D.Figura3D;
import claseNodo.personaje.ClaseBaja;
import claseNodo.personaje.Vagabundo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_vagabundo {

	@Test
	public void test1() {
		Vagabundo vagabundo=new Vagabundo("Juan", null, 0, false, null);
		assertEquals("Juan", vagabundo.getNombre());
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
	    Cubo cubo=new Cubo(12.8,new Cuadrado(22.2));
        Figura3D figura3D[]={cubo};
		ClaseBaja a=new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345");
		assertEquals(a.toString(), a.toString());
		//fail("Not yet implemented");
	}

    @Test
    public void test3() {
        Cilindro cilindro=new Cilindro(new Circulo(4),44);
        Figura3D figura3D[]={cilindro};
        ClaseBaja a=new ClaseBaja(new House(figura3D,new Posicion(2,3),"fdi"),"pepe", "alonso", 0, false, "12345");
        assertEquals(a.toString(), a.toString());
        //fail("Not yet implemented");
    }
}
