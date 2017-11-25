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
        ArrayList<Arbol> coleccionArboles =new ArrayList<Arbol>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		
		//Mutantes mutantes = new Mutantes();
		Mutantes.getMutantes(list2);
		
		// Generamos arboles con los mutantes
		for(ArrayList<Integer> mutante : Mutantes.conjuntoMutantes){
			Arbol arbolBinario = new Arbol(mutante);
			coleccionArboles.add(arbolBinario);
		}
		
		// Obtenemos arbol correcto (este es con el que vamos a comparar)
		Arbol arbolCorrecto = coleccionArboles.remove(0);
		
		HashMap<Integer,ArrayList<ArrayList<Integer>>> caminosOutput  = arbolCorrecto.getCaminosOutputs();
		HashMap<Integer,ArrayList<ArrayList<Integer>>> caminosInput  = arbolCorrecto.getCaminosInputs();
       
        // Obtenemos la coleccion de los inputs
        HashMap<Integer,ArrayList<ArrayList<Integer>>> caminosInputs = arbolCorrecto.getCaminosInputs();
        Integer  numKilled = 0, numTotalMutantes = coleccionArboles.size() ;
        
        // Recorremos los inputs del nivel 1
        for (ArrayList<Integer> inputs : caminosInputs.get(2)) {
        	 	
        		// Obtenemos el outputOriginal
        	 	ArrayList<Integer> outputsOriginal = arbolCorrecto.getOutputs(inputs);
        	 	
        	 	// Recorremos la coleccion de arboles mutantes
            for (Arbol arbol : coleccionArboles) {
                	 ArrayList<Integer> outPutArbol = arbol.getOutputs(inputs);
                	 if(!arbol.isKilled()) {
	        			if (!outPutArbol.equals(outputsOriginal)){
	        					numKilled++;
	        					arbol.setKilled(true);			
	        			}
                	 }
        		}
		}
        
        Integer numSobreviven = numTotalMutantes - numKilled ;
        System.out.println("Total mutantes: " + numTotalMutantes );
        System.out.println("Sobreviven: " + numSobreviven );
        System.out.println("Mueren: " + numKilled);
   }    
}
