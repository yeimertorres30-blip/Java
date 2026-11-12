package s10lab03;

public class Solucion {
    public static void main(String[] args) {
        RegistroTemperaturas reg1 = new RegistroTemperaturas();
        String[] caso1 = {"abc", "", "80"};
        for (String e : caso1) { reg1.registrar(e); }
        System.out.println("Caso 1 - Aceptadas: " + reg1.aceptadas() + ", Rechazadas: " + reg1.rechazadas() + ", Promedio: " + reg1.promedioComoTexto());

        RegistroTemperaturas reg2 = new RegistroTemperaturas();
        String[] caso2 = {"-10", "50"};
        for (String e : caso2) { reg2.registrar(e); }
        System.out.println("Caso 2 - Aceptadas: " + reg2.aceptadas() + ", Promedio: " + reg2.promedioComoTexto());
    }
}