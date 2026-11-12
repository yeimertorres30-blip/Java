package Lab02S20;
import java.util.List;

public class Lab02S20 {

    public static List<Integer> convertirKgAGramos(List<Integer> pesosKg) {
        return pesosKg.stream()
                .map(kg -> kg * 1000)
                .toList();
    }

    public static void main(String[] args) {
        // Pruebas
        List<Integer> caso1 = List.of(5, 12, 8);
        List<Integer> caso2 = List.of(0, 2);
        List<Integer> caso3 = List.of();

        System.out.println("Caso 1 (5, 12, 8): " + convertirKgAGramos(caso1));
        System.out.println("Caso 2 (0, 2): " + convertirKgAGramos(caso2));
        System.out.println("Caso 3 (Lista vacía): " + convertirKgAGramos(caso3));
    }
}