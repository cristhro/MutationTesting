import java.util.ArrayList;

public class RecursiveTable {
	
	/**
	 * Llamada a la funci�n recursiva
	 * @param args
	 */
	public static void main(String args[]) {
		int nivel = 3;
		
	    int numNodos = obtenerNumNodos(nivel);
	    ArrayList<ArrayList<Integer>> mutantes = generateMutants(numNodos);
	    ArrayList<Integer> testSuite = obtenerTestSuites(numNodos);
	    ArrayList<Integer> mutanteOriginal = mutantes.remove(0);
	    
	    int totalMutantes = mutantes.size();
	    int totalKilled = 0;
	    
	    		boolean killed = false;
	    		//Recorremos mutantes
			for (int j = 0; j < mutantes.size(); j++) {
				 int i = 0;
				 // Recorremos los testsuites
				 while(!killed && i < testSuite.size()) {
					 if (mutanteOriginal.get(testSuite.get(i)) != mutantes.get(j).get(testSuite.get(i))) {
						 killed = true;
						 totalKilled++;
					 }else {
						 i++;
					 }
				}
				
			}
		double a = totalKilled, b =  totalMutantes;
			System.out.println(a/b);
	    
	}
	private static   ArrayList<Integer> obtenerTestSuites(int numNodos) {
		ArrayList<Integer> testSuite = new ArrayList<Integer> ();
		testSuite.add(0);
		testSuite.add(1);
		return  testSuite;
	}
	private static  Integer obtenerNumNodos(int nivel) {
		return  (int) Math.pow(2, nivel) - 1;
	}
	private static  ArrayList<ArrayList<Integer>> generateMutants(int numNodos) {
		ArrayList<ArrayList<Integer>> mutantes = new ArrayList<ArrayList<Integer>>();
		generateTableRec(0, numNodos, new int[numNodos], mutantes );
		return mutantes;
	}
	/**
	 * Funci�n recursiva
	 * @param index
	 * @param size
	 * @param current
	 */
	
	private static void generateTableRec(int index, int size, int[] current, ArrayList<ArrayList<Integer>> mutantes) {
	    if(index == size) { // generated a full "solution"
	    		ArrayList<Integer> mutante = new ArrayList<Integer> ();
	        for(int i = 0; i < size; i++) {
	        		mutante.add(current[i]);
	            //System.out.print(current[i] + " ");
	        }
	        mutantes.add(mutante);
	        //System.out.println();
	    } else {
	        for(int i = 0; i < 2; i++) {
	            current[index] = i;
	            generateTableRec(index + 1, size, current, mutantes);
	        }
	    }
	}
}
