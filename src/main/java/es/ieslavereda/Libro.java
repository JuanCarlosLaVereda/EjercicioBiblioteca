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

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setN_ejemplares(int n_ejemplares) {
        this.n_ejemplares = n_ejemplares;
    }
    public void setN_ejemplares_prestados(int n_ejemplares_prestados) {
        this.n_ejemplares_prestados = n_ejemplares_prestados;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Metodos
    public boolean prestamo(){
        if (n_ejemplares-n_ejemplares_prestados == 0){
            return false;
        }
        ++n_ejemplares_prestados;
        return true;
    }

    public boolean devolucion(){
        if (n_ejemplares_prestados==0){
            return false;
        }
        --n_ejemplares_prestados;
        return true;
    }

    //Override
    @Override
    public String toString(){
        return "\n-------------------" +
                "\nTitulo del libro: " + titulo +
                "\nAutor del libro: " + autor +
                "\nEjemplares: " + n_ejemplares +
                "\nLibros prestados: " + n_ejemplares_prestados;
    }

    @Override
    public boolean equals(Object obj){
        if (obj==null){
            return false;
        }
        if (!(obj instanceof Libro)){
            return false;
        }

        Libro libro = (Libro) obj;
        return titulo.equals(libro.getTitulo());

    }
}
