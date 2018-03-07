package es.tfg.ejemplos.estDatos;

import java.util.LinkedList;
import java.util.Random;
import java.util.function.Consumer;

public class SearchTreeMain<E> {
	
	public static <E> void inorder (ABB<E> t, Consumer<? super E> f) {
		for (E e: t) {
			f.accept(e);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ABB<Character> t = new SearchTree<Character>((ch1, ch2) -> ch2.compareTo(ch1));
		SearchTree<Character> t = new SearchTree<Character>();
		
		inorder(t, System.out::print);
		t.add('l');
		inorder(t, System.out::print);
		System.out.println();
		t.add('a');
		inorder(t, System.out::print);
		System.out.println();
		t.add('b');
		inorder(t, System.out::print);
		System.out.println();
		t.add('e');
		inorder(t, System.out::print);
		System.out.println();
		t.add('j');
		inorder(t, System.out::print);
		System.out.println();
		t.add('c');
		inorder(t, System.out::print);
		System.out.println();
		t.add('m');
		inorder(t, System.out::print);
		System.out.println();
		
		t.add('f');
		t.add('k');
		t.add('h');
		t.add('z');
		t.add('r');
		t.add('t');

		System.out.println("-------------");
		System.out.println(t.write());
		System.out.println("-----------");

		//inorder(t, System.out::print);
		System.out.println();
		System.out.println();
		System.out.println("Contiene h: " + t.contains('h'));
		System.out.println("Contiene t: " + t.contains('t'));
		System.out.println("Contiene e: " + t.contains('e'));
		System.out.println("Contiene u: " + t.contains('u'));
		System.out.println("Contiene z: " + t.contains('z'));


		
		LinkedList<Character> l = new LinkedList<>();
		for (Character ch: t) {
			l.addFirst(ch);
		}

		inorder(t, System.out::print);
		System.out.println();
		Random rnd = new Random();
		while (! l.isEmpty()) {
			double x = rnd.nextDouble()*l.size();
			Character ch = l.remove((int) x);
			System.out.print("Borrando " + ch + ": ");
			t.remove(ch);
			inorder(t, System.out::print);
			System.out.println();
		}
		
		System.out.println(" �Arbol vacio?: " + t.isEmpty());
	}
}
