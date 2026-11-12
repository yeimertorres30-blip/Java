package Lab03;

import java.util.function.Function;

public class Lab03 {
    public static void main(String[] args) {
        Function<Integer, Double> gramosAKilos = gramos -> gramos / 1000.0;

        System.out.println("--- Lab03: Peso de un paquete ---");

        int[] pesosGramos = {500, 1000, 2500};

        for (int gramos : pesosGramos) {
            double kilos = gramosAKilos.apply(gramos);
            System.out.println("Gramos: " + gramos + " -> Kilogramos: " + kilos);
        }
    }
}