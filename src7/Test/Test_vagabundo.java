package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import claseNodo.personaje.Vagabundo;

public class Test_vagabundo {

	@Test
	public void test() {
		Vagabundo vagabundo=new Vagabundo("Juan", null, 0, false, null);
		assertEquals("Juan", vagabundo.getNombre());
		//fail("Not yet implemented");
	}

}
