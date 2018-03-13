package ClassMath;

public class Ecuaciones {
	public double ecu5(double[] xs) {
		double result = 0.0;
		double xi;
		
		for(int i = 1; i <= xs.length; i++) {	
			xi=xs[i-1];
			
			double a=((i+1)*Math.pow(xi, 2))/Math.PI;
			double b=Math.pow(Math.sin(a), 20);
			
			result +=  Math.sin(xi)* b; 
		}
				
		 return -result;
	}
	
	
	public double ecu4(double[] xs) {
		double x1=xs[0];
		double x2=xs[1];
		int top=(int)xs[2];
		
		double a=0.0;
		for(int i =1; i <= top; i++) {
			a+=i*Math.cos((i+1)*x1+i);
		}
				
		double b=0.0;
		for(int i = 1; i <= top; i++) {
			b+=i*Math.cos((i+1)*x2+i);
		}
			
		return a*b;
	}
	
	
	public double ecu3(double[] xs) {
		double x1=xs[0];
		double x2=xs[1];
		 		
		return 21.5+x1*Math.sin(4*Math.PI*x1)+x2*Math.sin(20*Math.PI*x2);
	}
	
	
	public double ecu2(double[] genes) {
		double x1=genes[0];
		double x2=genes[1];
		double a=Math.sqrt(Math.abs(x2+(x1/2.0)+47));
		double b=Math.sqrt(Math.abs(x1-(x2+47)));
		return -(x2+47)*Math.sin(a)-x1*Math.sin(b);
	}
	
	public double ecu1(double[] genes) {
		double x=genes[0];
		double a = 20.0 *  Math.pow((Math.E),(-0.2*Math.abs(x)));
		double b = Math.pow(Math.E, Math.cos(2*Math.PI*x));
		return -(20 + Math.E - a - b);
	}


	public double ecu6(double[] entrada) {
		// TODO Auto-generated method stub
		double x=0;
		for(int i=0; i<entrada.length; i++) {
			x*=entrada[i];
		}
		return x;
	}
	
}
