package app;

import app.ui.ConsoleUI;
import models.Libro;
import models.Usuario;
import services.ServicioBiblioteca;
import services.ServicioUsuario;

public class Main {
    private static Usuario usuarioActual = null;
    private static ConsoleUI ui;
    private static ServicioBiblioteca biblioteca;
    private static ServicioUsuario servicioUsuario;

    public static void main(String[] args) {
        inicializarSistema();
        ejecutarBucleMenu();
    }

    private static void inicializarSistema() {
        biblioteca = new ServicioBiblioteca();
        servicioUsuario = new ServicioUsuario();
        ui = new ConsoleUI();
    }

    private static void ejecutarBucleMenu() {
        int opcion;
        boolean salir = false;

        do {
            if (usuarioActual == null) {
                opcion = ui.mostrarMenuNoAutenticado();
                procesarOpcionNoAutenticado(opcion);
            } else {
                opcion = ui.mostrarMenuAutenticado(usuarioActual.getNombre());
                salir = procesarOpcionAutenticado(opcion);
            }
        } while (!salir);

        ui.cerrar();
    }

    private static void procesarOpcionNoAutenticado(int opcion) {
        switch(opcion) {
            case 1 -> registrarUsuario();
            case 2 -> iniciarSesion();
            case 3 -> System.exit(0);
            default -> ui.mostrarMensaje("Opción no válida, por favor intente de nuevo.");
        }
    }

    private static boolean procesarOpcionAutenticado(int opcion) {
        switch(opcion) {
            case 1 -> agregarLibro();
            case 2 -> prestarLibro();
            case 3 -> devolverLibro();
            case 4 -> biblioteca.mostrarLibros();
            case 5 -> cerrarSesion();
            case 6 -> {
                ui.mostrarMensaje("Saliendo del programa...");
                return true;
            }
            default -> ui.mostrarMensaje("Opción no válida, por favor intente de nuevo.");
        }
        return false;
    }

    private static void registrarUsuario() {
        String[] datos = ui.pedirDatosRegistro();
        Usuario nuevoUsuario = new Usuario(datos[0], datos[1], datos[2]);
        servicioUsuario.agregarUsuario(nuevoUsuario);
    }

    private static void iniciarSesion() {
        String[] credenciales = ui.pedirCredencialesLogin();
        String email = credenciales[0];
        String password = credenciales[1];

        if (servicioUsuario.iniciarSesion(email, password)) {
            for (Usuario usuario : servicioUsuario.getUsuarios()) {
                if (usuario.getEmail().equals(email)) {
                    usuarioActual = usuario;
                    break;
                }
            }
        }
    }

    private static void cerrarSesion() {
        String nombreUsuario = usuarioActual.getNombre();
        usuarioActual = null;
        ui.mostrarMensaje("Sesión cerrada para el usuario: " + nombreUsuario);
    }

    private static void devolverLibro() {
        String titulo = ui.pedirTituloLibro("devolver");
        biblioteca.devolverLibro(titulo);
    }

    private static void prestarLibro() {
        String titulo = ui.pedirTituloLibro("prestar");
        biblioteca.prestarLibro(titulo);
    }

    private static void agregarLibro() {
        String[] datos = ui.pedirDatosLibro();
        String titulo = datos[0];
        String autor = datos[1];
        int anioPublicacion = Integer.parseInt(datos[2]);

        biblioteca.agregarLibro(new Libro(titulo, autor, anioPublicacion));
    }
}
