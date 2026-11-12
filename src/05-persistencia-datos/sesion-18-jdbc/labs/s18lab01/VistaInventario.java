package s18lab01;

import java.util.List;
import java.util.Scanner;

public class VistaInventario {
    private final Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== INVENTARIO - MENÚ PRINCIPAL ===");
        System.out.println("1. Listar productos");
        System.out.println("2. Registrar producto");
        System.out.println("3. Actualizar stock por ID");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");

        if (!scanner.hasNextInt()) {
            scanner.next(); // Limpiar entrada inválida
            return -1;
        }
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea
        return opcion;
    }

    public void mostrarListado(List<Producto> productos) {
        System.out.println("\n--- LISTADO DE PRODUCTOS ---");
        if (productos.isEmpty()) {
            System.out.println("Sin productos.");
        } else {
            for (Producto p : productos) {
                System.out.printf("%d | %s | %d%n", p.getId(), p.getNombre(), p.getStock());
            }
        }
    }

    public String pedirNombre() {
        System.out.print("Ingresa el nombre del producto (máx. 100 caracteres): ");
        return scanner.nextLine().trim();
    }

    public int pedirStock() {
        System.out.print("Ingresa el stock del producto: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingresa un número entero válido para el stock: ");
            scanner.next();
        }
        int stock = scanner.nextInt();
        scanner.nextLine();
        return stock;
    }

    public int pedirId() {
        System.out.print("Ingresa el ID del producto: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingresa un ID entero válido: ");
            scanner.next();
        }
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
}