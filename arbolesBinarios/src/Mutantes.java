import java.util.ArrayList;

public class Mutantes {
	static ArrayList<ArrayList<Integer>> conjuntoMutantes=
			new ArrayList<ArrayList<Integer>>();
	
	static  ArrayList<ArrayList<Integer>> getMutantes(ArrayList<Integer> list){
		if(list.size()==1){
			conjuntoMutantes.add(list);
		}else{
			int cabeza= list.remove(0);
			getMutantes(list);
			generaAux(cabeza);
		}
		return conjuntoMutantes;
	}

	private static void generaAux( int cabeza) {
		ArrayList<ArrayList<Integer>> tempConjunto = new ArrayList<ArrayList<Integer>>();
			  
		for(ArrayList<Integer> x : conjuntoMutantes){
			int posiciones=x.size()+1;
			for(int i=0; i<posiciones;i++){
				ArrayList<Integer> nuevoHijo=new ArrayList<Integer>(x);
				nuevoHijo.add(i, cabeza);
				tempConjunto.add(nuevoHijo);
			}
		}
		conjuntoMutantes=tempConjunto;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		getMutantes(list);
		
		for(ArrayList<Integer> x : conjuntoMutantes){
			System.out.println(x);
		}
		
	}
}


