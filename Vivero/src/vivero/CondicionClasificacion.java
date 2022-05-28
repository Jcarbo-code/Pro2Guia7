package vivero;

public class CondicionClasificacion extends Condicion {

    @Override
    public boolean cumple(Object o, Planta p) {
        String nombre = (String) (o);
        return p.getClasificacion().equals(nombre);
    }
}
