package estDatos;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSet<E> extends AbstractSet<E> {
	protected LinkedList<E> data;
	
	
	public LinkedListSet(){
		this.data=new LinkedList<E> ();
	}
	
	public LinkedListSet(LinkedList<? extends E> d){
		this();
		this.addAll(d);
	}
	
	public LinkedListSet(E e){
		this.data=new LinkedList<E> ();
		this.data.add(e);
	}
	
	public LinkedListSet(Collection<? extends E> d){
		this.data=new LinkedList<E> (d);
	}
	
	public boolean add(E d){
		if(!(this.contains(d))){
			this.data.add(d);
			return true;
		}
		else{return false;}
	}
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return this.data.iterator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.data.size();
	}

}
