public class S06Lab01TermostatoMain {
    public static void main(String[] args) {
        // TODO 5: Crear un termostato y mostrar su temperatura inicial.
        S06Termostato termostato = new S06Termostato();
        System.out.println("Temperatura inicial: " + termostato.getTemperaturaObjetivo());
        // TODO 6: Solicitar 24, 31 y 16; mostrar cada resultado y la temperatura posterior.
        boolean exito24 = termostato.ajustarTemperatura(24);
        System.out.println("Ajuste a 24: " + exito24 + " Temperatura posterior: " + termostato.getTemperaturaObjetivo() + "°c");
        boolean exito31 = termostato.ajustarTemperatura(31);
        System.out.println("Ajuste a 31: " + exito31 + " Temperatura posterior: " + termostato.getTemperaturaObjetivo() + "°c");
        boolean exito16 = termostato.ajustarTemperatura(16);
        System.out.println("Ajuste a 16: " + exito16 + " Temperatura posterior: " + termostato.getTemperaturaObjetivo() + "°c");
    }
}
