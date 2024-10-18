package Futbol5;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuotaPaga;
    private ArrayList<Cancha> alquileres;

    public Socio(String nombre, String apellido, int edad, boolean cuotaPaga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuotaPaga = cuotaPaga;
        this.alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCuotaPaga() {
        return cuotaPaga;
    }

    public void setCuotaPaga(boolean cuotaPaga) {
        this.cuotaPaga = cuotaPaga;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void addAlquiler(Cancha cancha){
        alquileres.add(cancha);
    }

    public int getCantAlquieres(int nro){
        int cant=0;
        for (Cancha cc : alquileres){
            if(cc.getNroCancha()==nro)
               cant++;
        }
        return cant;
    }

    public boolean tieneAlquiler(int nro){
        for (Cancha cc : alquileres){
            if(cc.getNroCancha()==nro)
                return true;
        }
        return false;
    }

    public boolean totalQuePago(int pago){
        for (Cancha cc : alquileres){
            if(cc.getPagoFinal()>pago)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return " Socio{" +
                "cuotaPaga=" + cuotaPaga +
                ", edad=" + edad +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                '}'+'\n';
    }
}
