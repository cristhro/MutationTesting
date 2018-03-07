package es.tfg.ejemplos;

import es.tfg.ejemplos.claseNodo.personaje.Vagabundo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_vagabundo {

	@Test
	public void test() {
		Vagabundo vagabundo=new Vagabundo("Juan", null, 0, false, null);
		assertEquals("Juan", vagabundo.getNombre());
		//fail("Not yet implemented");
	}

}
