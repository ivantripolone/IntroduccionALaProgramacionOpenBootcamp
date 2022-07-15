package Clases;

public class Cliente extends Persona {
    private int credito;
    public Cliente() {
        this.credito = 0;
    }
    public Cliente(String nombre, int edad, String telefono) {
        super(nombre, edad, telefono);
        this.credito = 0;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
