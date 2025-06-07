package models;

import interfaces.Prestable;

public class Libro implements Prestable {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false; // Por defecto, el libro no está prestado
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", prestado=" + prestado +
                '}';
    }

    @Override
    public void prestar() {
        if (!prestado){
            prestado = true;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }

    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no está prestado.");
        }

    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

}
