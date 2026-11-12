public class S05Lab03ReservaSala {
    public static void main(String[] args) {
        // TODO 7: Crear reservaAna (2 horas, 15000 pesos/hora) y reservaLuis (1, 20000).
        S05ReservaSala reserva_Ana = new S05ReservaSala("Ana", 2, 15000);
        S05ReservaSala reserva_Luis = new S05ReservaSala("lUIS", 1, 20000);
        // TODO 8: Mostrar los resultados de extender la reserva de Ana en 1, 6 y 0 horas.
        System.out.println("Extender Ana 1 hora: " + reserva_Ana.extender(1));
        System.out.println("Extender Ana 6 hora: " + reserva_Ana.extender(6));
        System.out.println("Extender Ana 0 hora: " + reserva_Ana.extender(0));
        // TODO 9: Mostrar cliente, horas y costo final de ambas reservas.
        System.out.println("     Resumen Ana");
        System.out.println("Nombre: " + reserva_Ana.obtenerCliente());
        System.out.println("Horas: " + reserva_Ana.obtenerHoras());
        System.out.println("Costo final: " + reserva_Ana.calcularCosto());
        System.out.println("     Resumen Luis");
        System.out.println("Nombre: " + reserva_Luis.obtenerCliente());
        System.out.println("Horas: " + reserva_Luis.obtenerHoras());
        System.out.println("Costo final: " + reserva_Luis.calcularCosto());
    }
}
