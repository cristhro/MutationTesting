package es.tfg.arboles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Arbol {
    /* Atributos */
    private Nodo nodoRaiz;
    private HashMap<Integer,ArrayList<ArrayList<Integer>>> collectionOutputs;
    private HashMap<Integer,ArrayList<ArrayList<Integer>>> collectionInputs;
    private boolean killed;
    
	/* Contructories */
    public Arbol() {
		super();
		this.collectionOutputs = new  HashMap<Integer,ArrayList<ArrayList<Integer>>> ();
		this.collectionInputs = new  HashMap<Integer,ArrayList<ArrayList<Integer>>> ();
		this.killed = false;

	}
    public Arbol( Datos dato ) {
    		this();
        this.nodoRaiz = new Nodo(dato);
    }
    public Arbol( int arr[] ) {
    		this();
        this.nodoRaiz = arrayToArbolBinario(arr, 0, arr.length - 1);
        asignarCaminosRec (this.nodoRaiz);
    }
    public Arbol( LinkedList<Integer> arr ) {
		this();
	    this.nodoRaiz = arrayToArbolBinario(arr, 0, arr.size() - 1);
	    asignarCaminosRec (this.nodoRaiz);
    }
    public Arbol( ArrayList<Integer> arr ) {
		this();
	    this.nodoRaiz = arrayToArbolBinario(arr, 0, arr.size() - 1);
	    asignarCaminosRec (this.nodoRaiz);
    }
    public Arbol( int profundidad ) {
        this();
        //int numHojas =  (int) Math.pow(2, profundidad);
    }

    private Nodo arrayToArbolBinario(int arr[], int start, int end) {

        /* Caso base */
        if (start > end) {
            return null;
        }

        /* Obtenemos el punto medio y lo convertimos en nodo */
        int mid = (start + end) / 2;
        Nodo node = new Nodo(new Datos(mid, arr[mid]));

        node.setNodoIzq( arrayToArbolBinario(arr, start, mid - 1));
        node.setNodoDer(arrayToArbolBinario(arr, mid + 1, end));

        return node;
    }
    private Nodo arrayToArbolBinario(ArrayList<Integer> arr, int start, int end) {

        /* Caso base */
        if (start > end) {
            return null;
        }

        /* Obtenemos el punto medio y lo convertimos en nodo */
        int mid = (start + end) / 2;
        Nodo node = new Nodo(new Datos(mid, arr.get(mid)));

        node.setNodoIzq( arrayToArbolBinario(arr, start, mid - 1));
        node.setNodoDer(arrayToArbolBinario(arr, mid + 1, end));

        return node;
    }
    private Nodo arrayToArbolBinario(LinkedList<Integer> arr, int start, int end) {

        /* Caso base */
        if (start > end) {
            return null;
        }

        /* Obtenemos el punto medio y lo convertimos en nodo */
        int mid = (start + end) / 2;
        Nodo node = new Nodo(new Datos(mid, arr.get(mid)));

        node.setNodoIzq( arrayToArbolBinario(arr, start, mid - 1));
        node.setNodoDer(arrayToArbolBinario(arr, mid + 1, end));

        return node;
    }
    public Arbol( Nodo nodoRaiz ) {
        this.nodoRaiz = nodoRaiz;
    }

    /* Setters y Getters */
    public Nodo getRaiz() {
        return nodoRaiz;
    }

    public void setRaiz(Nodo nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }

    private void addNodo( Nodo nodo, Nodo nodoRaiz ) {
        /* 2.- Partiendo de la raíz preguntamos: Nodo == null ( o no existe ) ? */
        if ( nodoRaiz == null ) {
            /*
             * 3.- En caso afirmativo X pasa a ocupar el lugar del nodo y ya
             * hemos ingresado nuestro primer dato.
             */
            this.setRaiz(nodo);
        }
        else {
            /* 4.- En caso negativo preguntamos: X < Nodo */
            if ( nodo.getDatos().getPos() <= nodoRaiz.getDatos().getPos() ) {
                /*
                 * 5.- En caso de ser menor pasamos al Nodo de la IZQUIERDA del
                 * que acabamos de preguntar y repetimos desde el paso 2
                 * partiendo del Nodo al que acabamos de visitar
                 */
                if (nodoRaiz.getNodoIzq() == null) {
                    nodoRaiz.setNodoIzq(nodo);
                }
                else {
                    addNodo( nodo , nodoRaiz.getNodoIzq() );
                }
            }
            else {
                /*
                 * 6.- En caso de ser mayor pasamos al Nodo de la DERECHA y tal
                 * cual hicimos con el caso anterior repetimos desde el paso 2
                 * partiendo de este nuevo Nodo.
                 */
                if (nodoRaiz.getNodoDer() == null) {
                    nodoRaiz.setNodoDer(nodo);
                }
                else {
                    addNodo( nodo, nodoRaiz.getNodoDer() );
                }
            }
        }
    }

    public void addNodo( Nodo nodo ) {
        this.addNodo( nodo , this.nodoRaiz );
    }

    // EMPIEZA EL RECORRIDO EN PREORDEN
    public void recorridoPreorden()
    {
        ayudantePreorden(this.nodoRaiz);
    }
    //meoto recursivo para recorrido en preorden
    private void ayudantePreorden(Nodo nodo)
    {
        if(nodo == null)
            return;
        System.out.print(nodo.getDatos().toString() + ",");     //mostrar datos del nodo
        ayudantePreorden(nodo.getNodoIzq());   //recorre subarbol izquierdo
        ayudantePreorden(nodo.getNodoDer());     //recorre subarbol derecho
    }

    /* Funciones */
    public ArrayList<Integer> getOutputs( ArrayList<Integer> inputs){
    		ArrayList<Integer> outputs = new ArrayList<Integer>();
    		Integer i = 0;
        calcularOutPutsRec( this.nodoRaiz, inputs,  outputs, i);

        return outputs;
    }
    private  void calcularOutPutsRec (Nodo nodoActual, ArrayList<Integer>inputs, ArrayList<Integer> outputs, Integer i) {
    		if(i == inputs.size()) {
    			return;
    		} 
        if ( nodoActual.getNodoDer() == null && nodoActual.getNodoIzq() == null) {
            return;
        }
        else{
          	int elem=inputs.get(i);

            // Derecha
            if ( elem == 0 && nodoActual.getNodoDer() != null){
            		outputs.add(nodoActual.getNodoDer().getDatos().getValor());
            		i++;
                calcularOutPutsRec(nodoActual.getNodoDer(),inputs, outputs, i);
            }
            // Izquierda
            if (elem == 1 && nodoActual.getNodoIzq() != null){
            		outputs.add(nodoActual.getNodoIzq().getDatos().getValor());
            		i++;
                calcularOutPutsRec(nodoActual.getNodoIzq(),inputs, outputs, i);
            }
        }
    }
   /**
    * Precondicion: Arbol inicializado
    * Postcondicion: Todos los nodos del arbol tendran el
    * @param nodoActual
    */
    private  void asignarCaminosRec (Nodo nodoActual) {
        if ( nodoActual.getNodoDer() == null && nodoActual.getNodoIzq() == null) {
            return;
        }
        else{
        		
            // Derecha 0
            if (nodoActual.getNodoDer() != null){
	            	ArrayList<Integer> caminoOutputActual = new ArrayList<Integer>(nodoActual.getDatos().getCaminoOutputs());
	        		ArrayList<Integer> caminoInputActual = new ArrayList<Integer>(nodoActual.getDatos().getCaminoInputs());
	        		
	        		caminoOutputActual.add(nodoActual.getNodoDer() .getDatos().getValor());
	        		caminoInputActual.add(0);
            		
            		
            		if(this.collectionOutputs.containsKey(caminoOutputActual.size())) {
            			this.collectionOutputs.get(caminoOutputActual.size()).add(caminoOutputActual);
             		this.collectionInputs.get(caminoInputActual.size()).add(caminoInputActual);
            		}else {
            			this.collectionOutputs.put(caminoOutputActual.size(), new ArrayList<ArrayList<Integer>>());
            			this.collectionInputs.put(caminoInputActual.size(), new ArrayList<ArrayList<Integer>>());
            			
            			this.collectionOutputs.get(caminoOutputActual.size()).add(caminoOutputActual);
            			this.collectionInputs.get(caminoInputActual.size()).add(caminoInputActual);
            		}
         
            		nodoActual.getNodoDer().getDatos().setCaminoOutputs(caminoOutputActual);
            		nodoActual.getNodoDer().getDatos().setCaminoInputs(caminoInputActual);
            		asignarCaminosRec(nodoActual.getNodoDer());
            }
            // Izquierda 1
            if (nodoActual.getNodoIzq() != null){
            		ArrayList<Integer> caminoOutputActual = new ArrayList<Integer>(nodoActual.getDatos().getCaminoOutputs());
            		ArrayList<Integer> caminoInputActual = new ArrayList<Integer>(nodoActual.getDatos().getCaminoInputs());
            		
            		caminoOutputActual.add(nodoActual.getNodoIzq().getDatos().getValor());
            		caminoInputActual.add(1);
	            	
            		if(this.collectionOutputs.containsKey(caminoOutputActual.size())) {
            			this.collectionOutputs.get(caminoOutputActual.size()).add(caminoOutputActual);
            			this.collectionInputs.get(caminoInputActual.size()).add(caminoInputActual);
            		}else {
            			this.collectionOutputs.put(caminoOutputActual.size(), new ArrayList<ArrayList<Integer>>());
            			this.collectionInputs.put(caminoInputActual.size(), new ArrayList<ArrayList<Integer>>());
            			
            			this.collectionOutputs.get(caminoOutputActual.size()).add(caminoOutputActual);
            			this.collectionInputs.get(caminoInputActual.size()).add(caminoInputActual);
            		}
	        		nodoActual.getNodoIzq().getDatos().setCaminoOutputs(caminoOutputActual);
	           	nodoActual.getNodoIzq().getDatos().setCaminoInputs(caminoInputActual);
	           	
         		asignarCaminosRec(nodoActual.getNodoIzq());
            }
        }
    }
    public HashMap<Integer,ArrayList<ArrayList<Integer>>> getCaminosOutputs(){
    		return this.collectionOutputs;
    }
    public HashMap<Integer,ArrayList<ArrayList<Integer>>> getCaminosInputs(){
		return this.collectionInputs;
    }
    public boolean isKilled() {
		return killed;
	}
	public void setKilled(boolean killed) {
		this.killed = killed;
	}
}
