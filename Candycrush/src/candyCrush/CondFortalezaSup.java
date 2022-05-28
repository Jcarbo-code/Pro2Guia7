package candyCrush;

public class CondFortalezaSup extends Condicion {

    protected int min;

    public CondFortalezaSup(int min) {
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
        return f.getFortaleza()>min;
    }
    
}
