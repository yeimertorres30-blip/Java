package Lab01;

import java.util.function.Consumer;

public class Lab01 {
    public static void main(String[] args) {
        Consumer<String> enviarAviso = nombre -> System.out.println("Tu pedido esta listo, " + nombre);

        String[] nombres = {"Ana", "Luis", "Sara"};

        System.out.println("--- Lab01: Aviso de lavandería ---");
        for (String nombre : nombres) {
            enviarAviso.accept(nombre);
        }
    }
}