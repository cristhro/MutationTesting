package ClassMath.TestMath_exhauxtivo;

import ClassMath.ControlMath;
import ClassMath.Vista;
import Test.Utils;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class test_ControlMath_exhaustivo {
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
			entradas.add(generaEntrada(inf[decisiones[op]]));
		}
		

		assertNotNull("should not be null", new ControlMath(decisiones,  new double[decisiones.length], entradas));	

		//se testea la funcion con un numero aleatorio
		int op=(int)Utils.getRandomArbitrary(0, 7);
		ControlMath object=new ControlMath(decisiones, new double[decisiones.length], entradas);
		double[] entrada=generaEntrada(inf[op]);
		assertEquals(object.select(entrada, op)+"",object.select(entrada, op)+"");

	}
}













