package busquedaDoc;

import java.util.ArrayList;

public class Documento {

    protected String nombre;
    protected ArrayList<String> autores;
    protected ArrayList<String> contenido;
    protected ArrayList<String> palabras;

    public Documento(String nombre) {
        this.nombre = nombre;
        this.autores = new ArrayList();
        this.contenido = new ArrayList();
        this.palabras = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getPalabras() {
        ArrayList aux = new ArrayList();
        for (int i = 0; i < palabras.size(); i++) {
            aux.add(palabras.get(i));
        }
        return aux;
    }

    public ArrayList getContenido() {
        ArrayList aux = new ArrayList();
        for (int i = 0; i < contenido.size(); i++) {
            aux.add(contenido.get(i));
        }
        return aux;
    }
    public ArrayList getAutores() {
        ArrayList aux = new ArrayList();
        for (int i = 0; i < autores.size(); i++) {
            aux.add(autores.get(i));
        }
        return aux;
    }
}
