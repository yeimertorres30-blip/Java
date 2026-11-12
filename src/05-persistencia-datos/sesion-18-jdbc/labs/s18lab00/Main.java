package s18lab00;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/campus_java_s18?useSSL=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Cucuta202601";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            if (connection.isValid(5)) {
                System.out.println("¡Conexión exitosa a la base de dados!");
            } else {
                System.out.println("La conexión no es válida.");
                return;
            }

            int opcion = 0;
            do {
                mostrarMenu();
                System.out.print("Selecciona una opción: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Por favor, ingresa un número válido.");
                    scanner.next(); // Limpiar buffer
                    continue;
                }

                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        registrarLibro(connection, scanner);
                        break;
                    case 2:
                        listarLibros(connection);
                        break;
                    case 3:
                        buscarLibroPorIsbn(connection, scanner);
                        break;
                    case 4:
                        System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Intenta de nuevo.");
                }
                System.out.println();
            } while (opcion != 4);

        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos: " + e.getMessage());
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("=== BIBLIOTECA - MENÚ PRINCIPAL ===");
        System.out.println("1. Registrar libro");
        System.out.println("2. Listar libros");
        System.out.println("3. Buscar libro por ISBN");
        System.out.println("4. Salir");
    }


    private static void registrarLibro(Connection connection, Scanner scanner) {
        System.out.print("Ingresa el título del libro (máx. 150 caracteres): ");
        String titulo = scanner.nextLine().trim();

        if (titulo.isEmpty() || titulo.length() > 150) {
            System.out.println("Error: El título no puede estar vacío ni superar los 150 caracteres.");
            return;
        }

        System.out.print("Ingresa el ISBN del libro (máx. 20 caracteres): ");
        String isbn = scanner.nextLine().trim();

        if (isbn.isEmpty() || isbn.length() > 20) {
            System.out.println("Error: El ISBN no puede estar vacío ni superar los 20 caracteres.");
            return;
        }

        String sql = "INSERT INTO libros (titulo, isbn) VALUES (?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, titulo);
            pstmt.setString(2, isbn);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("¡Libro registrado exitosamente! (Filas insertadas: " + filasAfectadas + ")");
            }
        } catch (SQLException e) {
            // Manejo especial si el ISBN ya existe (Constraint UNIQUE)
            if (e.getErrorCode() == 1062) {
                System.out.println("Error: Ya existe un libro registrado con el ISBN " + isbn + ".");
            } else {
                System.out.println("No se pudo registrar el libro: " + e.getMessage());
            }
        }
    }

    private static void listarLibros(Connection connection) {
        String sql = "SELECT id, titulo, isbn FROM libros ORDER BY id";

        try (PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("\n--- LISTADO DE LIBROS ---");
            boolean hayLibros = false;

            while (rs.next()) {
                hayLibros = true;
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String isbn = rs.getString("isbn");
                System.out.printf("%d | %s | %s%n", id, titulo, isbn);
            }

            if (!hayLibros) {
                System.out.println("Sin libros.");
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar el listado: " + e.getMessage());
        }
    }

    private static void buscarLibroPorIsbn(Connection connection, Scanner scanner) {
        System.out.print("Ingresa el ISBN a buscar: ");
        String isbnBuscado = scanner.nextLine().trim();

        if (isbnBuscado.isEmpty()) {
            System.out.println("El ISBN no puede estar vacío.");
            return;
        }

        String sql = "SELECT id, titulo, isbn FROM libros WHERE isbn = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, isbnBuscado);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("\n--- LIBRO ENCONTRADO ---");
                    int id = rs.getInt("id");
                    String titulo = rs.getString("titulo");
                    String isbn = rs.getString("isbn");
                    System.out.printf("%d | %s | %s%n", id, titulo, isbn);
                } else {
                    System.out.println("Sin resultados.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al realizar la búsqueda: " + e.getMessage());
        }
    }
}