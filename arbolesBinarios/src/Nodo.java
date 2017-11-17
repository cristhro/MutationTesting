import java.util.ArrayList;

public class Nodo {
	/* Declaraciones de variables */
	private Datos dato;

	private Nodo padre;
	private Nodo nodoIzq;
	private Nodo nodoDer;
	
	
	public Nodo() {
		super();
		this.nodoDer = null;
		this.nodoIzq = null;
	}
	/* Constructor */
	public Nodo(Datos dato) {
		this();
		this.dato = dato;
	}
	public Nodo(int pos, int valor) {
		this();
		this.dato = new Datos(pos, valor);
	}
	public Nodo(int pos, int valor, ArrayList<Integer> camino) {
		this();
		this.dato = new Datos(pos, valor, camino);
	}

	/* Setters y Getters */
	public void setDatos(Datos valor) {
		this.dato = valor;
	}

	public Datos getDatos() {
		return dato;
	}

	public Nodo getPadre() {
		return padre;
	}

	public void setPadre(Nodo padre) {
		this.padre = padre;
	}

	public Nodo getNodoIzq() {
		return nodoIzq;
	}

	public void setNodoIzq(Nodo nodoIzq) {
		this.nodoIzq = nodoIzq;
	}

	public Nodo getNodoDer() {
		return nodoDer;
	}

	public void setNodoDer(Nodo nodoDer) {
		this.nodoDer = nodoDer;
	}

}
