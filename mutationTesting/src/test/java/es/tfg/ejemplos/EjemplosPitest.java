package es.tfg.ejemplos;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EjemplosPitest {
    public static String foo(boolean b) {
        if ( b ) {
            //performVitallyImportantBusinessFunction();
            return "OK";
        }

        return "FAIL";
    }

    @Test
    public void shouldFailWhenGivenFalse() {
        assertEquals("FAIL", foo(false));
    }

    @Test
    public void shouldBeOkWhenGivenTrue() {
        assertEquals("OK", foo(true));
    }

}
