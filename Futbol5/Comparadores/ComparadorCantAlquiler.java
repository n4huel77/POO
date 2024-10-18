package Futbol5.Comparadores;

import Futbol5.Socio;

import java.util.Comparator;

public class ComparadorCantAlquiler implements Comparator<Socio> {
    private int nroCancha;

    public ComparadorCantAlquiler(int nroCancha) {
        this.nroCancha = nroCancha;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        if( o1.getCantAlquieres(nroCancha)>o2.getCantAlquieres(nroCancha))
            return -1;
        else if( o1.getCantAlquieres(nroCancha)<o2.getCantAlquieres(nroCancha))
            return 1;
        return  0;
    }
}
