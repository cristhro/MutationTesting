package es.tfg.arboles;

 public class Tools {
    /**
     *  Funcion que devuelve un arrayAleatorio de nElementos,
     *  cada elemento aleatorio pertenece a un rango determinado por un minimo y un maximo
     * @param nElementos
     * @param min
     * @param max
     * @return
     */
	public  int[] obtenerArrayAleatorio(int nElementos, int min, int max){
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
    public  int obtenerNumeroAleatorioEnRangoMinMax(int min, int max) {
        return  min + (int)(Math.random() * max);
    }

    /**
     *  Metodo que muestra por consola un String
     * @param msg
     */
    public void pintarString(String msg) {
        System.out.print(msg);
    }

    /**
     *  Metodo que muestra por consola un entero
     * @param msg
     */
    public void pintarEntero(Integer msg) {
        System.out.print(msg);
    }
}
