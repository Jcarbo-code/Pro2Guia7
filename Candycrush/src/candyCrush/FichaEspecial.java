package candyCrush;

public class FichaEspecial extends Ficha {

    public FichaEspecial(int fortaleza, int espacio, int poder) {
        super(fortaleza, espacio, poder);
    }

    public FichaEspecial() {
        super();
    }

    @Override
    public int getPoder() {
        return fortaleza / espacio;
    }
}
