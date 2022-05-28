package busquedaDoc;

public class CondTitulo extends Condicion {

    public CondTitulo() {
    }

    @Override
    public boolean cumple(String o, Documento doc) {
        return o.equals(doc.getNombre());
    }
}
