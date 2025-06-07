package app.ui;

import java.util.Scanner;

/**
 * Clase responsable de la interacción con el usuario a través de consola
 */
public class ConsoleUI {
    private final Scanner scanner;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenuNoAutenticado() {
        System.out.print("""
                \n********* Menú de Biblioteca *********
                \t1. Registrarse
                \t2. Iniciar sesión
                \t3. Salir
                Elige una opción:""");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        return opcion;
    }

    public int mostrarMenuAutenticado(String nombreUsuario) {
        System.out.print("""
                \n********* Menú de Biblioteca *********
                \tUsuario: """ + nombreUsuario + """
                \n\t1. Agregar libro
                \t2. Prestar libro
                \t3. Devolver libro
                \t4. Mostrar libros
                \t5. Cerrar sesión
                \t6. Salir
                Elige una opción:""");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        return opcion;
    }

    public String[] pedirDatosRegistro() {
        String[] datos = new String[3];
        System.out.print("Ingrese nombre de usuario: ");
        datos[0] = scanner.nextLine();
        System.out.print("Ingrese email: ");
        datos[1] = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        datos[2] = scanner.nextLine();
        return datos;
    }

    public String[] pedirCredencialesLogin() {
        String[] credenciales = new String[2];
        System.out.print("Ingrese email: ");
        credenciales[0] = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        credenciales[1] = scanner.nextLine();
        return credenciales;
    }

    public String pedirTituloLibro(String accion) {
        System.out.print("Ingrese el título del libro a " + accion + ": ");
        return scanner.nextLine();
    }

    public String[] pedirDatosLibro() {
        String[] datos = new String[3];
        System.out.print("Ingrese el título del libro: ");
        datos[0] = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        datos[1] = scanner.nextLine();
        System.out.print("Ingrese el año de publicación del libro: ");
        datos[2] = scanner.nextLine();
        return datos;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrar() {
        scanner.close();
    }
}
