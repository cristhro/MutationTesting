import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import es.tfg.arboles.Arbol;
import es.tfg.arboles.Datos;
import es.tfg.arboles.Tools;

public class Main {

    public static void main (String [ ] args) {
    		/*Tools tool = new Tools();
    		
        // 1 Creamos el array con numeros aleatorios, establecidos dentro de un rango
        int[] numerosAleatorios = tool.obtenerArrayAleatorio(7,1,2);
        
        // 2 Creamos el arbol a partir del array aleatorio
        Arbol arbolBinario = new Arbol(numerosAleatorios);

        // 3 Mostramos el arbol 
        System.out.println("<-- Recorrido preorden");
        arbolBinario.recorridoPreorden();
        
        // 4 Obtenemos los outPuts
        int[] list={1,0};
        
        System.out.println();
        ArrayList<Integer> intputs =new ArrayList<Integer>();
        
        for (int i= 0; i< list.length ; i++) {intputs.add(list[i]);}
        ArrayList<Datos> outputs = arbolBinario.getOutputs(intputs);
        System.out.println("< -- Salida a partir de entrada");
        System.out.println(outputs);
        
        // 5 Obtenemos los caminos
        HashMap<Integer,ArrayList<ArrayList<Integer>>> caminos  = arbolBinario.getCaminos();
        System.out.println("<-- Caminos");
        System.out.println(caminos);
        */
        // 6 Obtener colleccion de arboles mutantes
        ArrayList<Arbol> coleccionArboles = new ArrayList<Arbol>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        int n = 3;
        
        for(int i=0;i<n;i++) {
        		list2.add(i);
        }
		int nivelesArbol =  (int) (Math.log(n)/Math.log(2));	//Para nosotros niveles del arbol significa numero de inputs maximo

		int nivel = 4;	
	    int numNodos = RecursiveTable.obtenerNumNodos(nivel);
	    
		// Generamos arboles con los mutantes
	    Mutantes.getMutantes(list2);
	    
		for(ArrayList<Integer> mutante : Mutantes.conjuntoMutantes){
			Arbol arbolBinario = new Arbol(mutante);
			coleccionArboles.add(arbolBinario);
		}
		
		System.out.println(coleccionArboles.size());
		// Obtenemos arbol correcto (este es con el que vamos a comparar)
		Arbol arbolCorrecto = coleccionArboles.remove(0);
		
		HashMap<Integer,ArrayList<ArrayList<Integer>>> conjuntoOutputs  = arbolCorrecto.getCaminosOutputs();
		HashMap<Integer,ArrayList<ArrayList<Integer>>> caminosInput  = arbolCorrecto.getCaminosInputs();
       
        // Obtenemos la coleccion de los inputs
        HashMap<Integer,ArrayList<ArrayList<Integer>>> conjuntoInputs = arbolCorrecto.getCaminosInputs();
        Integer  numKilled = 0, numTotalMutantes = coleccionArboles.size() ;

        // Recorremos los niveles
        for (int niveli = 1; niveli <= caminosInput.size(); niveli++) {
        	 	// Recorremos los inputs de todos los niveles
        		ArrayList<ArrayList<Integer>> listaInputsNivel = conjuntoInputs.get(niveli);
			for (ArrayList<Integer> inputNivel : listaInputsNivel) {
			        	 	
	        		// Obtenemos el outputOriginal
	        	 	ArrayList<Integer> outputsOriginal = arbolCorrecto.getOutputs(inputNivel);
	        	 	
	        	 	// Recorremos la coleccion de arboles mutantes
	            for (Arbol arbol : coleccionArboles) {
	                	 ArrayList<Integer> outPutArbol = arbol.getOutputs(inputNivel);
	                	 if(!arbol.isKilled()) {
		        			if (!outPutArbol.equals(outputsOriginal)){
		        					numKilled++;
		        					arbol.setKilled(true);			
		        			}
	                	 }
	        		}
			}
			
			// fin nivel
			Integer numSobreviven = numTotalMutantes - numKilled ;
	        System.out.println("Total mutantes: " + numTotalMutantes );
	        System.out.println("Sobreviven: " + numSobreviven );
	        System.out.println("Mueren: " + numKilled);
        }  
   }    
}
