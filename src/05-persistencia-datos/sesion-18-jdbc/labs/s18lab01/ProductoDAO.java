package s18lab01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    public List<Producto> listar() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT id, nombre, stock FROM productos ORDER BY id";

        try (Connection conn = ConexionFactory.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int stock = rs.getInt("stock");
                productos.add(new Producto(id, nombre, stock));
            }
        }
        return productos;
    }

    public int registrar(Producto producto) throws SQLException {
        String sql = "INSERT INTO productos (nombre, stock) VALUES (?, ?)";

        try (Connection conn = ConexionFactory.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, producto.getNombre());
            stmt.setInt(2, producto.getStock());
            return stmt.executeUpdate();
        }
    }

    public int actualizarStock(int id, int nuevoStock) throws SQLException {
        String sql = "UPDATE productos SET stock = ? WHERE id = ?";

        try (Connection conn = ConexionFactory.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, nuevoStock);
            stmt.setInt(2, id);
            return stmt.executeUpdate();
        }
    }
}