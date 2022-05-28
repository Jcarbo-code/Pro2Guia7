/* Todas las fichas que posean un poder mayor a 2
 Todas las fichas que ocupen más de 4 lugares
 Todas las fichas que tengan una fortaleza mayor a 5
 Combinaciones lógicas de los anteriores */
package candyCrush;

import java.util.ArrayList;

public class Tablero {

    protected int puntaje;
    protected ArrayList<Ficha> fichas;

    public Tablero(int puntaje) {
        this.puntaje = puntaje;
        this.fichas = new ArrayList();
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void addFicha(Ficha e) {
        if (fichas.contains(e)) {
            fichas.add(e);
        }
    }

    public ArrayList<Ficha> getFichas() {
        ArrayList<Ficha> aux = new ArrayList();
        for (int i = 0; i < fichas.size(); i++) {
            aux.add(fichas.get(i));
        }
        return aux;
    }

    public int getDificultad() {
        int fortaleza = 0, poder = 0;
        for (int i = 0; i < fichas.size(); i++) {
            fortaleza += fichas.get(i).getFortaleza();
            poder += fichas.get(i).getPoder();
        }
        return fortaleza / poder;
    }

    public ArrayList<Ficha> busqueda(Condicion c) {
        ArrayList aux = new ArrayList();
        for (int i = 0; i < fichas.size(); i++) {
            if (c.Cumple(fichas.get(i))) {
                aux.add(fichas.get(i));
            }
        }
        return aux;
    }
}
