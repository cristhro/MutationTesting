package Test.TestFigura3D_exhauxtivo;

import static org.junit.Assert.*;

import org.junit.Test;

import claseNodo.figura2D.Circulo;
import claseNodo.figura2D.Cuadrado;
import claseNodo.figura2D.Rectangulo;
import claseNodo.figura3D.Cilindro;
import claseNodo.figura3D.Cubo;
import claseNodo.figura3D.Esfera;
import claseNodo.figura3D.Tetraedro;

public class Test3D_mas_valor {




/*
 * Cilindro
 */
	@Test
	public void test1() {
		for(int i=-100; i<500;i++) {
			assertNotNull("should not be null", new Cilindro(new Circulo(i), i));
			assertEquals( new Cilindro(new Circulo(i), i).toString(), new Cilindro(new Circulo(i), i).toString());
			assertEquals(""+ new Cilindro(new Circulo(i), i).setAltura(i),""+ new Cilindro(new Circulo(i), i).setAltura(i));
			assertEquals(new Cilindro(new Circulo(i), i).getArea3D()+"",new Cilindro(new Circulo(i), i).getArea3D()+"");
			assertEquals(new Cilindro(new Circulo(i), i).getVolumen()+"",new Cilindro(new Circulo(i), i).getVolumen()+"");
			
			assertNotNull("should not be null", new Cilindro(null, i));
			assertEquals( new Cilindro(null, i).toString(), new Cilindro(null, i).toString());
			assertEquals(""+ new Cilindro(null, i).setAltura(i),""+ new Cilindro(null, i).setAltura(i));
			assertEquals(new Cilindro(null, i).getArea3D()+"",new Cilindro(null, i).getArea3D()+"");
			assertEquals(new Cilindro(null, i).getVolumen()+"",new Cilindro(null, i).getVolumen()+"");

		}
	}


	/*
	 * Cubo
	 */
	@Test
	public void test2() {
		for(int i=-100; i<500;i++) {
			assertNotNull("should not be null", new Cubo(new Cuadrado(i), i));
			assertEquals( new Cubo(new Cuadrado(i), i).toString(), new Cubo(new Cuadrado(i), i).toString());
			assertEquals(new Cubo(new Cubo(new Cuadrado(i), i)).toString(),new Cubo(new Cubo(new Cuadrado(i), i)).toString());
			assertEquals(""+new Cubo(new Cuadrado(i), i).setAltura(i),""+new Cubo(new Cuadrado(i), i).setAltura(i));
			assertEquals(new Cubo(new Cuadrado(i), i).getArea3D()+"",new Cubo(new Cuadrado(i), i).getArea3D()+"");
			assertEquals(new Cubo(new Cuadrado(i), i).getVolumen()+"",new Cubo(new Cuadrado(i), i).getVolumen()+"");
			assertEquals(new Cubo(new Cuadrado(i), i).getFiguraBase()+"",new Cubo(new Cuadrado(i), i).getFiguraBase()+"");

		}
	}

	/*
	 * Esfera
	 */
	@Test
	public void test3() {
		for(int i=-100; i<500;i++) {
			assertNotNull("should not be null", new Esfera(i));
			assertEquals( new Esfera(i).toString(), new Esfera(i).toString());
			assertEquals(new Esfera(new Esfera(i)).toString(),new Esfera(new Esfera(i)).toString());
			assertEquals(""+ new Esfera(new Esfera(i)).setRadio(i),""+ new Esfera(new Esfera(i)).setRadio(i));
			assertEquals(new Esfera(new Esfera(i)).getArea3D()+"",new Esfera(new Esfera(i)).getArea3D()+"");
			assertEquals(new  Esfera(new Esfera(i)).getVolumen()+"",new  Esfera(new Esfera(i)).getVolumen()+"");
			assertEquals(new  Esfera(new Esfera(i)).getFiguraBase()+"",new  Esfera(new Esfera(i)).getFiguraBase()+"");

		}
	}

	/*
	 * Tetraedro
	 */
	@Test
	public void test4() {
		for(int i=-100; i<500;i++) {
			assertNotNull("should not be null", new Tetraedro(new Rectangulo(i,i),i));
			assertEquals( new Tetraedro(new Rectangulo(i,i),i).toString(), new Tetraedro(new Rectangulo(i,i),i).toString());
			assertEquals(new Tetraedro(new Rectangulo(i,i),i).toString(),new Tetraedro(new Rectangulo(i,i),i).toString());
			assertEquals(""+ new Tetraedro(new Rectangulo(i,i),i).setAltura(i),""+ new Tetraedro(new Rectangulo(i,i),i).setAltura(i));
			assertEquals(new Tetraedro(new Rectangulo(i,i),i).getArea3D()+"",new Tetraedro(new Rectangulo(i,i),i).getArea3D()+"");
			assertEquals(new Tetraedro(new Rectangulo(i,i),i).getVolumen()+"",new Tetraedro(new Rectangulo(i,i),i).getVolumen()+"");
			assertEquals(new Tetraedro(new Rectangulo(i,i),i).getFiguraBase()+"",new Tetraedro(new Rectangulo(i,i),i).getFiguraBase()+"");

		}
	}

}
