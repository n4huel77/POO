package Futbol5;

import Futbol5.Comparadores.*;
import Futbol5.Condiciones.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Socio s1 = new Socio("Nahuel", "Gulias", 22, true);
        Socio s2 = new Socio("Martin", "Othar", 22, false);
        Socio s3 = new Socio("Bautista", "Tellechea", 22, true);
        Socio s4 = new Socio("Samu", "Ceolin", 23, true);
        Socio s5 = new Socio("Roman", "Othar", 22, false);

        Club club = new Club();
        club.addSocio(s1);
        club.addSocio(s2);
        club.addSocio(s3);
        club.addSocio(s4);
        club.addSocio(s5);
        Cancha c1 = new Cancha(1);
        Cancha c2 = new Cancha(2);
        Cancha c3 = new Cancha(3);
        Cancha c4 = new Cancha(4);
        Cancha c5 = new Cancha(5);
        club.addCancha(c1);
        club.addCancha(c2);
        club.addCancha(c3);
        club.addCancha(c4);
        club.addCancha(c5);

        club.alquilarCancha(s1, c2, 550);
        club.alquilarCancha(s2,c3,600);
        club.alquilarCancha(s3,c1,550);
        club.alquilarCancha(s5,c1,900);
        club.alquilarCancha(s1,c2,900);
        club.alquilarCancha(s4,c1,800);
        club.alquilarCancha(s4,c2,500);
        club.alquilarCancha(s1,c2,700);
       
        ComparadorApellido comparadorApellido = new ComparadorApellido();
        ComparadorNombre comparadorNombre = new ComparadorNombre();
        ComparadorCantAlquiler comparadorCantAlquiler = new ComparadorCantAlquiler(2);
        ComparadorEdad comparadorEdad = new ComparadorEdad();
        CompararCuota compararCuota = new CompararCuota();

        CondicionCuotaImpaga condicionCuotaImpaga = new CondicionCuotaImpaga();
        CondicionNroAlquiler condicionNroAlquiler = new CondicionNroAlquiler(2);
        CondicionPago condicionPago = new CondicionPago(500);
        CondicionEdad condicionEdad = new CondicionEdad(18);

        ArrayList<Socio> resultado = new ArrayList<>();

        //Todas los socios con cuota impaga, ordenados alfabéticamente (primero por
        //apellido, y si hay varios con el mismo apellido por nombre)
        //ArrayList<Socio> resultado = club.buscarOrdenado(condicionCuotaImpaga, new ComparadorCompuesto(comparadorApellido,comparadorNombre));
        //System.out.println(resultado);

        //Todos los socios menores de edad, ordenados por edad
        //resultado = club.buscarOrdenado(condicionEdad,comparadorEdad);
        //System.out.println(resultado);

        //Todos los socios que alquilaron alguna vez la cancha N°2, ordenados cantidad
        //total de alquileres de esa cancha.
        //resultado = club.buscarOrdenado(condicionNroAlquiler,comparadorCantAlquiler);
        //System.out.println(resultado);

        //Todos los socios que pagaron más de $500 por algún alquiler de cancha, listando
        //primero los que tienen las cuotas pagas, ordenados alfabéticamente y luego los
        //morosos, también ordenados alfabéticamente.
        resultado = club.buscarOrdenado(condicionPago, new ComparadorCompuesto(compararCuota,comparadorApellido) );
        System.out.println(resultado);
    }
}
