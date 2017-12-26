package es.tfg.mutantes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import es.tfg.arboles.Arbol;
import es.tfg.arboles.Datos;
import es.tfg.arboles.Tools;

public class Main {

    public static void main (String [ ] args) {
        // 6 Obtener colleccion de arboles mutantes
    		Mutantes mutantes = new Mutantes();
    		
    		// Obtenemos los arboles mutados
    		ArrayList<LinkedList<Integer>> coleccionListasMutantes = mutantes.generarColeccionListasMutantes();
        ArrayList<Arbol> coleccionArboles = mutantes.getColeccionArbolMutantes(coleccionListasMutantes);
		
        // calcular las estadisticas
        Integer  numKilled = 1, numTotalMutantes = coleccionArboles.size() ;
        
        System.out.println(coleccionListasMutantes);
		// Obtenemos arbol correcto (este es con el que vamos a comparar)
		Arbol arbolCorrecto = coleccionArboles.remove(0);
		
		HashMap<Integer,ArrayList<ArrayList<Integer>>> conjuntoOutputs  = arbolCorrecto.getCaminosOutputs();
		HashMap<Integer,ArrayList<ArrayList<Integer>>> caminosInput  = arbolCorrecto.getCaminosInputs();
       
        // Obtenemos la coleccion de los inputs
        HashMap<Integer,ArrayList<ArrayList<Integer>>> conjuntoInputs = arbolCorrecto.getCaminosInputs();

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
