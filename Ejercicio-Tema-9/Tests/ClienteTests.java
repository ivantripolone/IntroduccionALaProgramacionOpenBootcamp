package Tests;

import Clases.Cliente;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class ClienteTests {
    public Cliente unCliente;

    @BeforeTest
    public void setupClienteTests() {
         unCliente = new Cliente("Juan Sanchez", 55, "1115236666");
    }

    public void unClienteSabeSuEdad() {
        assert unCliente.getEdad() == 55;
    }

    public void unClienteSabeNombre() {

        assert unCliente.getNombre().equals("Juan Sanchez");
    }

    public void unClienteSabeSuTelefono() {

        assert unCliente.getTelefono().equals("1115236666");
    }

    public void unClienteSabeCuantoCreditoTiene(){
        unCliente.setCredito(1000);
        assert unCliente.getCredito() == 1000;
    }

}

