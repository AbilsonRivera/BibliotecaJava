package app;

import services.ServicioBiblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServicioBiblioteca biblioteca = new ServicioBiblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.print("""
                    \n*********Menú de Biblioteca*********
                    \t1. Agregar libro
                    \t2. Prestar libro
                    \t3. Devolver libro
                    \t4. Mostrar libros
                    \t5. Salir
                    Elige una opción:""");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch(opcion){
                case 1 -> agregarLibro(biblioteca, scanner);
                case 2 -> prestarLibro(biblioteca, scanner);
                case 3 -> devolverLibro(biblioteca, scanner);
                case 4 -> biblioteca.mostrarLibros();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }while (opcion != 5);
        scanner.close();
    }

    private static void devolverLibro(ServicioBiblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el título del libro a devolver:");
        String titulo = scanner.nextLine();
        biblioteca.devolverLibro(titulo);
    }

    private static void prestarLibro(ServicioBiblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el título del libro a prestar:");
        String titulo = scanner.nextLine();
        biblioteca.prestarLibro(titulo);
    }

    private static void agregarLibro(ServicioBiblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el título del libro:");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el año de publicación del libro:");
        int anioPublicacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        biblioteca.agregarLibro(new models.Libro(titulo, autor, anioPublicacion));
    }

}

