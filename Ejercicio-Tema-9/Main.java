import Clases.Cliente;
import Clases.Persona;
import Clases.Trabajador;

public class Main {
    public static void main (String [ ] args) {
        //Prueba Persona
        Persona unaPersona = new Persona();
        unaPersona.setNombre("Juan Sanchez");
        unaPersona.setEdad(55);
        unaPersona.setTelefono("1115236666");

        System.out.println("Hola, Soy " + unaPersona.getNombre());
        System.out.println("Mi edad es: " + unaPersona.getEdad() + " años");
        System.out.println("Mi telefono es: " + unaPersona.getTelefono());

        System.out.println("-----------------------------------------");

        //Prueba cliente
        Cliente unCliente = new Cliente();
        unCliente.setNombre("Ramon Castillo");
        unCliente.setEdad(20);
        unCliente.setTelefono("110000000");
        unCliente.setCredito(1000);

        System.out.println("Cliente de nombre: " + unCliente.getNombre());
        System.out.println("Edad del cliente: " + unCliente.getEdad() + " años");
        System.out.println("Telefono del cliente : " + unCliente.getTelefono());
        System.out.println("Credito disponible: " + unCliente.getCredito());

        System.out.println("-----------------------------------------");

        //Prueba Trabajador
        Trabajador unTrabajador = new Trabajador();
        unTrabajador.setNombre("Ivan Tripolone");
        unTrabajador.setEdad(29);
        unTrabajador.setTelefono("1136221291");
        unTrabajador.setSueldo(1500);

        System.out.println("Nombre del trabajador: " + unTrabajador.getNombre());
        System.out.println("Edad del trabajador: " + unTrabajador.getEdad() + " años");
        System.out.println("Telefono del trabajador: " + unTrabajador.getTelefono());
        System.out.println("Sueldo del trabajador: " + unTrabajador.getSueldo());
    }

}

