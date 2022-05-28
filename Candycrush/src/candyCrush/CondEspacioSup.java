package candyCrush;

public class CondEspacioSup extends Condicion {

    protected int min;

    public CondEspacioSup(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
    
    @Override
    public boolean Cumple(Ficha f) {
        return f.getEspacio()>min;
    }
    
}
