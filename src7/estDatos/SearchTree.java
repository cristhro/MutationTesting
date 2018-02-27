package estDatos;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class SearchTree<E> implements ABB<E> {
	protected E label;						// etiqueta de la raÃ­z del ABB
	protected ABB<E> left, right;	// suÃ¡rboles izquierdo y derecho de la raÃ­z
	protected Comparator<E> comparator;		// comparador (null si E es Comparable)

	@SuppressWarnings("hiding")
	public final class InorderIterator<E> implements Iterator<E> {
		private LinkedList<ABB<E>> stack;	// pila auxiliar
		private ABB<E> current;				// nodo actual
		
		private InorderIterator(SearchTree<E> root) {
			this.stack = new LinkedList<>();
			this.slideLeft(root);	// primer nodo de la secuencia en inorden
		}
		
		/*
		 * Obtiene el nodo situado mÃ¡s a la izquierda en el ABB. AdemÃ¡s,
		 * aÃ±ade a la pila todos los nodos en el camino de la raÃ­z del 
		 * ABB hasta Ã©l (de esta forma se podrÃ¡n recuperar posteriormente)
		 */
		private void slideLeft(ABB<E> current) {
			while (! current.isEmpty()) {
				this.stack.addFirst(current);
				current = current.left();
			}
		}
		
		public boolean hasNext() {
			return ! this.stack.isEmpty();
		}
		
		public E next() {
			this.current = this.stack.removeFirst();
			
			if (! this.current.right().isEmpty()) {
				this.slideLeft(this.current.right());
			}
			
			return this.current.label();
		}
	}
	
	protected void setLabel (E e) {
		this.label = e;
	}
	
	protected void setLeft (ABB<E> t) {
		this.left = t;
	}
	
	protected void setRight (ABB<E> t) {
		this.right = t;
	}
	
	/*
	 * SuÃ¡rbol cuya raÃ­z tiene como etiqueta el objeto especificado.
	 * Si Ã©ste no se encuentra en el ABB, retorna un Ã¡rbol vacÃ­o.
	 */
	
	protected ABB<E> search (Object o, boolean stop) {
		ABB<E> current = this;
		while (!current.isEmpty()) {
			int x = this.compare(o, current.label());
			if (x == 0 && stop) {
				return current;
			}
			if (x > 0) {
				current = current.right();
			}
			else {
				current = current.left();
			}
		}
		
		return current;
	}
	
	protected SearchTree<E> removeTop (ABB<E> top) {
		SearchTree<E> left = (SearchTree<E>) top.left();
		SearchTree<E> right = (SearchTree<E>) top.right();
		if (left.isEmpty()) {
			return right;
		}
		if (right.isEmpty()) {
			return left;
		}
		if (left.right().isEmpty()) {
			left.setRight(right);
			return left;
		}
		SearchTree<E> parent = (SearchTree<E>) top;
		SearchTree<E> current = left;
		while (!current.right().isEmpty()) {
			parent = current;
			current = (SearchTree<E>) current.right();
		}
		parent.setRight(current.left());
		current.setLeft(left);
		current.setRight(right);
		return current;
	}
		
	public SearchTree () {
		this.label = null;
		this.left = null;
		this.right = null;
		this.comparator = null;
	}

	public SearchTree (Comparator<E> comparator) {
		this();
		this.comparator = comparator;
	}

	public SearchTree(E e) {
		this.label = e;
		this.left = new SearchTree<>();
		this.right = new SearchTree<>();
		this.comparator = null;
	}

	public SearchTree(Comparator<E> comparator, E e) {
		this(e);
		this.comparator = comparator;
	}

	public SearchTree (ABB<E> t) {
		this();
		if (! t.isEmpty()) {
			this.setLabel(t.label());
			this.left = new SearchTree<>(t.left());
			this.right = new SearchTree<>(t.right());
		}
	}
	
	public SearchTree (Comparator<E> comparator, ABB<E> t) {
		this(t);
		this.comparator = comparator;
	}

	public boolean isEmpty () {
		return this.left == null && this.right == null;
	}

	public E label () {
		if (this.isEmpty()) {
			throw new IllegalStateException("Ã�rbol vacÃ­o");
		}
		
		return this.label;
	}

	public ABB<E> left () {
		if (this.isEmpty()) {
			return null;
		}

		return this.left;
	}

	public ABB<E> right () {
		if (this.isEmpty()) {
			return null;
		}

		return this.right;
	}

	public Comparator<E> comparator () {
		return this.comparator;
	}

	@SuppressWarnings("unchecked")
	final public int compare (Object e1, Object e2) {
		return comparator == null ? ((Comparable<E>) e1).compareTo((E) e2) :
			comparator.compare((E) e1, (E) e2);
	}

	public boolean contains (Object o) {
		ABB<E> current = this.search(o, true);
		
		return ! current.isEmpty();
	}
		
	public boolean add (E e) {
		SearchTree<E> current = (SearchTree<E>) this.search(e, false);

		current.setLabel(e);
		current.setLeft(new SearchTree<>(this.comparator));
		current.setRight(new SearchTree<>(this.comparator));
		
		return true;
	}

	public boolean remove (Object o) {
		int x = compare(o, this.label());
		if (x==0) { // eliminar el nodo raÃ­z
			SearchTree<E> t = this.removeTop(this);
			this.label = t.label;
			this.left = t.left;
			this.right = t.right;
			return true;
		}
		
		SearchTree<E> current = this;
		while (!current.isEmpty()) {
			ABB<E> child;
			x = this.compare(o, current.label());
			if (x>0) { // buscar en el subÃ¡rbol derecho
				child = current.right();
				if (!child.isEmpty() && this.compare(o, child.label())==0) {
					current.setRight(this.removeTop(child));
					return true;
				}
			}
			else { // buscar en el subÃ¡rbol izquierdo
				child = current.left();
				if (!child.isEmpty() && this.compare(o, child.label())==0) {
					current.setLeft(this.removeTop(child));
					return true;
				}
			}
			current = (SearchTree<E>) child;
		}
		
		return false;
	}

	public Iterator<E> iterator() {
		return new InorderIterator<>(this);
	}


	
}