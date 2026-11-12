public class S02Lab01CalculaYPredice {
    public static void main(String[] args) {
        int unidades = 7;
        int capacidad = 2;
        int contador = 3;

        // TODO 1: Predecir los resultados en un comentario antes de ejecutar.
        // suma = 9
        // resta = 5
        // producto = 14
        // division entera = 3
        // resto = 1
        // division con decimales = 3.5
        // 2+3*4 =14 ya que por la priridad de las operaciones es: 4*3=12+2=14
        // (2+3)*4 =20 ya que la prioridad de las operaciones es: (2+3)=5*4=20
        // TODO 2: Calcular y mostrar suma, resta, producto, división entera y resto.
        System.out.println("Operaciones Básicas");
        System.out.println("Suma: " + (unidades + capacidad));
        System.out.println("Resta: " + (unidades - capacidad));
        System.out.println("Producto: " + (unidades * capacidad));
        System.out.println("Division entera: " + (unidades / capacidad));
        System.out.println("Resto: " + (unidades % capacidad));
        // TODO 3: Mostrar 7.0 / capacidad y explicar por qué conserva decimales.
        System.out.println("\nDivisión con Decimales");
        System.out.println("7.0 / capacidad: " + (7.0 / capacidad));
        // TODO 4: Comparar 2 + 3 * 4 con (2 + 3) * 4.
        System.out.println("\nPrecedencia de Operadores");
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4));
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4));
        // TODO 5: Incrementar contador en una sentencia, mostrarlo; decrementar y mostrarlo.
        System.out.println("\nOperadores de Incremento y Decremento");
        contador++;
        System.out.println("Contador incrementado: " + contador);
        contador--;
        System.out.println("Contador decrementado: " + contador);
        // TODO 6 (opcional): Probar unidades = 8 y explicar qué cambia. Mantener capacidad = 2.
        System.out.println("\n--- Prueba Opcional con unidades = 8 ---");
        unidades = 8;
        System.out.println("Unidades actualizadas: " + unidades);
        System.out.println("Nueva division entera (8 / 2): " + (unidades / capacidad));
        System.out.println("Nuevo resto (8 % 2): " + (unidades % capacidad));
        // TODO 7: Registrar predicción, resultado y causa de cualquier diferencia.
        // No hubo diferencias
    }
}
