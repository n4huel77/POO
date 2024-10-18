package Futbol5.Condiciones;

import Futbol5.Socio;

public class CondicionNroAlquiler extends Condicion{
    private int nro;

    public CondicionNroAlquiler(int nro) {
        this.nro = nro;
    }


    @Override
    public boolean cumple(Socio ss) {
        return ss.tieneAlquiler(nro);
    }
}
