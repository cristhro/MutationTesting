package es.tfg.ejemplos;

import es.tfg.ejemplos.estDatos.SearchTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_SearchTree {

	@Test
	public void test1() {
		SearchTree<Character> t = new SearchTree<Character>();
		t.add('f');
		t.add('k');
		t.add('h');
		t.add('z');
		t.add('r');
		t.add('t');
		assertEquals(t.write(), t.write());
		//fail("Not yet implemented");
	}



}
