package busquedaDoc;

public class CondContMin extends Condicion {

    protected int min;

    public CondContMin(int min) {
        this.min = min;
    }

    public CondContMin() {
        this.min = 20;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
    
    @Override
    public boolean cumple(String o, Documento doc) {
        return doc.getAutores().size()>=this.min;
    }
}
