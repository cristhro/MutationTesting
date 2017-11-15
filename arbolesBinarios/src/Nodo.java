
public class Nodo {
    /* Declaraciones de variables */
    private Datos dato;

    private Nodo padre;
    private Nodo hojaIzquierda;
    private Nodo hojaDerecha;

    /* Constructor */
    public Nodo(Datos dato) {
        this.dato = dato;
    }

    /* Setters y Getters */
    public void setValor(Datos valor) {
        this.dato = valor;
    }

    public Datos getValor() {
        return dato;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getHojaIzquierda() {
        return hojaIzquierda;
    }

    public void setHojaIzquierda(Nodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }

    public Nodo getHojaDerecha() {
        return hojaDerecha;
    }

    public void setHojaDerecha(Nodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }

}
