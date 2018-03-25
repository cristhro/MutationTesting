package ClassMath.TestMath;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import ClassMath.ControlMath;
import ClassMath.Vista;
import Test.Utils;

public class TestControl {
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
				int decisiones[] = {1,2,3,4,5,6,7};
				int size=decisiones.length;
				LinkedList<double[]> entradas=new LinkedList<double[]>();
				int[] inf=new Vista(null,null).getArgEcus();
			
				for(int op=0; op<decisiones.length;op++) {
					entradas.add(generaEntrada(inf[op]));
				}
				
				System.out.println("size: "+size);
				
				
		assertNotNull("should not be null", 
				new ControlMath(decisiones, new double[decisiones.length], entradas));	
		
		//se testea la funcion con un numero aleatorio
		int op=(int)Utils.getRandomArbitrary(1, 8);
		op=1;
		ControlMath object=new ControlMath(decisiones, new double[decisiones.length], entradas);
		double[] entrada=generaEntrada(inf[op-1]);
		assertEquals(object.select(entrada, op)+"",object.select(entrada, op)+"");
		
	}

}
















