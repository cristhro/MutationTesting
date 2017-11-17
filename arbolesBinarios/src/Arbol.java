import java.util.ArrayList;
import java.util.HashMap;

public class Arbol {
    /* Atributos */
    private Nodo nodoRaiz;
    private HashMap<Integer,ArrayList<ArrayList<Integer>>> caminos;
    
    /* Contructories */
    public Arbol() {
		super();
		this.caminos = new  HashMap<Integer,ArrayList<ArrayList<Integer>>> ();

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
        System.out.print(nodo.getDatos().toString() + "\n");     //mostrar datos del nodo
        ayudantePreorden(nodo.getNodoIzq());   //recorre subarbol izquierdo
        ayudantePreorden(nodo.getNodoDer());     //recorre subarbol derecho
    }

    /* Funciones */
    public ArrayList<Integer> getOutputs( ArrayList<Integer> inputs){
    		ArrayList<Integer> outputs = new ArrayList<Integer>();

        calcularOutPutsRec( this.nodoRaiz, inputs,  outputs);

        return outputs;
    }
    private  void calcularOutPutsRec (Nodo nodoActual, ArrayList<Integer>inputs, ArrayList<Integer> outputs) {
        if ( nodoActual.getNodoDer() == null && nodoActual.getNodoIzq() == null) {
            return;
        }
        else{
          	int elem=inputs.remove(0);
            // Derecha
            if ( elem == 0 && nodoActual.getNodoDer() != null){
	            	Nodo nodoDer = nodoActual.getNodoDer();
	        		Datos dato = nodoDer.getDatos();
                outputs.add(dato.getPos());

                calcularOutPutsRec(nodoActual.getNodoDer(),inputs, outputs);
            }
            // Izquierda
            if (elem == 1 && nodoActual.getNodoIzq() != null){
            		Nodo nodoIzq = nodoActual.getNodoIzq();
            		Datos dato = nodoIzq.getDatos();
            		outputs.add(dato.getPos());

                calcularOutPutsRec(nodoActual.getNodoIzq(),inputs, outputs);
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
            		ArrayList<Integer> caminoActual = new ArrayList<Integer>(nodoActual.getDatos().getCamino());
            		caminoActual.add(0);
            		
            		if(this.caminos.containsKey(caminoActual.size())) {
            			this.caminos.get(caminoActual.size()).add(caminoActual);
            		}else {
            			this.caminos.put(caminoActual.size(), new ArrayList<ArrayList<Integer>>());
            			this.caminos.get(caminoActual.size()).add(caminoActual);
            		}
         
            		nodoActual.getNodoDer().getDatos().setCamino(caminoActual);
            		asignarCaminosRec(nodoActual.getNodoDer());
            }
            // Izquierda 1
            if (nodoActual.getNodoIzq() != null){
            		ArrayList<Integer> caminoActual = new ArrayList<Integer>(nodoActual.getDatos().getCamino());
	            	caminoActual.add(1);
	            	if(this.caminos.containsKey(caminoActual.size())) {
            			this.caminos.get(caminoActual.size()).add(caminoActual);
            		}else {
            			this.caminos.put(caminoActual.size(), new ArrayList<ArrayList<Integer>>());
            			this.caminos.get(caminoActual.size()).add(caminoActual);
            		}
	        		nodoActual.getNodoIzq().getDatos().setCamino(caminoActual);
         		asignarCaminosRec(nodoActual.getNodoIzq());
            }
        }
    }
    public HashMap<Integer,ArrayList<ArrayList<Integer>>> getCaminos(){
    		return this.caminos;
    }
    
}
