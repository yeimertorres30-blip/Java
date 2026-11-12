package Lab00;

import java.util.function.Predicate;

public class Lab00 {
    public static void main(String[] args) {
        // 1 y 2. Definición de la regla con Predicate<Integer>
        Predicate<Integer> puedeIngresar = edad -> edad >= 15;

        // 3. Pruebas con las tres edades requeridas
        int[] edades = {14, 15, 20};

        System.out.println("--- Lab00: Acceso a un taller ---");
        for (int edad : edades) {
            // Invoca la lambda con el método test(valor)
            boolean resultado = puedeIngresar.test(edad);
            System.out.println("Edad: " + edad + " -> " + resultado);
        }
    }
}