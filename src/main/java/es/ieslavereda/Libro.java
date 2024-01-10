package es.ieslavereda;

public class Libro {
    private String titulo;
    private String autor;
    private int n_ejemplares;
    private int n_ejemplares_prestados;

    //Constructor
    public Libro(String titulo, String autor, int n_ejemplares){
        this.titulo = titulo;
        this.autor = autor;
        this.n_ejemplares = n_ejemplares;
    }
    //Getters y Setters
    public int getN_ejemplares() {
        return n_ejemplares;
    }
    public int getN_ejemplares_prestados() {
        return n_ejemplares_prestados;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }

    //Ahora estoy haciendo aun la clase Libro voy por los setters
}
