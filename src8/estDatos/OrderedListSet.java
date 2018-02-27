package estDatos;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class OrderedListSet<E> extends LinkedListSet<E> {
	
	
	
	 public OrderedListSet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderedListSet(Collection<? extends E> d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public boolean add(E d){
		if(!(this.contains(d))){
			ListIterator<E> temp=super.data.listIterator();
			while(temp.hasNext()){
				int x=((Comparable<? super E>)d).compareTo(temp.next());
				if(x<0){
					temp.previous();
					temp.add(d);
					return true;
				}
//				temp.next();
			}
			temp.add(d);
		}
		
		return false;
	}

	public OrderedListSet(LinkedList<? extends E> d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public boolean addAll(Collection<? extends E> c){
		 ListIterator<E> tempC=((LinkedListSet<E>)c).data.listIterator();
		 ListIterator<E> tempThis=this.data.listIterator();
		
		 while(tempThis.hasNext()&& tempC.hasNext()){
			 E elemC=tempC.next(); tempC.previous();
			 E elemThis=tempThis.next(); tempThis.previous();
			 
			int x=((Comparable<? super E>)elemThis).compareTo(elemC);
			 if(x==1){
				 
				 tempThis.add(elemC);
				 tempC.next();
				 
			 } 
			 else if(x==0){
				 tempThis.next();
				 tempC.next();
			 }
			 else{
				  
				 tempThis.next();
			 }
		 }
		 
		 while(tempC.hasNext()){
			 data.add(tempC.next());
		 }
		 return true;
	 } 
}
