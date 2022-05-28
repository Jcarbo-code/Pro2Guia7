package busquedaDoc;

public class CondNot extends Condicion {

    protected Condicion cond;

    public CondNot(Condicion cond) {
        this.cond = cond;
    }

    @Override
    public boolean cumple(String str, Documento doc) {
        return !cond.cumple(str, doc);
    }
}
