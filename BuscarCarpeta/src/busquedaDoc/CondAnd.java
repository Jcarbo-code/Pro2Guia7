package busquedaDoc;

public class CondAnd extends Condicion {

    protected Condicion cond1, cond2;

    public CondAnd(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }
    
    @Override
    public boolean cumple(String str, Documento doc) {
        return (cond1.cumple(str, doc)&&cond2.cumple(str, doc));
    }
}
