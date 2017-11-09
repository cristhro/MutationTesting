package es.tfg.ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Funciones {
  
    public List<Integer> f1(int profundidad, List<Integer> decisiones ){
    		List<Integer> resultado = new ArrayList<Integer>();
    		
    		// Recorremos en la profundidad
        	for (int i = 0; i < profundidad; i++) {
        		// Guardamos las deciciones
        		resultado.add(decisiones.get(i)); 
        	}
        	
		return resultado;
    }
}
