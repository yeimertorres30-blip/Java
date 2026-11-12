package Lab02S20;

import java.util.function.Supplier;

public class Lab02 {
    public static void main(String[] args) {
        Supplier<String> obtenerHorario = () -> "Horario: 8:00 a 17:00";

        System.out.println("--- Lab02: Horario de atención ---");

        String primera = obtenerHorario.get();
        System.out.println(primera);

        String segunda = obtenerHorario.get();
        System.out.println(segunda);

        String tercera = obtenerHorario.get();
        System.out.println(tercera);
    }
}