package Test.TestFigura2D_Mas_Valores;

import claseNodo.figura2D.Circulo;
import claseNodo.figura2D.Cuadrado;
import claseNodo.figura2D.Triangulo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Test2D_mas_valor {

	
	@Test
	public void test1() {
		for(int i=-100;i<500;i++) {
			assertNotNull("should not be null", new Circulo(i));
			assertEquals(new Circulo(i).toString(),new Circulo(i).toString());
			assertEquals(new Circulo(new Circulo(i)).toString(), new Circulo(new Circulo(i)).toString());
			assertEquals(""+new Circulo(i).setRadio(i),new Circulo(i).setRadio(i)+"");
			assertEquals(new Circulo(i).getArea()+"",new Circulo(i).getArea()+"");
			assertEquals(new Circulo(i).perimetro()+"",new Circulo(i).perimetro()+"");
		}
		
	}
	
	@Test
	public void test2() {
		
		for(int i=-100;i<100;i++) {
			assertNotNull("should not be null", new Cuadrado(i));
			assertEquals(new Cuadrado(i).toString(),new Cuadrado(i).toString());
			assertEquals(new Cuadrado(new Cuadrado(i)).toString(), new Cuadrado(new Cuadrado(i)).toString());
			assertEquals(""+new Cuadrado(i).setLado(i),new Cuadrado(i).setLado(i)+"");
			assertEquals(new Cuadrado(i).getArea2D()+"",new Cuadrado(i).getArea2D()+"");
			assertEquals(new Cuadrado(i).perimetro()+"",new Cuadrado(i).perimetro()+"");
		}
		
	}
	
	@Test
	public void test3() {
		
		for(int i=-100;i<100;i++) {
			double ladoBase=i+3;
			double lateraIz=4+i;//hipotenusa
			double hipotenusa=Math.pow(Math.pow(i+3, i+2)+Math.pow(i+4, i+2), i+0.5);
			double altura=i+4;
			assertNotNull("should not be null", new Triangulo(i+2,i+4,i+3,i+2));
			//assertEquals(new Triangulo(ladoBase, altura, lateraIz, hipotenusa).toString(),new Triangulo(ladoBase, altura, lateraIz, hipotenusa));
			assertEquals(new Triangulo(new Triangulo(ladoBase, altura, lateraIz, hipotenusa)).toString(), new Triangulo(new Triangulo(ladoBase, altura, lateraIz, hipotenusa)).toString());
			assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setBase(i),""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setBase(i));
			assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoIz(i),""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoIz(i));
			assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoDer(i),""+""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).setLadoDer(i));
			assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).getArea2D(),""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).getArea2D()+"");
			assertEquals(""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).perimetro()+"",""+new Triangulo(ladoBase, altura, lateraIz, hipotenusa).perimetro()+"");
		}
		
	}
	
	
		
}
