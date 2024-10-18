package Futbol5.Condiciones;

import Futbol5.Socio;

public class CondicionEdad extends Condicion{
    private int edad;

    public CondicionEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple(Socio ss) {
        return ss.getEdad()>edad;
    }
}
