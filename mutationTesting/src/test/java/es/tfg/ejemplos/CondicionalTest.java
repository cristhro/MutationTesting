package es.tfg.ejemplos;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class CondicionalTest {
    private Condicional condicional;
    private Condicional2 condicional2;

    @Before
    public void inicializa(){
        this.condicional = new Condicional();
        this.condicional2 = new Condicional2();
    }

    @Test
    public void testCondicional() throws Exception {
        int a1 = 1;
        int b1 = 2;

        int ok = condicional.esMenor(1,2);
        assertThat(ok).isEqualTo(1);
    }
    @Test
    public void testCondicional2() throws Exception {
        int a1 = 1;
        int b1 = 2;

        int ok = condicional2.esMenor(3,2);
        assertThat(ok).isEqualTo(1);
    }
}
