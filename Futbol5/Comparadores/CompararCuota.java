package Futbol5.Comparadores;

import Futbol5.Socio;

import java.util.Comparator;

public class CompararCuota implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return -1*Boolean.compare(o1.isCuotaPaga(),o2.isCuotaPaga());
    }
}
