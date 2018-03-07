package es.tfg.ejemplos.estDatos;

import java.util.Comparator;
import java.util.Iterator;
 

public class SearchThreaded<E> extends SearchTree<E> {
	protected boolean rightThread;
	
	
	@SuppressWarnings("hiding")
	public final class InorderIterator2<E> implements Iterator<E> {
		// COMPLETAR
		private SearchThreaded<E> current;
		
		private void colocarCurrent(SearchThreaded<E> e){
			SearchThreaded<E> temp=e;
			while(!(temp.left().isEmpty())){
				temp=(SearchThreaded<E>) temp.left();
			}
			current=temp;
		}
		private InorderIterator2 (SearchThreaded<E> e){
			colocarCurrent(e);
			}
		
		public boolean hasNext(){
			return !(current.isEmpty());
		}
		
		public E next(){
			if(!hasNext()){
				throw new IllegalStateException();
			}
			SearchThreaded<E> temp=current;
			if(this.current.hasThread()){
				this.current=(SearchThreaded<E>) thread();
			}
			else{
				this.current=(SearchThreaded<E>) this.current.right();
				colocarCurrent(current);
			}
			return temp.label();
		}
	}

	private SearchThreaded (E e, ABB<E> left, ABB<E> right) {
		this(e);
		this.left = left;
		this.right = right;
		
		if (! left.isEmpty()) {
			SearchThreaded<E> current = (SearchThreaded<E>) left;
			while (! current.isEmpty()) {
				current = (SearchThreaded<E>) current.right();
			}
			
			current.rightThread = true;
			current.right = this;
		}
	}
	
	/*
	 * Cierto si la raíz del ABB tiene un hilo a la derecha
	 */
	private boolean hasThread() {
		// COMPLETAR
		return this.right().isEmpty() && ((SearchThreaded)this.right()).right!=null;
	}
	
	/*
	 * Retorna el hilo derecho de un nodo
	 */
	private SearchThreaded<E> thread() {
		// COMPLETAR
		return (SearchThreaded<E>) this.right().right();
		
	}
	
	/*
	 * Establece que la raíz del árbol especificado es el
	 * siguiente nodo en inorden
	 */
	private void setThread (ABB<E> t) {
		// COMPLETAR
		this.right=t;
		
		
		
	}
	
	public SearchThreaded() {
		super();
		this.rightThread = false;
	}

	public SearchThreaded(Comparator<E> comparator) {
		super(comparator);
		this.rightThread = false;
	}

	public SearchThreaded(E e) {
		super(e);
		this.rightThread = false;
	}

	public SearchThreaded(Comparator<E> comparator, E e) {
		super(comparator, e);
	}

	public SearchThreaded(ABB<E> t) {
		this();
		if (! t.isEmpty()) {
			this.setLabel(t.label());
			if (t.left().isEmpty()) {
				this.setLeft(new SearchThreaded<>());
			}
			else {
				ABB<E> tleft = t.left();
				this.setLeft(new SearchThreaded<E>(tleft.label(), tleft.left(), tleft.right()));
			}
			if (t.right().isEmpty()) {
				this.setRight(new SearchThreaded<>());
			}
			else {
				ABB<E> tright = t.right();
				this.setRight(new SearchThreaded<E>(tright.label(), tright.left(), tright.right()));
			}
		}
	}

	public SearchThreaded(Comparator<E> comparator, SearchTree<E> t) {
		super(comparator, t);
	}

	public boolean isEmpty() {
		// COMPLETAR
		return this.left==null;
		
	}
	
	public boolean add (E e) {
		if (this.isEmpty()) {
			this.setLabel(e);
			this.setLeft(new SearchThreaded<>());
			this.setRight(new SearchThreaded<>());
			return true;
		}
		
		SearchThreaded<E> parent = null;
		SearchThreaded<E> current = this;
		int x = 0;
		while (!current.isEmpty()) {
			parent = current;
			x = this.compare(e, current.label());			
			if (x > 0) {
				current = (SearchThreaded<E>) current.right();
			}
			else {
				current = (SearchThreaded<E>) current.left();
			}
		}	

		// current es vacío
		current.setLabel(e);
		current.setLeft(new SearchThreaded<>(this.comparator));
		SearchThreaded<E> right = new SearchThreaded<>(this.comparator);
		if (x<=0) { // se añadió a la izquierda de parent
			current.setRight(right);
			current.setThread(parent);
		}
		else { // se añade a la derecha de parent
			if (parent.hasThread()) {
				ABB<E> thread = current.right();
				current.setRight(right);
				current.setThread(thread);
				parent.rightThread = false;
			}
			current.setRight(right);
		}
		
		return true;
	}

	public Iterator<E> iterator() {
		return new InorderIterator2<E>(this);
	}

}
