package Lab05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lab05 {
    public static void main(String[] args) {
        System.out.println("--- Lab05: Lista de participantes ---");

        List<String> lista1 = new ArrayList<>(Arrays.asList("Sofia", "Luis", "Ana"));
        List<String> lista2 = new ArrayList<>(Arrays.asList("Luis", "Ana", "Ana"));
        List<String> lista3 = new ArrayList<>(); // Lista vacía

        Comparator<String> compararAlfabetico = (s1, s2) -> s1.compareTo(s2);

        ordenarYMostrar("Caso 1", lista1, compararAlfabetico);
        ordenarYMostrar("Caso 2", lista2, compararAlfabetico);
        ordenarYMostrar("Caso 3", lista3, compararAlfabetico);
    }

    private static void ordenarYMostrar(String etiqueta, List<String> lista, Comparator<String> comparador) {
        lista.sort(comparador);
        System.out.println(etiqueta + " ordenada -> " + (lista.isEmpty() ? "Vacía, sin error" : String.join(",", lista)));
    }
}