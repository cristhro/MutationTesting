package ClassMath;

import java.util.LinkedList;


public class Vista {
	private int[] secuenciaOps;
	private int size=0;
	private double[] result;
	private LinkedList<double[]> entradas;
	private int[] argEcus={1,2,2,3,-1,-1}; 
	
	
	public Vista(int[] secuenciaOps, LinkedList<double[]> entradas) {
		this.secuenciaOps = secuenciaOps;
		this.result = new double[secuenciaOps.length];
		this.entradas = entradas;
		
		clearResult();
		
		new ControlMath(secuenciaOps, size,  result,  entradas);
	}
	
	public void clearResult() {
		// TODO Auto-generated method stub
		for(int i=0; i<this.result.length;i++) {
			this.result[i]=Byte.MIN_VALUE;
		}
		
	}

	public String add(int x, double[] entrada){
		if(this.size==secuenciaOps.length) {
			int[] tmp=new int[(int) (size*1.5)];
			double[] tmp2=new double[(int) (size*1.5)];
			for(int j=0;j<this.size;j++) {
				tmp[j]=this.secuenciaOps[j];
				tmp2[j]=this.result[j];
			}
			tmp[size+1]=x;
			tmp2[size+1]=Byte.MIN_VALUE;
			
			this.entradas.add(entrada);
			this.secuenciaOps=tmp;
			this.result=tmp2;
		}else {
			this.entradas.add(entrada);
			this.secuenciaOps[size]=x;
			this.result[size]=Byte.MIN_VALUE;
		}
		size++;
		
		return showEcuaciones();
	}
	public String showEcuaciones() {
		String s="";
		for(int i=0; i<size;i++) {
			s+=this.secuenciaOps[i];
		}
		return s;
	}
	
	public String getResult(int index) {
		if(this.secuenciaOps==null) {
			return "no hay ecuacion seleccionada";
		}else if(index>=size) {
			return "null";
		}else if(this.result[index]==-1){
			return "aun no tiene resultado";
		}else {
			return this.result[index]+"";
		}
	}
	
	public String mostrarResult() {
		String s="";
		for(int i=0;i<this.size;i++) {
			s+="[ Ec"+i+" : "+this.result[i]+" ]\n";
		}
		return s;
	}
	
	public boolean check() {
		boolean ok=true;
		for(int i=0;i<this.argEcus.length;i++) {
			if(argEcus[i]!=-1) {
				ok=ok && (entradas.get(i).length==argEcus[i]);
			}
		}
		return ok;
	}
}
