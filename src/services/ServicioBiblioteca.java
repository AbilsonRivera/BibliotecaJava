package services;

import models.Libro;

import java.util.ArrayList;

public class ServicioBiblioteca {
    private ArrayList<Libro> libros;

    public ServicioBiblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        if (libro != null) {
            libros.add(libro);
            System.out.println("Libro agregado: " + libro.getTitulo());
        } else {
            System.out.println("No se puede agregar un libro nulo.");
        }
    }

    public Libro buscarLibroPorTitulo(String titulo){
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }


    public void prestarLibro(String titulo){
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null){
            libro.prestar();
        }else {
            System.out.println("No se puede prestar el libro porque no existe en la biblioteca.");
        }
    }

    public void devolverLibro(String titulo){
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null){
            libro.devolver();
        }else {
            System.out.println("No se puede devolver el libro porque no existe en la biblioteca.");
        }
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Libros en la biblioteca:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

}
