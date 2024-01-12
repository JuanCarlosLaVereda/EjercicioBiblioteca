package es.ieslavereda;
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca("La pobla");
        Biblioteca biblioteca2 = new Biblioteca("La Eliana");

        for (int i = 0; i < 4; i++) {
            biblioteca1.addLibro(new Libro("Ejemplo" + i, "Autor" + i, 33));
        }
        System.out.println(biblioteca2.removeLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes Saavedra", 3)));
        System.out.println(biblioteca2.removeLibro(new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 3)));
        System.out.println(biblioteca2.removeLibro(new Libro("Desolación", "Gabriela Mistral", 3)));
        System.out.println(biblioteca2.removeLibro(new Libro("dfgdfgdfgfgfg", "Ggggggggg", 3)));



        System.out.println(biblioteca1.prestamo(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes Saavedra", 3)));
        System.out.println(biblioteca2.prestamo(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes Saavedra", 3)));
        System.out.println(biblioteca1);
        System.out.println(biblioteca2);
    }
}