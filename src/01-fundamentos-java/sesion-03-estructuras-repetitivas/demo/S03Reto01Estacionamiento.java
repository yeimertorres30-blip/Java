import java.util.Scanner;

public class S03Reto01Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVehiculos = 0;
        int totalAutos = 0;
        int totalMotos = 0;
        long totalIngresado = 0;
        long totalDescuentos = 0;
        long dineroRecaudado = 0;

        int opcion;

        do {
            System.out.println("\nSISTEMA DE TARIFA DE ESTACIONAMIENTO");
            System.out.println("1 = Automóvil");
            System.out.println("2 = Motocicleta");
            System.out.println("0 = Terminar jornada");
            System.out.print("Seleccione una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next();
                continue;
            }

            opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            } else if (opcion == 1 || opcion == 2) {

                int horas;

                while (true) {
                    System.out.print("Ingrese la cantidad de horas (mayor a 0): ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Error: Las horas deben ser un número entero.");
                        scanner.next();
                        continue;
                    }

                    horas = scanner.nextInt();

                    if (horas <= 0) {
                        System.out.println("Error: Las horas deben ser mayores a cero. Intente nuevamente.");
                    } else {
                        break;
                    }
                }

                long tarifaHora = (opcion == 1) ? 4000 : 2000;
                long valorInicial = tarifaHora * horas;
                long descuento = 0;

                if (opcion == 1 && horas > 5) {
                    descuento = (valorInicial * 10) / 100;
                } else if (opcion == 2 && horas > 8) {
                    descuento = (valorInicial * 5) / 100;
                }

                long totalPagar = valorInicial - descuento;

                System.out.println("\nCOMPROBANTE DE PAGO");
                System.out.println("Tipo de vehículo: " + (opcion == 1 ? "Automóvil" : "Motocicleta"));
                System.out.println("Valor inicial: " + valorInicial + " pesos");
                System.out.println("Descuento: " + descuento + " pesos");
                System.out.println("Total a pagar: " + totalPagar + " pesos");

                totalVehiculos++;

                if (opcion == 1) {
                    totalAutos++;
                } else {
                    totalMotos++;
                }

                totalIngresado += valorInicial;
                totalDescuentos += descuento;
                dineroRecaudado += totalPagar;

            } else {
                System.out.println("Error: Opción no válida. Por favor, elija 1, 2 o 0.");
            }

        } while (true);

        System.out.println("\n     RESUMEN FINAL DE LA JORNADA");
        System.out.println("Vehículos totales registrados: " + totalVehiculos);
        System.out.println("Automóviles registrados: " + totalAutos);
        System.out.println("Motocicletas registradas: " + totalMotos);
        System.out.println("Total ingresado: " + totalIngresado + " pesos");
        System.out.println("Total de descuentos: " + totalDescuentos + " pesos");
        System.out.println("Total recaudado: " + dineroRecaudado + " pesos");

        scanner.close();
    }
}