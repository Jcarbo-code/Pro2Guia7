package candyCrush;

public class CondPoderSup extends Condicion {

    protected int min;

    public CondPoderSup(int min) {
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
        return f.getPoder()>min;
    }

}
