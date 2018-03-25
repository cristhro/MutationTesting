package ClassMath.TestMath;

import java.util.LinkedList;

import ClassMath.ControlMath;
import ClassMath.Ecuaciones;
import ClassMath.Vista;
import Test.Utils;


public class Main {
	public static double[] generaEntrada(int size) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,2,3, 4, 5, 6
		//1,2,2,3,-1,-1,-1
		/*
		 * inicializar datos necesarios
		 */
		int decisiones[] = {1};
		int size=decisiones.length;
		LinkedList<double[]> entradas=new LinkedList<double[]>();
		int[] inf=new Vista(null,null).getArgEcus();
	
		for(int op=0; op<decisiones.length;op++) {
			entradas.add(generaEntrada(inf[op]));
		}
	
		
		/*
		double x=1.23456789;
		double precision=0.0001; 
			double v=1/precision;
			int tmp=(int) (x*v);
				
			double res0= ((double)tmp)/v;
			System.out.println(res0);
			*/
		
		
		//se testea la funcion con un numero aleatorio
				int op=(int)Utils.getRandomArbitrary(1, 8);
				op=1;
				double[] entrada=generaEntrada(inf[op-1]);
				
				System.out.println("1··················");
				double res1=new ControlMath().select(entrada, op);
				System.out.println("2··················");
				double res2=new ControlMath().select(entrada, op);
				System.out.println("3··················");
				double res3=new ControlMath().select(entrada, op);
				System.out.println("··················");
				System.out.println(res1+"=="+res2+"=="+res3);

				System.out.println("res1");
	}

}








