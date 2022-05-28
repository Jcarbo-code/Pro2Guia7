package futbol5;

import java.util.ArrayList;

public class Sistema {

    protected ArrayList<Cancha> canchas;
    protected ArrayList<Socio> socios;

    public Sistema() {
        this.canchas = new ArrayList();
        this.socios = new ArrayList();
    }

    public void addCancha(Cancha c) {
        canchas.add(c);
    }

    public void addSocio(Socio s) {
        socios.add(s);
    }

    public ArrayList<Cancha> getCanchas() {
        ArrayList<Cancha> aux = new ArrayList();
        for (int i = 0; i < canchas.size(); i++) {
            aux.add(canchas.get(i));
        }
        return aux;
    }

    public ArrayList<Socio> getSocios() {
        ArrayList<Socio> aux = new ArrayList();
        for (int i = 0; i < socios.size(); i++) {
            aux.add(socios.get(i));
        }
        return aux;
    }

    public ArrayList<Socio> busqueda(Condicion c, Object o) {
        ArrayList<Socio> aux = new ArrayList();
        for (int i = 0; i < socios.size(); i++) {
            if (c.cumple(o, socios.get(i))) {
                aux.add(socios.get(i));
            }
        }
        return aux;
    }
}
