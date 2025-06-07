package models;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String password;
    private static int contadorUsuarios = 0;

    public Usuario() {
        this.id = ++Usuario.contadorUsuarios;
    }

    public Usuario(String nombre, String email, String password) {
        this();
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='";
    }
}
