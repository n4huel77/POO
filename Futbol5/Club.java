package Futbol5;

import Futbol5.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Club {
    ArrayList<Cancha> canchas;
    ArrayList<Socio>socios;

    public Club() {
        this.socios = new ArrayList<>();
        this.canchas = new ArrayList<>();
    }
    public void addSocio(Socio socio){
        this.socios.add(socio);
    }
    public void addCancha(Cancha cc){
        this.canchas.add(cc);
    }
    public void alquilarCancha(Socio socio, Cancha cancha, int pago){
        for (Cancha cc :canchas){
            if(cc.equals(cancha) && !cc.isAlquilada()){
                cc.setPagoFinal(pago);
                cc.setFecha(LocalDate.now());
                socio.addAlquiler(cancha);
            }
        }
    }

    public ArrayList<Socio> buscarOrdenado(Condicion cc, Comparator<Socio> comp){
        ArrayList<Socio> resultado = new ArrayList<>();
        for(Socio ss : socios){
            if(cc.cumple(ss)){
                resultado.add(ss);
            }
        }
        Collections.sort(resultado,comp);
        return resultado;
    }
}
