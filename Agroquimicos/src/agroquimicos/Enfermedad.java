package agroquimicos;

import java.util.ArrayList;

public class Enfermedad {

    protected String nombre;
    protected ArrayList<String> estadosPatolog;     //SUPONIENDO SON STRINGS

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatolog = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEstado(String e) {
        if (!estadosPatolog.contains(e)) {
            estadosPatolog.add(e);
        }
    }

    public ArrayList<String> getEstados() {
        ArrayList<String> aux = new ArrayList();
        for (int i = 0; i < estadosPatolog.size(); i++) {
            aux.add(estadosPatolog.get(i));
        }
        return aux;
    }

    boolean provoca(String e) {
        return estadosPatolog.contains(e);
    }
}
