package Futbol5.Comparadores;

import Futbol5.Socio;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio>  {
    Comparator<Socio> criterio1, criterio2;

    public ComparadorCompuesto(Comparator<Socio> criterio1, Comparator<Socio> criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        int resultado = criterio1.compare(o1, o2);
        if (resultado == 0)
            return criterio2.compare(o1,o2);
        return resultado;
    }
}
