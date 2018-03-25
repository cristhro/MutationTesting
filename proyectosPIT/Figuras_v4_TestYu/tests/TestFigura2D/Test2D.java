package Test.TestFigura2D;

import static org.junit.Assert.*;

import org.junit.Test;

import claseNodo.figura2D.Circulo;
import claseNodo.figura2D.Cuadrado;
import claseNodo.figura2D.Triangulo;

public class Test2D {

	
/**
 * 	public void test() {
 * Vagabundo vagabundo=new Vagabundo("Juan", null, 0, false, null);
		assertEquals("Juan", vagabundo.getNombre());
	}
 */
	
	
	@Test
	public void test1() {
		assertNotNull("should not be null", new Circulo(33));
		assertEquals(new Circulo(33).toString(),new Circulo(33).toString());
		assertEquals(new Circulo(new Circulo(44)).toString(), new Circulo(new Circulo(44)).toString());
		assertEquals(""+new Circulo(33).setRadio(55),new Circulo(33).setRadio(55)+"");
		assertEquals(new Circulo(1).getArea()+"",new Circulo(1).getArea()+"");
		assertEquals(new Circulo(10).perimetro()+"",new Circulo(10).perimetro()+"");
	}
	
	@Test
	public void test2() {
		assertNotNull("should not be null", new Cuadrado(33));
		assertEquals(new Cuadrado(33).toString(),new Cuadrado(33).toString());
		assertEquals(new Cuadrado(new Cuadrado(44)).toString(), new Cuadrado(new Cuadrado(44)).toString());
		assertEquals(""+new Cuadrado(33).setLado(55),new Cuadrado(33).setLado(55)+"");
		assertEquals(new Cuadrado(1).getArea2D()+"",new Cuadrado(1).getArea2D()+"");
		assertEquals(new Cuadrado(10).perimetro()+"",new Cuadrado(10).perimetro()+"");
	}
	
	@Test
	public void test3() {
		double ladoBase=3;
		double lateraIz=4;//hipotenusa
		double hipotenusa=Math.pow(Math.pow(3, 2)+Math.pow(4, 2), 0.5);
		double altura=4;
		assertNotNull("should not be null", new Triangulo(2,4,3,2));
		//assertEquals(new Triangulo(ladoBase, altura, lateraIz, hipotenusa).toString(),new Triangulo(ladoBase, altura, lateraIz, hipotenusa));
		assertEquals(new Triangulo(new Triangulo(ladoBase, altura, lateraIz, hipotenusa)).toString(), new Triangulo(new Triangulo(ladoBase, altura, lateraIz, hipotenusa)).toString());
		assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setBase(55),""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setBase(55));
		assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoIz(5),""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoIz(5));
		assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoDer(1),""+""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoDer(1));
		assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).getArea2D(),""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).getArea2D()+"");
		assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).perimetro()+"",""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).perimetro()+"");
	}
		
}
