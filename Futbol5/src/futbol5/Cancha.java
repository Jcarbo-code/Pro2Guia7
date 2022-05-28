package futbol5;

import java.time.LocalDate;

public class Cancha {
    protected int id,precio;
    protected LocalDate alquiler;//DEBERIA QUEDAR ESTE ATRIBUTO?

    public Cancha(int id, int precio, LocalDate alquiler) {
        this.id = id;
        this.precio = precio;
        this.alquiler = alquiler;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LocalDate getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(LocalDate alquiler) {
        this.alquiler = alquiler;
    }
}
