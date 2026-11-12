import java.util.Scanner;
public class S03Reto02Creditos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int evaluadas = 0;
        int aprobadas = 0;
        int revision_manual = 0;
        int rechazadas = 0;
        do {
            System.out.println("Bienvenido a tu banco de confianza");
            System.out.println("Escoge una de las siguientes opciones");
            System.out.println("1. Nueva solicitud");
            System.out.println("0. Finalizar");
            System.out.print("Escogue una opcion: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next();
                continue;
            }
            opcion = scanner.nextInt();
            if (opcion == 0){
                break;
            } else if (opcion == 1){
                int edad;
                long ingesos_mensuales;
                long gastos_mensuales;
                long credito_solicitado;
                long meses;
                while (true){
                    System.out.print("Digita tu edad debe ser entre 0 y 120 años: ");
                    if (!scanner.hasNextInt()){
                        System.out.println("Error: la edad debe ser un numero entero: ");
                        scanner.next();
                        continue;
                    }
                    edad = scanner.nextInt();

                    if (edad <= 0) {
                        System.out.println("Error: La edad deben ser entre 0 y 120. Intente nuevamente.");
                    } else {
                        break;
                    }
                }
                while (true){
                    System.out.print("Digita tus ingresos mensuales entre 0 y 1000000000: ");
                    if (!scanner.hasNextLong()){
                        System.out.println("Error: Los ingresos deben ser un número entero.");
                        scanner.next();
                        continue;
                    }
                    ingesos_mensuales = scanner.nextLong();
                    if (ingesos_mensuales < 0 || ingesos_mensuales > 1000000000){
                        System.out.println("Error: Los ingrresos deben estar entre 0 y 1000000000.");
                    }else {
                        break;
                    }
                }
                while (true){
                    System.out.print("Digita tus gastos mensuales entre 0 y 1000000000: ");
                    if (!scanner.hasNextLong()){
                        System.out.println("Error: Los gastos debem ser un numero entero.");
                        scanner.next();
                        continue;
                    }
                    gastos_mensuales = scanner.nextLong();
                    if (gastos_mensuales <0 || gastos_mensuales > 1000000000){
                        System.out.println("Error los gastos deben estar entre 0 y 1000000000.");
                    }else {
                        break;
                    }
                }
                while (true){
                    System.out.print("Digita el prestamo que quieres solicitar entre 1 y 1000000000: ");
                    if (!scanner.hasNextLong()){
                        System.out.println("Error: el prestamo debe ser un numero entero.");
                        scanner.next();
                        continue;
                    }
                    credito_solicitado = scanner.nextLong();
                    if (credito_solicitado < 1 || credito_solicitado > 1000000000){
                        System.out.println("Error el prestamo debe estat ente 1 y 1000000000");
                    }else {
                        break;
                    }
                }
                while (true){
                    System.out.print("Digita la cantidad en meses para pagar el credito: ");
                    if (!scanner.hasNextLong()){
                        System.out.println("Error: los mese deben ser un numero entero");
                        scanner.next();
                        continue;
                    }
                    meses = scanner.nextLong();
                    if (meses < 1 || meses > 360){
                        System.out.println("Error: los meses deben ser entre 1 y 360.");
                    }else{
                        break;
                    }
                }
                evaluadas++;
                if (edad < 18 || edad > 70){
                    System.out.println("\n Resultado: RECHAZADA: por edad (debe ser entre 18 y 70) ");
                    rechazadas++;
                    continue;
                }
                if (ingesos_mensuales <= gastos_mensuales){
                    System.out.println("\n Resultado: RECHAZADA (los ingresos deben ser mayores a los gastos)");
                    rechazadas++;
                    continue;
                }
                long disponible = ingesos_mensuales - gastos_mensuales;
                double cuota_aproximada = (double) credito_solicitado / meses;
                double endeudamiento = (cuota_aproximada / disponible) * 100;
                long credito = credito_solicitado * 100;
                long credito35 = disponible * meses * 35;
                long credito45 = disponible * meses * 45;
                System.out.println("Cuota aproximada: " + cuota_aproximada);
                System.out.println("Nivel de endudamiento: " + endeudamiento);
                if (credito <= credito35){
                    System.out.println("Estado: APROBADO");
                    aprobadas++;
                }else if (credito <= credito45){
                    System.out.println("Estado: REVISION MANUAL");
                    revision_manual++;
                }else {
                    System.out.println("Estado: RECHAZADA (Supera el 45% de endeudamiento");
                    rechazadas++;
                }
            }else {
                System.out.println("Opcion invalida intente de nuevo");
            }
        }while (true);
        System.out.println("         RESUMEN DE OPERACIONES");
        System.out.println("solicitudes evaluadas: " + evaluadas);
        System.out.println("Solicitudes aprobadas; " + aprobadas);
        System.out.println("Solicitudes en revision manual; " + revision_manual);
        System.out.println("Solicitudes rechazadas; " + rechazadas);
        scanner.close();
    }
}
