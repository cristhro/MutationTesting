package es.tfg.ejemplos;

import org.junit.Before;
import org.junit.Test;


import static org.fest.assertions.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

public class funcionesTest {
    private Funciones funciones;

    @Before
    public void inicializa(){
        this.funciones = new Funciones();
    }

    @Test
    public void testCondicional() throws Exception {
    		List<Integer> indices = new ArrayList<Integer>(); 
    		
    		for (int i = 0; i<10; i++) {
    			List<Integer> decisiones = new ArrayList<Integer>();
    			decisiones.add(i);
    			
    			assertThat(funciones.f1(i,decisiones)).isEqualTo(decisiones);
    		}
    		
    		//assertThat(funciones.f1(false, true)).isEqualTo(true);
        //assertThat(funciones.f1(true, false)).isEqualTo(true);
    }
}
