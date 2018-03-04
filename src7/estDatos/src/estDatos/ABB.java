package estDatos;

public interface ABB<E> extends Iterable<E> {
	boolean isEmpty ();
	E label ();
	ABB<E> left ();
	ABB<E> right ();
	boolean contains (Object o);
	boolean add (E e);
	boolean remove (Object o);
}
