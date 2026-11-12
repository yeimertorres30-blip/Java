package Lab04;

import java.util.function.BiFunction;

public class Lab04 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> calcularRestantes = (contratados, utilizados) -> contratados - utilizados;

        System.out.println("--- Lab04: Minutos disponibles de una sala ---");

        int[][] datosPrueba = {
                {120, 45},
                {120, 0},
                {120, 120}
        };

        for (int[] datos : datosPrueba) {
            int contratados = datos[0];
            int utilizados = datos[1];
            int restantes = calcularRestantes.apply(contratados, utilizados);
            System.out.println("Contratados: " + contratados + ", Utilizados: " + utilizados + " -> Restantes esperados: " + restantes);
        }
    }
}