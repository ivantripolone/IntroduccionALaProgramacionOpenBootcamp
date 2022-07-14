public class Main {
    public static void main (String [ ] args) {
        Persona unaPersona = new Persona();
        unaPersona.setNombre("Juan Sanchez");
        unaPersona.setEdad(55);
        unaPersona.setTelefono("1115236666");

        System.out.println("Hola, Soy " + unaPersona.getNombre());
        System.out.println("Mi edad es: " + unaPersona.getEdad() + " años");
        System.out.println("Mi telefono es: " + unaPersona.getTelefono());
    }

}

