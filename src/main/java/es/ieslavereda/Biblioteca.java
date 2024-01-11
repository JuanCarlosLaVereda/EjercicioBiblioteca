package es.ieslavereda;

public class Biblioteca {
    private static final String[][] LIBROSBASICOS = {
            {"Don Quijote de la Mancha", "Miguel de Cervantes Saavedra"},
            {"Cien años de soledad", "Gabriel García Márquez"},
            {"El alquimista", "Paulo Coehlo"},
            {"20 poemas de amor y una canción desesperada", "Pablo Neruda"},
            {"La ciudad y los perros", "Mario Vargas Llosa"},
            {"La casa de los espíritus","Isabel Allende"},
            {"Desolación", "Gabriela Mistral"},
            {"Rayuela", "Julio Cortázar"},
            {"El Aleph", "Jorge Luis Borges"},
            {"El amor en los tiempos del cólera","Gabriel García Márquez"}
    };

    private Libro[] libros;
    private int n_total;
    private String localidad;

    //Constructor (En este contructor he hecho un array bidimensional para guardar en i0 el titulo y en i1 el autor, lo voy recorriendo y creando libros en el array de 100 y añado los 10 primeros libros basicos.)
    public Biblioteca(String localidad){
        libros = new Libro[100];
        for (int i = 0; i < LIBROSBASICOS.length; i++) {
            libros[i] = new Libro(LIBROSBASICOS[i][0], LIBROSBASICOS[i][1], 3);
        }
        this.localidad = localidad;
        n_total = getN_total();

    }

    //Getters y Setters
    public int getN_total() {
        n_total=0;
        for (int i=0; i<libros.length; i++){
            if (libros[i]==null){
                return n_total;
            }
            n_total+=libros[i].getN_ejemplares();
        }
        return n_total;
    }
    public String getLocalidad() {
        return localidad;
    }
    public Libro[] getLibros() {
        return libros;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    //Metodos
    public int checkLibro(Libro libro){
        for (int i=0; i<libros.length; i++){
            if (libros[i]==null){
                return -1;
            }
            if (libro.getTitulo().equals(libros[i].getTitulo())){
                return i;
            }
        }
        return -1;
    }

    public boolean addLibro(Libro libro){
        for (int i=0; i<libros.length; i++){
            if (libros[i]==null){
                libros[i]=libro;
                return true;
            }
        }
        return false;
    }

    public boolean removeLibro(Libro libro){
        for (int i=0; i <libros.length ; i++) {
            if (libros[i]==null){
                return false;
            }
            if (libros[i].equals(libro)){
                libros[i]=null;
                ordenarLibros();
                return true;
            }
        }
        return false;
    }

    private void ordenarLibros(){
        for (int i = 0; i < libros.length-1; i++) {
            for (int j = 0; j < libros.length-1-i; j++) {
                if(libros[j]==null && libros[j+1]!=null)
                    swap(libros,j, j+1);
            }
        }
    }
    private static void swap(Libro[] array, int i, int j){
        Libro aux = array[j];
        array[j]=array[i];
        array[i]=aux;
    }

    public boolean prestamo(Libro libro){
        if (checkLibro(libro)==-1){
            return false;
        }
        return libro.prestamo();
    }

    public boolean devolucion(Libro libro){
        if (checkLibro(libro)==-1){
            return false;
        }
        return libro.devolucion();
    }

    //Override
    @Override
    public String toString(){
        String aux = "\n-------------------------------------------------------------------------" +
                "\nLocalidad: " + localidad +
                "\nLibros de la biblioteca: " +
                "\nNºTotal de ejemplares: " + n_total;
        int i=0;
        while (libros[i]!=null){
            aux += libros[i].toString();
            i++;
        }
        return aux;
    }



}
