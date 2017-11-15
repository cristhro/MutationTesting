public class Arbol {
    /* Atributos */
    private Nodo raiz;

    /* Contructories */
    public Arbol( Datos dato ) {
        this.raiz = new Nodo(dato);
    }
    public Arbol( int arr[] ) {
        this.raiz = arrayToArbolBinario(arr, 0, arr.length - 1);
    }

    private Nodo arrayToArbolBinario(int arr[], int start, int end) {

        /* Caso base */
        if (start > end) {
            return null;
        }

        /* Obtenemos el punto medio y lo convertimos en nodo */
        int mid = (start + end) / 2;
        Nodo node = new Nodo(new Datos(mid, arr[mid]));

        node.setHojaIzquierda( arrayToArbolBinario(arr, start, mid - 1));
        node.setHojaDerecha(arrayToArbolBinario(arr, mid + 1, end));

        return node;
    }
    public Arbol( Nodo raiz ) {
        this.raiz = raiz;
    }

    /* Setters y Getters */
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    private void addNodo( Nodo nodo, Nodo raiz ) {
        /* 2.- Partiendo de la raíz preguntamos: Nodo == null ( o no existe ) ? */
        if ( raiz == null ) {
            /*
             * 3.- En caso afirmativo X pasa a ocupar el lugar del nodo y ya
             * hemos ingresado nuestro primer dato.
             * ==== EDITO =====
             * Muchas gracias a @Espectro por la corrección de esta línea
             */
            this.setRaiz(nodo);
        }
        else {
            /* 4.- En caso negativo preguntamos: X < Nodo */
            if ( nodo.getValor().getPos() <= raiz.getValor().getPos() ) {
                /*
                 * 5.- En caso de ser menor pasamos al Nodo de la IZQUIERDA del
                 * que acabamos de preguntar y repetimos desde el paso 2
                 * partiendo del Nodo al que acabamos de visitar
                 */
                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(nodo);
                }
                else {
                    addNodo( nodo , raiz.getHojaIzquierda() );
                }
            }
            else {
                /*
                 * 6.- En caso de ser mayor pasamos al Nodo de la DERECHA y tal
                 * cual hicimos con el caso anterior repetimos desde el paso 2
                 * partiendo de este nuevo Nodo.
                 */
                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(nodo);
                }
                else {
                    addNodo( nodo, raiz.getHojaDerecha() );
                }
            }
        }
    }

    public void addNodo( Nodo nodo ) {
        this.addNodo( nodo , this.raiz );
    }

    // EMPIEZA EL RECORRIDO EN PREORDEN
    public void recorridoPreorden()
    {
        ayudantePreorden(this.raiz);
    }
    //meoto recursivo para recorrido en preorden

    private void ayudantePreorden(Nodo nodo)
    {
        if(nodo == null)
            return;
        System.out.print(nodo.getValor().getValor() + " ");     //mostrar datos del nodo
        ayudantePreorden(nodo.getHojaIzquierda());   //recorre subarbol izquierdo
        ayudantePreorden(nodo.getHojaDerecha());     //recorre subarbol derecho
    }

}
