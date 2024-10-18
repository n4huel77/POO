package Futbol5;

import java.time.LocalDate;

public class Cancha {

    private int nroCancha;
    private boolean isAlquilada;
    LocalDate fecha;
    int pagoFinal;

    public Cancha(int nroCancha) {
        this.nroCancha = nroCancha;
        isAlquilada = false;
    }

    public int getNroCancha() {
        return nroCancha;
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    public void setAlquilada(boolean alquilada) {
        isAlquilada = alquilada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getPagoFinal() {
        return pagoFinal;
    }

    public void setPagoFinal(int pagoFinal) {
        this.pagoFinal = pagoFinal;
    }

    @Override
    public boolean equals(Object obj) {
        Cancha c = (Cancha) obj;
        return this.getNroCancha() == c.getNroCancha();
    }

    @Override
    public String toString() {
        return "Cancha{" +
                "nroCancha=" + nroCancha +
                '}';
    }
}
