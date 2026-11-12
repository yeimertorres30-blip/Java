package s10lab02;

public class Solucion {
    public static void main(String[] args) {
        Incidencia media60 = new Incidencia(Prioridad.MEDIA);
        media60.registrarMinutos(60);
        System.out.println("MEDIA 60 min: vencida=" + media60.estaVencida());

        Incidencia media61 = new Incidencia(Prioridad.MEDIA);
        media61.registrarMinutos(61);
        System.out.println("MEDIA 61 min: vencida=" + media61.estaVencida());

        Incidencia baja120 = new Incidencia(Prioridad.BAJA);
        baja120.registrarMinutos(120);
        System.out.println("BAJA 120 min: vencida=" + baja120.estaVencida());
    }
}