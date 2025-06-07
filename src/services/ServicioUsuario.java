package services;

import interfaces.Autenticable;
import models.Usuario;

import java.util.ArrayList;

public class ServicioUsuario implements Autenticable {
    private ArrayList<Usuario> usuarios;

    public ServicioUsuario() {
        this.usuarios = new ArrayList<>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void agregarUsuario(Usuario usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
            System.out.println("Usuario agregado: " + usuario.getNombre());
        } else {
            System.out.println("No se puede agregar un usuario nulo.");
        }
    }

    @Override
    public boolean iniciarSesion(String email, String password) {
    for (Usuario usuario : usuarios) {
        if (usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) {
            System.out.println("Inicio de sesión exitoso para el usuario: " + usuario.getNombre());
            return true;
        }
    }
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Credenciales incorrectas. Por favor, inténtelo de nuevo.");
    }
        return false;
    }

}
