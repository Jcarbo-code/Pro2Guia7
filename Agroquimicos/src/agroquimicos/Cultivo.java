package agroquimicos;

import java.util.ArrayList;

public class Cultivo {

    protected String nombre;
    protected ArrayList<Enfermedad> enfermedades;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.enfermedades = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEnfermedad(Enfermedad e) {
        if (!enfermedades.contains(e)) {
            enfermedades.add(e);
        }
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        ArrayList<Enfermedad> aux = new ArrayList();
        for (int i = 0; i < enfermedades.size(); i++) {
            aux.add(enfermedades.get(i));
        }
        return aux;
    }

    public boolean trataEnfermedad(Agroquimico a) {
        for (int i = 0; i < enfermedades.size(); i++) {
            if (a.trato(enfermedades.get(i))) {
                return true;
            }
        }
        return false;
    }

    //SOLUCION a los cultivos son capaces de decir si un producto en algún momento puede serle de utilidad
    public boolean esUtil(Agroquimico a) {
        return (a.seAconseja(this)&&trataEnfermedad(a));
    }
}
