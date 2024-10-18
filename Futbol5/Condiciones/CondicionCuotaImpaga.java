package Futbol5.Condiciones;

import Futbol5.Socio;

public class CondicionCuotaImpaga extends Condicion{
    @Override
    public boolean cumple(Socio ss) {
        return !ss.isCuotaPaga();
    }
}
