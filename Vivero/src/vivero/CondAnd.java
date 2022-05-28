package vivero;

public class CondAnd extends Condicion {

    protected Condicion cond1, cond2;

    public CondAnd(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(Object o, Planta p) {
        return (cond1.cumple(o, p) && cond2.cumple(o, p));
    }
}
