package vivero;

public class CondicionNombre extends Condicion {

    @Override
    public boolean cumple(Object o, Planta p) {
        String nombre = (String) (o);
        return p.getNombres().contains(nombre);
    }
}
