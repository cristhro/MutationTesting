package ClassMath.TestMath;

import org.junit.Test;

import ClassMath.Ecuaciones;
import ClassMath.Vista;
import Test.Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEcus {
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
		int[] inf=new Vista(null,null).getArgEcus();
		
		double[] x0=generaEntrada(inf[0]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu0(x0)+"",new Ecuaciones().ecu0(x0)+"");

		double[] x1=generaEntrada(inf[1]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu1(x1)+"",new Ecuaciones().ecu1(x1)+"");
		
		double[] x2=generaEntrada(inf[2]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu2(x2)+"",new Ecuaciones().ecu2(x2)+"");
		
		double[] x3=generaEntrada(inf[3]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu3(x3)+"",new Ecuaciones().ecu3(x3)+"");
		
		double[] x4=generaEntrada(inf[4]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu4(x4)+"",new Ecuaciones().ecu4(x4)+"");
		
		double[] x5=generaEntrada(inf[5]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu5(x5)+"",new Ecuaciones().ecu5(x5)+"");
	
		double[] x6=generaEntrada(inf[6]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu6(x6)+"",new Ecuaciones().ecu6(x6)+"");
	}

}
