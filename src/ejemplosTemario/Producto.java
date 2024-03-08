package ejemplosTemario;

import java.util.Date;

public class Producto {

    private String nombre;
    private Date fechaAlta;

    public Producto(String nombre, Date fechaAlta) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }
}
