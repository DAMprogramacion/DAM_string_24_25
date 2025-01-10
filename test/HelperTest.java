import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import teoria.Helper;
import teoria.Persona;

class HelperTest {
    Persona p1, p2, p3, p4;
    @BeforeEach
    void setUp() {
        p1 = new Persona("juan alberto",
                LocalDate.of(1999, 1, 1), "12345678a");
        p2 = new Persona("juani  alberto",
                LocalDate.of(2020, 1, 1), "123456789");
        p3 = new Persona("esteban  alberto",
                LocalDate.of(2020, 1, 1), "1234567ab");
        p4 = new Persona("jacinto  alberto",
                LocalDate.of(2020, 1, 1), "12345678z");
    }

    @Test
    void calcularEdad() {
        Assertions.assertEquals(26, Helper.calcularEdad(p1));
        Assertions.assertEquals(5, Helper.calcularEdad(p2));

    }
    @Test
    void esMayorEdad() {
        Assertions.assertTrue(p1.esMayorDeEdad());
        Assertions.assertFalse(p2.esMayorDeEdad());
    }
    @Test
    void to_String(){
        Assertions.assertEquals("juan alberto,26,12345678a", p1.toString());
    }
    @Test
    void validarDNI() {
        Assertions.assertFalse(Helper.validarDNI(p1), "validando p1");
        Assertions.assertFalse(Helper.validarDNI(p2), "validando p2");
        Assertions.assertFalse(Helper.validarDNI(p3), "validando p3");
        Assertions.assertTrue(Helper.validarDNI(p4), "validando p4");

    }






}