package ClassMath;

import java.util.LinkedList;

public class ControlMath {
	private Ecuaciones ecus;
	
	
	public ControlMath(int[] secuenciaOps, int size, double[] result, LinkedList<double[]> entradas) {
		// TODO Auto-generated constructor stub
		for(int i=0;i>size;i++) {
			result[i]=select(entradas.get(i),secuenciaOps[i]);
		}
	}


	public double select(double[] entrada, int index) {
		switch(index) {
			case 1:
				return ecus.ecu1(entrada);
			case 2:
				return ecus.ecu2(entrada);
			case 3:
				return ecus.ecu3(entrada);
			case 4:
				return ecus.ecu4(entrada);
			case 5:
				return ecus.ecu5(entrada);
			case 6:
				return ecus.ecu6(entrada);
			default:
				return Byte.MIN_VALUE;
		}
	}
}
