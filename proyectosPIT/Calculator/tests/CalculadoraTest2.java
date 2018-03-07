package es.tfg.ejemplos;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculadoraTest {

    private Calculadora sut;

    @Before
    public void inicializa(){
        this.sut = new Calculadora();
    }

    @Test
    public void suma_debe_devolver_la_suma_de_los_operandos(){
        assertThat(4,is(this.sut.suma(2, 2)));
    }

    @Test
    public void resta_debe_devolver_la_resta_de_los_operandos(){
        assertThat(6,is(this.sut.resta(8, 2)));
    }
}
