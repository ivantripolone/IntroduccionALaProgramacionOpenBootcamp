package Clases;

public class Trabajador extends Persona{
    private int sueldo;

    public Trabajador() {
        this.sueldo = 0;
    }
    public Trabajador(String nombre, int edad, String telefono) {
        super(nombre,edad,telefono);
        this.sueldo = 0;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
