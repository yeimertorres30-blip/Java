package s18lab01;

import java.sql.SQLException;
import java.util.List;

public class ProductoController {
    private final ProductoDAO dao;
    private final VistaInventario vista;

    public ProductoController(ProductoDAO dao, VistaInventario vista) {
        this.dao = dao;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    listarProductos();
                    break;
                case 2:
                    registrarProducto();
                    break;
                case 3:
                    actualizarStock();
                    break;
                case 4:
                    vista.mostrarMensaje("Saliendo de la aplicación. ¡Hasta luego!");
                    break;
                default:
                    vista.mostrarError("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 4);
    }

    private void listarProductos() {
        try {
            List<Producto> productos = dao.listar();
            vista.mostrarListado(productos);
        } catch (SQLException e) {
            vista.mostrarError("No se pudo consultar el listado: " + e.getMessage());
        }
    }

    private void registrarProducto() {
        try {
            String nombre = vista.pedirNombre();
            int stock = vista.pedirStock();

            Producto producto = new Producto(nombre, stock);
            int filas = dao.registrar(producto);

            if (filas > 0) {
                vista.mostrarMensaje("¡Producto registrado exitosamente!");
            }
        } catch (IllegalArgumentException e) {
            vista.mostrarError(e.getMessage());
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                vista.mostrarError("Ya existe un producto registrado con ese nombre.");
            } else {
                vista.mostrarError("No se pudo registrar el producto: " + e.getMessage());
            }
        }
    }

    private void actualizarStock() {
        try {
            int id = vista.pedirId();
            if (id <= 0) {
                vista.mostrarError("El ID debe ser un número positivo.");
                return;
            }

            int nuevoStock = vista.pedirStock();
            if (nuevoStock < 0) {
                vista.mostrarError("El stock no puede ser negativo.");
                return;
            }

            int filas = dao.actualizarStock(id, nuevoStock);
            if (filas > 0) {
                vista.mostrarMensaje("Filas afectadas: 1");
            } else {
                vista.mostrarMensaje("Sin coincidencias para ese id.");
            }
        } catch (IllegalArgumentException e) {
            vista.mostrarError(e.getMessage());
        } catch (SQLException e) {
            vista.mostrarError("No se pudo actualizar el stock: " + e.getMessage());
        }
    }
}