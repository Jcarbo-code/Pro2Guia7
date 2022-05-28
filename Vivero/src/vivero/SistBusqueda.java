/*  a) Todas las plantas cuyo nombre científico incluya la palabra “auereum”
    b) Todas las plantas a las que se conozca vulgarmente como “lengua de suegra”
    c) Todas las plantas cuya clasificación sea “Crassula”
    d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
    e) Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
    f) Todas las plantas de interior que necesiten poco riego (inferior a 3)
    g) Cualquier combinación lógica de las formas anteriores */
package vivero;

import java.util.ArrayList;

public class SistBusqueda {

    protected ArrayList<Planta> plantas;

    public SistBusqueda() {
        this.plantas = new ArrayList();
    }

    public ArrayList<Planta> busqueda(Object o, Condicion c) {
        ArrayList aux = new ArrayList();
        for (int i = 0; i < plantas.size(); i++) {
            if (c.cumple(o, plantas.get(i))) {
                aux.add(plantas.get(i));
            }
        }
        return aux;
    }
}
