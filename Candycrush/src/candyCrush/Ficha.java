package candyCrush;

public class Ficha {
    protected int fortaleza;
    protected int espacio;
    protected int poder;

    public Ficha(int fortaleza, int espacio, int poder) {
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.poder = poder;
    }

    public Ficha() {
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
