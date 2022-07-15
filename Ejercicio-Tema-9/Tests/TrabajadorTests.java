package Tests;

import Clases.Cliente;
import Clases.Trabajador;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TrabajadorTests {
    public Trabajador unTrabajador;

    @BeforeTest
    public void setupTrabajadorTests() {
         unTrabajador = new Trabajador("Juan Sanchez", 55, "1115236666");
    }

    public void unTrabajadorSabeSuEdad() {
        assert unTrabajador.getEdad() == 55;
    }

    public void unTrabajadorSabeNombre() {

        assert unTrabajador.getNombre().equals("Juan Sanchez");
    }

    public void unTrabajadorSabeSuTelefono() {

        assert unTrabajador.getTelefono().equals("1115236666");
    }

    public void unTrabajadorSabeCualEsSuSueldo(){
        unTrabajador.setSueldo(1000);
        assert unTrabajador.getSueldo() == 1000;
    }

}

