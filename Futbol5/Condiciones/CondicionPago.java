package Futbol5.Condiciones;

import Futbol5.Socio;

public class CondicionPago extends Condicion{
    private int pago;

    public CondicionPago(int pago) {
        this.pago = pago;
    }

    @Override
    public boolean cumple(Socio ss) {
        return ss.totalQuePago(pago);
    }
}
