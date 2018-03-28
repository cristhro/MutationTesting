package Test.TestMath_exhauxtivo;

import ClassMath.Vista;
import Test.Utils;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class test_Math_exhauxtivo {
	private double[] generaEntrada(int size) {
		if(size>0) {
			double[] entrada= new double[size];
			for(int i=0; i<size;i++) {
				entrada[i]=Utils.getRandomArbitrary(0, 99);
			}
			return entrada;
		}else {
			int len=(int) Utils.getRandomArbitrary(0, 99);
			double[] entrada= new double[len];
			for(int i=0; i<len;i++) {
				entrada[i]=Utils.getRandomArbitrary(0, 99);
			}
			return entrada;
		}

	}

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
			entradas.add(generaEntrada(inf[op]));
		}

		//exhauxtivo
		for(int op=0;op<decisiones.length;op++) {
			System.out.println("-------------");
			System.out.println("op: "+op);
			int index=decisiones[op];//sacar la posicion donde guarda la opcion tomada
			int size=inf[index];
			double[] a=generaEntrada(size);
			//System.out.println("longitud de entrada: "+a.length);
			assertArrayEquals(new Vista().add(op,a), new Vista().add(op,a));
			
		assertArrayEquals(new Vista(decisiones,entradas).add(op,a), 
					new Vista(decisiones,entradas).add(op,a));
						assertArrayEquals(new Vista(decisiones,entradas).add(op,a), 
					new Vista(decisiones,entradas).add(op,a));
			assertEquals(new Vista(decisiones,entradas).check()+"",new Vista(decisiones,entradas).check()+"");
			int res=(int)Utils.getRandomArbitrary(1, 8);
			assertEquals(new Vista(decisiones,entradas).getResult(res),new Vista(decisiones,entradas).getResult(res));
		}
		

	//parte comun, que no se afecta por usar aleatorio y exhaustivo
	assertNotNull("should not be null", new Vista(decisiones,entradas));	
	assertNotNull("should not be null", new Vista());	
	assertArrayEquals(new Vista(null,null).getArgEcus(), new Vista(null,null).getArgEcus() );
	assertEquals(new Vista(decisiones,entradas).clearResult(),new Vista(decisiones,entradas).clearResult());
	assertEquals(new Vista(decisiones,entradas).mostrarResult(),new Vista(decisiones,entradas).mostrarResult());

}

}







