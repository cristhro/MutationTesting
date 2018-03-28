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

public class Test3D_con_valor_aleatorio {
	 double x=0;
	 public static double getRandomArbitrary(int min, int max) {
			return Math.random() * (max - min) + min;
		}
	 @Test
		public void test1() {
			for(int i=-100; i<500;i++) {
				x=getRandomArbitrary(-9999,9999);
				assertNotNull("should not be null", new Cilindro(new Circulo(x), x));
				x= getRandomArbitrary(-9999,9999);

				assertEquals( new Cilindro(new Circulo(x), x).toString(), new Cilindro(new Circulo(x), x).toString());
				x= getRandomArbitrary(-9999,9999);


				assertEquals(""+ new Cilindro(new Circulo(x), x).setAltura(x),""+ new Cilindro(new Circulo(x), x).setAltura(x));
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Cilindro(new Circulo(x), x).getArea3D()+"",new Cilindro(new Circulo(x), x).getArea3D()+"");
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Cilindro(new Circulo(x), x).getVolumen()+"",new Cilindro(new Circulo(x), x).getVolumen()+"");

			}
		}


		@Test
		public void test2() {
			for(int i=-100; i<500;i++) {
				x= getRandomArbitrary(-9999,9999);

				assertNotNull("should not be null", new Cubo(new Cuadrado(x), x));

				x= getRandomArbitrary(-9999,9999);
				assertEquals( new Cubo(new Cuadrado(x), x).toString(), new Cubo(new Cuadrado(x), x).toString());
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Cubo(new Cubo(new Cuadrado(x), x)).toString(),new Cubo(new Cubo(new Cuadrado(x), x)).toString());
				x= getRandomArbitrary(-9999,9999);
				
				assertEquals(""+new Cubo(new Cuadrado(x), x).setAltura(x),""+new Cubo(new Cuadrado(x), x).setAltura(x));
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Cubo(new Cuadrado(x), x).getArea3D()+"",new Cubo(new Cuadrado(x), x).getArea3D()+"");
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Cubo(new Cuadrado(x), x).getVolumen()+"",new Cubo(new Cuadrado(x), x).getVolumen()+"");
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Cubo(new Cuadrado(x), x).getFiguraBase()+"",new Cubo(new Cuadrado(x), x).getFiguraBase()+"");

			}
		}

		@Test
		public void test3() {
			for(int i=-100; i<500;i++) {
				x= getRandomArbitrary(-9999,9999);

				assertNotNull("should not be null", new Esfera(x));

				x= getRandomArbitrary(-9999,9999);

				assertEquals( new Esfera(x).toString(), new Esfera(x).toString());
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Esfera(new Esfera(x)).toString(),new Esfera(new Esfera(x)).toString());
				
				x= getRandomArbitrary(-9999,9999);

				assertEquals(""+ new Esfera(new Esfera(x)).setRadio(x),""+ new Esfera(new Esfera(x)).setRadio(x));
				x= getRandomArbitrary(-9999,9999);

				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Esfera(new Esfera(x)).getArea3D()+"",new Esfera(new Esfera(x)).getArea3D()+"");
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new  Esfera(new Esfera(x)).getVolumen()+"",new  Esfera(new Esfera(x)).getVolumen()+"");
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new  Esfera(new Esfera(x)).getFiguraBase()+"",new  Esfera(new Esfera(x)).getFiguraBase()+"");

			}
		}

		@Test
		public void test4() {
			for(int i=-100; i<500;i++) {
				x= getRandomArbitrary(-9999,9999);

				assertNotNull("should not be null", new Tetraedro(new Rectangulo(x,x),x));
				x= getRandomArbitrary(-9999,9999);

				assertEquals( new Tetraedro(new Rectangulo(x,x),x).toString(), new Tetraedro(new Rectangulo(x,x),x).toString());
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Tetraedro(new Rectangulo(x,x),x).toString(),new Tetraedro(new Rectangulo(x,x),x).toString());
				x= getRandomArbitrary(-9999,9999);

				assertEquals(""+ new Tetraedro(new Rectangulo(x,x),x).setAltura(x),""+ new Tetraedro(new Rectangulo(x,x),x).setAltura(x));
				x= getRandomArbitrary(-9999,9999);

				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Tetraedro(new Rectangulo(x,x),x).getArea3D()+"",new Tetraedro(new Rectangulo(x,x),x).getArea3D()+"");
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Tetraedro(new Rectangulo(x,x),x).getVolumen()+"",new Tetraedro(new Rectangulo(x,x),x).getVolumen()+"");
				x= getRandomArbitrary(-9999,9999);

				assertEquals(new Tetraedro(new Rectangulo(x,x),x).getFiguraBase()+"",new Tetraedro(new Rectangulo(x,x),x).getFiguraBase()+"");

				
			}
		}


}
