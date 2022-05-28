package vivero;

public class CondicionNombreCientifContiene extends Condicion {

    @Override
    public boolean cumple(Object o, Planta p) {
        String nombre = (String) (o);
        return p.getNombreCientifico().contains(nombre);
    }
}
