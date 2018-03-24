package ClassMath;

import java.util.LinkedList;


public class Vista {
	private int[] secuenciaOps;
	private int size=0;
	private double[] result;
	private LinkedList<double[]> entradas;
	//si el valor es -1, significa que la opecion elegido no tiene restriccion del numero de argumentos
	private int[] argEcus={1,2,2,3,-1,-1,-1}; 
	private int maxOp=7;
	
	public Vista() {
		this.secuenciaOps=new int[1];
		this.result=new double[1];
		result[0]=0;
		this.entradas=new LinkedList<>();
	}
	
	public Vista(int[] secuenciaOps, LinkedList<double[]> entradas) {
		this.secuenciaOps = secuenciaOps;
		if(secuenciaOps!=null) {
			this.result = new double[secuenciaOps.length];
			clearResult();
		}
		this.entradas = entradas;
		
		
		
		new ControlMath(secuenciaOps, size,  result,  entradas);
	}
	
	public int[] getArgEcus() {
		return this.argEcus;
	}
	
	public String clearResult() {
		// TODO Auto-generated method stub
		for(int i=0; i<this.result.length;i++) {
			this.result[i]=Byte.MIN_VALUE;
		}
		
		return mostrarResult();
	}

	
	public int[] add(int op, double[] entrada){
		//se expande el tama�o de la list 
		if(op>maxOp) {
			System.out.println("Error de argumento1");
			return null;
		}else {
			if(this.size==secuenciaOps.length) {
				int[] tmp=new int[(int) (size*1.5)];
				double[] tmp2=new double[(int) (size*1.5)];
				for(int j=0;j<this.size;j++) {
					tmp[j]=this.secuenciaOps[j];
					tmp2[j]=this.result[j];
				}
				tmp[size+1]=op;
				tmp2[size+1]=Byte.MIN_VALUE;
				
				this.entradas.add(entrada);
				this.secuenciaOps=tmp;
				this.result=tmp2;
			}else {
				this.entradas.add(entrada);
				this.secuenciaOps[size]=op;
				this.result[size]=Byte.MIN_VALUE;
			}
			size++;
			
			return secuenciaOps;
		}
		
	}
	
	
	
	//pide un resultado segun la posicion de la operacion
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
		//comprobar si el argumento de entrada corresponde a las opciones elegidas
		for(int i=0;i<this.argEcus.length;i++) {
			if(argEcus[i]!=-1) {
				ok=ok && (entradas.get(i).length==argEcus[i]);
			}
		}
		
		//Y argumento de entrada es valido
		for(int i=0; i<this.secuenciaOps.length;i++) {
			ok=ok && secuenciaOps[i]>=1 && secuenciaOps[i]<=maxOp;
		}
		
		return ok;
	}
}
