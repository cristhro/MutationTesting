package estDatos;

import java.util.Iterator;

public class Empty implements ABB{
	public	boolean isEmpty(){return true;}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object label() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ABB left() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ABB right() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	};
}
