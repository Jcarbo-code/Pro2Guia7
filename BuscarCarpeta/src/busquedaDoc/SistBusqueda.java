/* a) Todos los documentos cuyo título sea exactamente igual a un título dado. XX
    b) Todos los documentos cuyo título contenga una palabra o frase dada. XX
    c) Todos los documentos que contengan una palabra clave dada. XX
    d) Todos los documentos que no contengan ninguna palabra clave.
    e) Todos los documentos de un autor determinado.
    f) Todos los documentos cuyo contenido tenga una palabra o frase dada.
    g) Todos los documentos cuyo contenido tenga al menos 20 palabras.
    h) Cualquier combinación lógica de las formas anteriores */
package busquedaDoc;

import java.util.ArrayList;

public class SistBusqueda {

    protected ArrayList<Documento> documentos;

    public SistBusqueda() {
        this.documentos = new ArrayList();
    }

    public ArrayList<Documento> busqueda(String str, Condicion c) {
        ArrayList aux = new ArrayList();
        for (int i = 0; i < documentos.size(); i++) {
            if (c.cumple(str, documentos.get(i))) {
                aux.add(documentos.get(i));
            }
        }
        return aux;
    }
}
