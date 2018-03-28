package ClassMath.TestMath_exhauxtivo;

import ClassMath.Vista;
import ClassMath.TestMath.Util;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class test_vista_exhauxtivo {
	 public static double getRandomArbitrary(int min, int max) {
			return Math.random() * (max - min) + min;
		}

	/*
	 * se usa la funcion generaEntrada. Es decir, el numero de entrada para las funciones que no restringe nuemro de
	 * entradas es aleatorio
	 */

	@Test
	public void test() {
		//0,1,2,3, 4, 5, 6
		//1,2,2,3,-1,-1,-1
		/*
		 * inicializar datos necesarios
		 */
		int decisiones[] = {-1,0,1,2,3,4,5,6,3,4,5,6,7};
		LinkedList<double[]> entradas=new LinkedList<double[]>();
		Vista vista=new Vista();
		int max=vista.getNumOps();
		for(int op=-100; op<100;op++) {
			entradas.add(Util.generaEntrada(vista.getArgEcus(op%max)));
		}

		//exhauxtivo
		for(int op=0;op<decisiones.length;op++) {
			//System.out.println("-------------");
			//System.out.println("op: "+op);
			
			double[] a=Util.generaEntrada(vista.getArgEcus(decisiones[op]));
			assertArrayEquals(new Vista().add(decisiones[op],a), new Vista().add(decisiones[op],a));

			assertArrayEquals(new Vista(decisiones,entradas).add(decisiones[op],a), 
					new Vista(decisiones,entradas).add(decisiones[op],a));
			
		}
		
		for(int op=-100;op<100;op++) { 
			assertEquals(new Vista(decisiones,entradas).getResult(op),new Vista(decisiones,entradas).getResult(op));
			assertEquals(new Vista(decisiones,entradas).getArgEcus(op),new Vista(decisiones,entradas).getArgEcus(op));
			assertEquals(new Vista(null,entradas).getArgEcus(op),new Vista(null,entradas).getArgEcus(op));
		}
  

		//parte comun, que no se afecta por usar aleatorio y exhaustivo
		assertEquals(new Vista(decisiones,entradas).check()+"",new Vista(decisiones,entradas).check()+"");
		int[] d= {5,6,7};
		assertEquals(new Vista(d,entradas).check()+"",new Vista(d,entradas).check()+"");
		assertNotNull("should not be null", new Vista(decisiones,entradas));
		assertNotNull("should not be null", new Vista(null,entradas));	
		assertNotNull("should not be null", new Vista(null,null));	
		assertNotNull("should not be null", new Vista(decisiones,null));	
		assertNotNull("should not be null", new Vista());	
		
		assertArrayEquals(new Vista(decisiones,entradas).add(-10,null), 
				new Vista(decisiones,entradas).add(-10,null));
		assertArrayEquals(new Vista(decisiones,entradas).add(100,null), 
				new Vista(decisiones,entradas).add(100,null));
		assertEquals(new Vista(decisiones,entradas).clearResult(),new Vista(decisiones,entradas).clearResult());
		assertEquals(new Vista(null,entradas).clearResult(),new Vista(null,entradas).clearResult());
		assertEquals(new Vista(decisiones,null).clearResult(),new Vista(decisiones,null).clearResult());
		assertEquals(new Vista(null,null).clearResult(),new Vista(null,null).clearResult());

		
		assertEquals(new Vista(decisiones,entradas).mostrarResult(),new Vista(decisiones,entradas).mostrarResult());

		
	}

}







