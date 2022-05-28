package vivero;

public class CondNot extends Condicion {

    protected Condicion cond;

    public CondNot(Condicion cond) {
        this.cond = cond;
    }

    @Override
    public boolean cumple(Object o, Planta p) {
        return !cond.cumple(o, p);
    }
}
