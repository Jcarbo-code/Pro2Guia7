package busquedaDoc;

public class CondPalabra extends Condicion {

    public CondPalabra() {
    }

    @Override
    public boolean cumple(String o, Documento doc) {
        return doc.getPalabras().contains(0);
    }
}
