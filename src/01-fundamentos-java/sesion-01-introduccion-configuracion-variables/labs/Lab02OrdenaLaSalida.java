public class Lab02OrdenaLaSalida {
    public static void main(String[] args) {
        // TODO 1: Predecir la salida de estas tres instrucciones en un comentario.
        System.out.print("A");
        System.out.println("B");
        System.out.println("C");
        // va a salir AB y en una linea abajo va a salir la C
        // TODO 2: Ejecutar y explicar cualquier diferencia con tu predicción.
        // No hubo diferencia
        // TODO 3: Modificar las instrucciones anteriores para obtener:
        // A - B - C
        System.out.print("A - ");
        System.out.print("B - ");
        System.out.print("C");
        // TODO 4: Agregar debajo una segunda línea que diga "Fin del laboratorio".
        System.out.println("Fin del laboratorio");
        // TODO 5: Explicar qué instrucción produce cada salto de línea.
        // La instrucción println() imprime el texto y luego hace un salto de línea.
        // La instrucción print() imprime el texto sin hacer un salto de línea.
        // Por eso, "A - B - C" aparece en una sola línea y
        // "Fin del laboratorio" aparece en la línea siguiente.
    }
}
