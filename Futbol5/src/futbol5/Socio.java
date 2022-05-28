package futbol5;

import java.util.ArrayList;

public class Socio {

    protected String nombre, apellido;
    protected int edad;
    protected boolean debe;
    protected ArrayList<Cancha> alquileres;

    public Socio(String nombre, String apellido, int edad, boolean debe) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.debe = debe;
        this.alquileres = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isDebe() {
        return debe;
    }

    public void setDebe(boolean debe) {
        this.debe = debe;
    }

    public void addAlquiler(Cancha c) {
        alquileres.add(c);
    }

    public ArrayList<Cancha> alquiladas() {
        ArrayList<Cancha> aux = new ArrayList();
        for (int i = 0; i < alquileres.size(); i++) {
            aux.add(alquileres.get(i));
        }
        return aux;
    }
}
