package ClassMath.TestMath_exhauxtivo;

import ClassMath.ControlMath;
import ClassMath.Vista;
import ClassMath.TestMath.Util;
import Test.Utils;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class test_Control_exhaustivo {
	

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
		int decisiones[] = {0,1,2,3,4,5,6};
		LinkedList<double[]> entradas=new LinkedList<double[]>();
		int[] inf=new Vista(null,null).getArgEcus();

		for(int op=0; op<decisiones.length;op++) {
			entradas.add(Util.generaEntrada(inf[decisiones[op]]));
		}
		

		assertNotNull("should not be null", new ControlMath(decisiones,  new double[decisiones.length], entradas));	

		//exhaustivo
		for(int op=0;op<inf.length;op++) {
			ControlMath object=new ControlMath(decisiones, new double[decisiones.length], entradas);
			double[] entrada=Util.generaEntrada(inf[op]);
			assertEquals(object.select(entrada, op)+"",object.select(entrada, op)+"");
		}
		

	}
}













