package vivero;

import java.util.ArrayList;

public class Planta {

    protected ArrayList<String> nombres;
    protected String nombreCientifico;
    protected String clasificacion;
    protected String familia;
    protected String clase;
    protected int riego;
    protected int sol;
    protected boolean interior;

    public Planta() {
        this.nombres = new ArrayList();
        this.nombreCientifico = "Epipremnum aureum";
        this.clasificacion = "Epipremnum";
        this.familia = "Araceae";
        this.clase = "Monocotyledoneae";
        this.riego = 3;
        this.sol = 4;
        this.interior = true;
    }

    public Planta(String nombreCientifico, String clasificacion, String familia, String clase, int riego, int sol, boolean interior) {
        this.nombres = new ArrayList();
        this.nombreCientifico = nombreCientifico;
        this.clasificacion = clasificacion;
        this.familia = familia;
        this.clase = clase;
        this.riego = riego;
        this.sol = sol;
        this.interior = interior;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public boolean isInterior() {
        return interior;
    }

    public void setInterior(boolean interior) {
        this.interior = interior;
    }

    public void addNombre(String s) {
        this.nombres.add(s);
    }

    public ArrayList getNombres() {
        ArrayList aux = new ArrayList();
        for (int i = 0; i < nombres.size(); i++) {
            aux.add(nombres.get(i));
        }
        return aux;
    }
}
