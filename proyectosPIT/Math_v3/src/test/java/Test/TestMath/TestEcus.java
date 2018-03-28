package Test.TestMath;

import ClassMath.Ecuaciones;
import ClassMath.Vista;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEcus {
	

	@Test
	public void test() {
		int[] inf=new Vista(null,null).getArgEcus();
		
		double[] x0= Util.generaEntrada(inf[0]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu0(x0)+"",new Ecuaciones().ecu0(x0)+"");

		double[] x1=Util.generaEntrada(inf[1]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu1(x1)+"",new Ecuaciones().ecu1(x1)+"");
		
		double[] x2=Util.generaEntrada(inf[2]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu2(x2)+"",new Ecuaciones().ecu2(x2)+"");
		
		double[] x3=Util.generaEntrada(inf[3]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu3(x3)+"",new Ecuaciones().ecu3(x3)+"");
		
		double[] x4=Util.generaEntrada(inf[4]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu4(x4)+"",new Ecuaciones().ecu4(x4)+"");
		
		double[] x5=Util.generaEntrada(inf[5]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu5(x5)+"",new Ecuaciones().ecu5(x5)+"");
	
		double[] x6=Util.generaEntrada(inf[6]);
		assertNotNull("should not be null", new Ecuaciones());	
		assertEquals(new Ecuaciones().ecu6(x6)+"",new Ecuaciones().ecu6(x6)+"");
	}

}
