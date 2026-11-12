public class S05ReservaSala {
    // TODO 1: Declarar cliente (String), horas (int) y tarifaPorHora (long) privados.
    private String cliente ;
    private int horas;
    private long tarifa_por_hora;
    public S05ReservaSala(String cliente, int horas, long tarifaPorHora) {
        // TODO 2: Inicializar los tres campos con los parametros.
        this.cliente = cliente;
        this.horas = horas;
        this.tarifa_por_hora = tarifaPorHora;
    }

    public String obtenerCliente() {
        // TODO 3: Devolver el cliente.
        return cliente; // Retorno provisional: reemplazar.
    }

    public int obtenerHoras() {
        // TODO 4: Devolver las horas actuales.
        return horas; // Retorno provisional: reemplazar.
    }

    public long calcularCosto() {
        // TODO 5: Devolver horas por tarifaPorHora.
        return horas * tarifa_por_hora; // Retorno provisional: reemplazar.
    }

    public boolean extender(int horasAdicionales) {
        // TODO 6: Aceptar solo de 1 a 8 - horas; actualizar si acepta y devolver el resultado.
        if (horasAdicionales >=1 && (horas + horasAdicionales <=8)){
            horas += horasAdicionales;
            return true;
        }
        return false; // Retorno provisional: reemplazar.
    }
}
