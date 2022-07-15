package Tests;

import Clases.Persona;
import org.testng.annotations.Test;


@Test
public class PersonaTest {


    public void unaPersonaSabeSuEdad(){

        Persona unaPersona = new Persona("Juan Sanchez", 55, "1115236666");

        assert unaPersona.getEdad() == 55;
    }

    public void unaPersonaSabeNombre(){

        Persona unaPersona = new Persona("Juan Sanchez", 55, "1115236666");

        assert unaPersona.getNombre().equals("Juan Sanchez");
    }

    public void unaPersonaSabeSuTelefono(){

        Persona unaPersona = new Persona("Juan Sanchez", 55, "1115236666");

        assert unaPersona.getTelefono().equals("1115236666");
    }

}
