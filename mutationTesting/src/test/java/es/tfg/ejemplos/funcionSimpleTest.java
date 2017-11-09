package es.tfg.ejemplos;

import org.junit.Before;
import org.junit.Test;


import static org.fest.assertions.api.Assertions.assertThat;

public class funcionSimpleTest {
    private FuncionSimple funciones;

    @Before
    public void inicializa(){
        this.funciones = new FuncionSimple();
    }

    @Test
    public void testCondicional() throws Exception {

        assertThat(funciones.f1(1)).isEqualTo(1);
        assertThat(funciones.f1(0)).isEqualTo(0);
        //assertThat(funciones.f1(false)).isEqualTo(true);
    }
}
