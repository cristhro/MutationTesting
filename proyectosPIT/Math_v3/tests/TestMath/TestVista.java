package Test.TestMath;

import ClassMath.Vista;
import Test.Utils;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class TestVista {

	
	

	@Test
	public void test() {
		//0,1,2,3, 4, 5, 6
		//1,2,2,3,-1,-1,-1
		/*
		 * inicializar datos necesarios
		 */
		int decisiones[] = {0,1,2,3,4,5,6};
		LinkedList<double[]> entradas=new LinkedList<double[]>();
		int[] inf=new Vista(null,null).getArgEcus();
	
		for(int op=0; op<decisiones.length;op++) {
			entradas.add(Util.generaEntrada(inf[op]));
		}
		
		
		/**
		 *parte de testing 
		 */
		
		//aleatorio
		//int op=(int)Utils.getRandomArbitrary(0, 7);
		int op=1;
		double[] a=Util.generaEntrada(inf[op]);
		//System.out.println("a length: "+a.length);
		assertArrayEquals(new Vista().add(op,a), new Vista().add(op,a));
		assertArrayEquals(new Vista(decisiones,entradas).add(op,a), 
				new Vista(decisiones,entradas).add(op,a));
		
		
		assertArrayEquals(new Vista(decisiones,entradas).add(op,a), 
				new Vista(decisiones,entradas).add(op,a));
		assertEquals(new Vista(decisiones,entradas).check()+"",new Vista(decisiones,entradas).check()+"");
		int res=(int)Utils.getRandomArbitrary(0, 7);
		assertEquals(new Vista(decisiones,entradas).getResult(res),new Vista(decisiones,entradas).getResult(res));

		
		
		//parte comun, que no se afecta por usar aleatorio y exhaustivo
		assertNotNull("should not be null", new Vista(decisiones,entradas));	
		assertNotNull("should not be null", new Vista());	
		assertArrayEquals(new Vista(null,null).getArgEcus(), new Vista(null,null).getArgEcus() );
		assertEquals(new Vista(decisiones,entradas).clearResult(),new Vista(decisiones,entradas).clearResult());
		assertEquals(new Vista(decisiones,entradas).mostrarResult(),new Vista(decisiones,entradas).mostrarResult());

		
	}



}
