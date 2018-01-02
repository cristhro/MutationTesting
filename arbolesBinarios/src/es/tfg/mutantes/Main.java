package es.tfg.mutantes;
import java.io.File;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import es.tfg.arboles.Arbol;
import es.tfg.arboles.Datos;
import es.tfg.arboles.Tools;
import es.tfg.ficheros.Fichero;

public class Main {

    public static void main (String [ ] args) {
    		String nombreFich = "mutantes2.txt";
    	    Fichero fichero = new Fichero(nombreFich);
    		
    	    // Conjunto de datos que van a permutar
    		LinkedList<Integer> conjunto = new LinkedList<Integer>();
    		
    		for (int i = 1; i < 4; i++) {
    			conjunto.add(i);
		}
    		
    		Mutantes mutantes = new Mutantes(conjunto);
  
    		// Generamos el fichero de los mutantes
    		mutantes.generarFicheroMutantes(nombreFich);

    		
        // calcular las estadisticas
        Integer  numKilled = 1, numTotalMutantes = 0 ;
      
        // Obtenemos el arbol correcto del fichero
   
        fichero.abrirFicheroIn();
		Arbol arbolCorrecto = new Arbol(fichero.leerListaEnteros(fichero.getScanner()));
		fichero.cerrarFicheroIn();
		
		// Conjunto de inputs y outPuts del arbol correcto
		HashMap<Integer,ArrayList<ArrayList<Integer>>> conjuntoOutputs  = arbolCorrecto.getCaminosOutputs();
        HashMap<Integer,ArrayList<ArrayList<Integer>>> conjuntoInputs = arbolCorrecto.getCaminosInputs();

        // Recorremos los niveles
        for (int niveli = 1; niveli <= conjuntoInputs.size(); niveli++) {
        	
        	 	// Recorremos los inputs de todos los niveles
        		ArrayList<ArrayList<Integer>> listaInputsNivel = conjuntoInputs.get(niveli);
			for (ArrayList<Integer> inputNivel : listaInputsNivel) {
			        	 	
	        		// Obtenemos el outputOriginal
	        	 	ArrayList<Integer> outputsOriginal = arbolCorrecto.getOutputs(inputNivel);
	        	 	
	        	 	// Recorremos la coleccion de arboles mutantes del fichero
	        	 	fichero.abrirFicheroIn();
	        	 	while (fichero.getScanner().hasNextInt()) {
	        	 		Arbol arbol = new Arbol(fichero.leerListaEnteros(fichero.getScanner()));
	        	 		
	        	 		ArrayList<Integer> outPutArbol = arbol.getOutputs(inputNivel);
	                	 if(!arbol.isKilled()) {
		        			if (!outPutArbol.equals(outputsOriginal)){
		        					numKilled++;
		        					arbol.setKilled(true);			
		        			}
	                	 }
	                	 
	                	 numTotalMutantes ++;
	        	 	}
	        	 	fichero.cerrarFicheroIn();
			}
			
			// fin nivel
			System.out.println("Nivel < " + niveli + " >");
			Integer numSobreviven = numTotalMutantes - numKilled ;
	        System.out.println("Total mutantes: " + numTotalMutantes );
	        System.out.println("Sobreviven: " + numSobreviven );
	        System.out.println("Mueren: " + numKilled);
        } 
        
        fichero.cerrarFicheroIn();
        
   }    
   
}
