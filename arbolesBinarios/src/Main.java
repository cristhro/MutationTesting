import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main (String [ ] args) {
    		Tools tool = new Tools();
    		
        // 1 Creamos el array con numeros aleatorios, establecidos dentro de un rango
        int[] numerosAleatorios = tool.obtenerArrayAleatorio(4,1,2);
        
        // 2 Creamos el arbol a partir del array aleatorio
        Arbol arbolBinario = new Arbol(numerosAleatorios);

        // 3 Mostramos el arbol 
        System.out.println("<-- Recorrido preorden");
        arbolBinario.recorridoPreorden();
        
        // 4 Obtenemos los outPuts
        int[] list={1,0,0,1,0,1,0,1,1,0,0,0};
        ArrayList<Integer> intputs =new ArrayList<Integer>();
        
        for (int i= 0; i< list.length ; i++) {intputs.add(list[i]);}
        ArrayList<Integer> outputs = arbolBinario.getOutputs(intputs);
        System.out.println("< -- Salida a partir de entrada");
        System.out.println(outputs);
        
        // 5 Obtenemos los caminos
        HashMap<Integer,ArrayList<ArrayList<Integer>>> caminos  = arbolBinario.getCaminos();
        System.out.println("<-- Caminos");
        System.out.println(caminos);
        //HashMap<Integer,Integer> hm  = new HashMap<Integer,Integer>();
       
   }    
}
