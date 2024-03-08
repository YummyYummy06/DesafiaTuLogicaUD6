package ejemplosTemario;

public class Usuario {

    private String nombre;
    private String apellido;
    private String user;

    public Usuario(String nombre, String apellido, String user) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUser() {
        return user;
    }
}
