package s18lab01;

public class Main {
    public static void main(String[] args) {
        ProductoDAO dao = new ProductoDAO();
        VistaInventario vista = new VistaInventario();
        ProductoController controller = new ProductoController(dao, vista);

        controller.iniciar();
    }
}