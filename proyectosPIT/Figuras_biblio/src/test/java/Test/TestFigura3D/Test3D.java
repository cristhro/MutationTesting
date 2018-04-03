package Test.TestFigura3D;

import static org.junit.Assert.*;

import org.junit.Test;

import claseNodo.figura2D.Circulo;
import claseNodo.figura2D.Cuadrado;
import claseNodo.figura2D.Rectangulo;
import claseNodo.figura3D.Cilindro;
import claseNodo.figura3D.Cubo;
import claseNodo.figura3D.Esfera;
import claseNodo.figura3D.Tetraedro;

public class Test3D {

	@Test
	public void test1() {
		assertNotNull("should not be null", new Cilindro(new Circulo(22), 33));
		assertEquals( new Cilindro(new Circulo(22), 33).toString(), new Cilindro(new Circulo(22), 33).toString());
		assertEquals(""+ new Cilindro(new Circulo(22), 33).setAltura(55),""+ new Cilindro(new Circulo(22), 33).setAltura(55));
		assertEquals(new Cilindro(new Circulo(1), 33).getArea3D()+"",new Cilindro(new Circulo(1), 33).getArea3D()+"");
		assertEquals(new Cilindro(new Circulo(1), 33).getVolumen()+"",new Cilindro(new Circulo(1), 33).getVolumen()+"");
	}

	
	@Test
	public void test2() {
		assertNotNull("should not be null", new Cubo(new Cuadrado(22), 33));
		assertEquals( new Cubo(new Cuadrado(22), 33).toString(), new Cubo(new Cuadrado(22), 33).toString());
		assertEquals(new Cubo(new Cubo(new Cuadrado(22), 33)).toString(),new Cubo(new Cubo(new Cuadrado(22), 33)).toString());
		assertEquals(""+new Cubo(new Cuadrado(22), 33).setAltura(55),""+new Cubo(new Cuadrado(22), 33).setAltura(55));
		assertEquals(new Cubo(new Cuadrado(22), 33).getArea3D()+"",new Cubo(new Cuadrado(22), 33).getArea3D()+"");
		assertEquals(new Cubo(new Cuadrado(2), 33).getVolumen()+"",new Cubo(new Cuadrado(2), 33).getVolumen()+"");
		assertEquals(new Cubo(new Cuadrado(2), 33).getFiguraBase()+"",new Cubo(new Cuadrado(2), 33).getFiguraBase()+"");
	}
	
	@Test
	public void test3() {
		assertNotNull("should not be null", new Esfera(33));
		assertEquals( new Esfera(33).toString(), new Esfera(33).toString());
		assertEquals(new Esfera(new Esfera(33)).toString(),new Esfera(new Esfera(33)).toString());
		assertEquals(""+ new Esfera(new Esfera(33)).setRadio(55),""+ new Esfera(new Esfera(33)).setRadio(55));
		assertEquals(new Esfera(new Esfera(33)).getArea3D()+"",new Esfera(new Esfera(33)).getArea3D()+"");
		assertEquals(new  Esfera(new Esfera(33)).getVolumen()+"",new  Esfera(new Esfera(33)).getVolumen()+"");
		assertEquals(new  Esfera(new Esfera(33)).getFiguraBase()+"",new  Esfera(new Esfera(33)).getFiguraBase()+"");
	}
	
	@Test
	public void test4() {
		assertNotNull("should not be null", new Tetraedro(new Rectangulo(12,13),3));
		assertEquals( new Tetraedro(new Rectangulo(12,13),3).toString(), new Tetraedro(new Rectangulo(12,13),3).toString());
		assertEquals(new Tetraedro(new Rectangulo(12,13),3).toString(),new Tetraedro(new Rectangulo(12,13),3).toString());
		assertEquals(""+ new Tetraedro(new Rectangulo(12,13),3).setAltura(55),""+ new Tetraedro(new Rectangulo(12,13),3).setAltura(55));
		assertEquals(new Tetraedro(new Rectangulo(102,13),3).getArea3D()+"",new Tetraedro(new Rectangulo(102,13),3).getArea3D()+"");
		assertEquals(new Tetraedro(new Rectangulo(120,13),3).getVolumen()+"",new Tetraedro(new Rectangulo(120,13),3).getVolumen()+"");
		assertEquals(new Tetraedro(new Rectangulo(12,13),3).getFiguraBase()+"",new Tetraedro(new Rectangulo(12,13),3).getFiguraBase()+"");
	}
	
}
