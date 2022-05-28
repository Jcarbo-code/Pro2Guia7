package busquedaDoc;

public class CondContieneEnTitulo extends Condicion {

    public CondContieneEnTitulo() {
    }

    @Override
    public boolean cumple(String o, Documento doc) {
        return o.contains(doc.nombre);
    }
}
