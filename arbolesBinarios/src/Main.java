import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [ ] args) {

        // 1 Creamos el array con numeros aleatorios, establecidos dentro de un rango
        int[] numerosAleatorios = obtenerArrayAleatorio(7,1,1);
        
        // 2 Creamos el arbol a partir del array aleatorio
        Arbol arbolBinario = new Arbol(numerosAleatorios);

        // 3 Mostramos el arbol
        arbolBinario.recorridoPreorden();
        
        // 4 Obtenemos los outPuts
        int[] list={1,0,0,0,1,0};
        ArrayList<Integer> intputs =new ArrayList<Integer>();
        
        for (int i= 0; i< list.length ; i++) {intputs.add(list[i]);}
        ArrayList<Integer> outputs = arbolBinario.getOutputs(intputs);
        System.out.print(outputs);
        
    }

    /**
     *  Funcion que devuelve un arrayAleatorio de nElementos,
     *  cada elemento aleatorio pertenece a un rango determinado por un minimo y un maximo
     * @param nElementos
     * @param min
     * @param max
     * @return
     */
    public  static int[] obtenerArrayAleatorio(int nElementos, int min, int max){
        int[] numerosAleatorios = new int[nElementos];

        for (int x=0;x<numerosAleatorios.length;x++) {
            numerosAleatorios[x] = obtenerNumeroAleatorioEnRangoMinMax(min,max);
        }
        return numerosAleatorios;
    }
    /**
     *  Metodo que genera un numero aleatorio en un rango determinado entre el minimo y el maximo
     * @param min
     * @param max
     * @return
     */
    public  static  int obtenerNumeroAleatorioEnRangoMinMax(int min, int max) {
        return  min + (int)(Math.random() * max);
    }

    /**
     *  Metodo que muestra por consola un String
     * @param msg
     */
    public static void pintarString(String msg) {
        System.out.print(msg);
    }

    /**
     *  Metodo que muestra por consola un entero
     * @param msg
     */
    public static void pintarEntero(Integer msg) {
        System.out.print(msg);
    }
}
