package Test.TestFigura2D_exhauxtivo;

import static org.junit.Assert.*;

import org.junit.Test;

import claseNodo.figura2D.Circulo;
import claseNodo.figura2D.Cuadrado;
import claseNodo.figura2D.Triangulo;

public class Test2D_con_valor_aleatorio {
	 double x=0;
	 
	 public static double getRandomArbitrary(int min, int max) {
			return Math.random() * (max - min) + min;
		}
	 
	@Test
	public void test1() {
		for(int i=-100;i<500;i++) {
			x= getRandomArbitrary(-9999, 9999);
			assertNotNull("should not be null", new Circulo(x));
			x= getRandomArbitrary(-9999, 9999);
			assertEquals(new Circulo(x).toString(),new Circulo(x).toString());
			x= getRandomArbitrary(-9999, 9999);

			assertEquals(new Circulo(new Circulo(x)).toString(), new Circulo(new Circulo(x)).toString());
			x= getRandomArbitrary(-9999, 9999);

			assertEquals(""+new Circulo(x).setRadio(x),new Circulo(x).setRadio(x)+"");
			x= getRandomArbitrary(-9999, 9999);

			assertEquals(new Circulo(x).getArea()+"",new Circulo(x).getArea()+"");
			x= getRandomArbitrary(-9999, 9999);

			assertEquals(new Circulo(x).perimetro()+"",new Circulo(x).perimetro()+"");
		}
		
	}
	
	
	@Test
	public void test2() {
		
		for(int i=-100;i<500;i++) {
			x= getRandomArbitrary(-9999,9999);
			assertNotNull("should not be null", new Cuadrado(4));
			x= getRandomArbitrary(-9999,9999);
			assertEquals(new Cuadrado(4).toString(),new Cuadrado(4).toString());
			x= getRandomArbitrary(-9999,9999);
			assertEquals(new Cuadrado(new Cuadrado(4)).toString(), new Cuadrado(new Cuadrado(4)).toString());
			x= getRandomArbitrary(-9999,9999);
			assertEquals(""+new Cuadrado(4).setLado(4),new Cuadrado(4).setLado(4)+"");
			x= getRandomArbitrary(-9999,9999);
			assertEquals(new Cuadrado(4).getArea2D()+"",new Cuadrado(4).getArea2D()+"");
			x= getRandomArbitrary(-9999,9999);
			assertEquals(new Cuadrado(4).perimetro()+"",new Cuadrado(4).perimetro()+"");
		}
		
	}
	
	@Test
	public void test3() {
		
		for(int i=-100;i<500;i++) {
			x= getRandomArbitrary(-9999,9999);
			double ladoBase=x+3;
			x= getRandomArbitrary(-9999,9999);
			double lateraIz=4+x;//hipotenusa
			x= getRandomArbitrary(-9999,9999);
			double hipotenusa=Math.pow(Math.pow(x+3, x+2)+Math.pow(x+4, x+2), x+0.5);
			x= getRandomArbitrary(-9999,9999);
			double altura=x+4;
			x= getRandomArbitrary(-9999,9999);
			assertNotNull("should not be null", new Triangulo(x+2,x+4,x+3,x+2));
			//assertEquals(new Triangulo(ladoBase, altura, lateraIz, hipotenusa).toString(),new Triangulo(ladoBase, altura, lateraIz, hipotenusa));
			x= getRandomArbitrary(-9999,9999);
			assertEquals(new Triangulo(new Triangulo(ladoBase, altura, lateraIz, hipotenusa)).toString(), new Triangulo(new Triangulo(ladoBase, altura, lateraIz, hipotenusa)).toString());
			x= getRandomArbitrary(-9999,9999);
			assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setBase(4),""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setBase(4));
			x= getRandomArbitrary(-9999,9999);
			assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoIz(4),""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoIz(4));
			x= getRandomArbitrary(-9999,9999);
			assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoDer((int)x),""+""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoDer((int)x));
			x= getRandomArbitrary(-9999,9999);
			assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).getArea2D(),""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).getArea2D()+"");
			x= getRandomArbitrary(-9999,9999);
			assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).perimetro()+"",""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).perimetro()+"");
		}
		
	}

}
