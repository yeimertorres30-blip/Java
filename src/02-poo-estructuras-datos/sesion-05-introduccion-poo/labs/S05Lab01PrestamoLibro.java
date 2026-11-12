public class S05Lab01PrestamoLibro {
    public static void main(String[] args) {
        // TODO 7: Crear primerLibro con El principito y segundoLibro con Matilda
        S05LibroPrestamo primer_libro = new S05LibroPrestamo("El principito");
        S05LibroPrestamo segundo_libro = new S05LibroPrestamo("Matilda");
        // TODO 8: Mostrar titulo, dos intentos de prestamo y estado del primer libro.
        System.out.println("Titulo: " + primer_libro.obtenerTitulo());
        System.out.println("Primer intento de prestamo del libro "+ primer_libro.obtenerTitulo()+ ": " + primer_libro.prestar());
        System.out.println("Segundo intento de prestamo del libro "+ primer_libro.obtenerTitulo()+ ": " + primer_libro.prestar());
        String estadoprimer_libro = primer_libro.estaPrestado() ? "Prestado" : "Disponible";
        String estadosegundo_libro = segundo_libro.estaPrestado() ? "Prestado" : "Disponible";
        System.out.println("Estado del libro " + primer_libro.obtenerTitulo() + ": " + estadoprimer_libro);
        System.out.println("Estado del libro " + segundo_libro.obtenerTitulo() + ": " + estadosegundo_libro);
        // TODO 9: Devolver el primer libro y mostrar el estado de ambos libros.
        primer_libro.devolver();
        System.out.println("El libro " + primer_libro.obtenerTitulo() + " fue devuelto");
        estadoprimer_libro = primer_libro.estaPrestado() ? "Prestado" : "Disponible";
        estadosegundo_libro = segundo_libro.estaPrestado() ? "Prestado" : "Disponible";
        System.out.println("Estado del libro " + primer_libro.obtenerTitulo() + ": " + estadoprimer_libro);
        System.out.println("Estado del libro " + segundo_libro.obtenerTitulo() + ": " + estadosegundo_libro);
    }
}
