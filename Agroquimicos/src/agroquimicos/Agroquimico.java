package agroquimicos;

import java.util.ArrayList;

public class Agroquimico {

    protected String nombre;
    protected ArrayList<String> estadosPatolog;     //SUPONIENDO SON STRINGS
    protected ArrayList<Cultivo> cultivos;          //DONDE NO USAR EL AGROQUIMICO

    public Agroquimico(String nombre) {
        this.nombre = nombre;
        this.estadosPatolog = new ArrayList();
        this.cultivos = new ArrayList();
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

    public void addCultivo(Cultivo e) {
        if (!cultivos.contains(e)) {
            cultivos.add(e);
        }
    }

    public ArrayList<Cultivo> getCultivos() {
        ArrayList<Cultivo> aux = new ArrayList();
        for (int i = 0; i < cultivos.size(); i++) {
            aux.add(cultivos.get(i));
        }
        return aux;
    }

    //SOLUCION a para tratar la enfermedad todos los estados patológicos de la enfermedad están contenidos por las acciones del producto químico
    public boolean trato(Enfermedad e) {    
        for (int i=0;i<estadosPatolog.size();i++){
            if (!e.provoca(estadosPatolog.get(i))){
                return false;
            }
        }
        return true;
    }

    public boolean seAconseja(Cultivo c) {
        return !cultivos.contains(c);
    }
}
