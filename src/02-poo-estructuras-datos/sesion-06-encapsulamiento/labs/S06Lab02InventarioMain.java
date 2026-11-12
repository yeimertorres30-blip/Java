public class S06Lab02InventarioMain {
    public static void main(String[] args) {
        // TODO 6: Crear un inventario y mostrar sus existencias iniciales.
        S06Inventario inventario = new S06Inventario();
        System.out.println("Existencias iniciales: " + inventario.getExistencias());
        // TODO 7: Ingresar 10, retirar 11 y retirar 10; mostrar resultado y existencias tras cada accion.
        boolean resIngresar10 = inventario.ingresar(10);
        System.out.println("Ingresar 10 = Resultado: " + resIngresar10 + " Existencias: " + inventario.getExistencias());
        boolean resRetirar11 = inventario.retirar(11);
        System.out.println("Retirar 11  = Resultado: " + resRetirar11 + " Existencias: " + inventario.getExistencias());
        boolean resRetirar10 = inventario.retirar(10);
        System.out.println("Retirar 10  = Resultado: " + resRetirar10 + " Existencias: " + inventario.getExistencias());
        // TODO 8: Intentar ingresar 0 y 101; mostrar resultado y existencias tras cada accion.
        boolean Ingresar0 = inventario.ingresar(0);
        System.out.println("Ingresar 0   = Resultado: " + Ingresar0 + " Existencias: " + inventario.getExistencias());
        boolean Ingresar101 = inventario.ingresar(101);
        System.out.println("Ingresar 101 = Resultado: " + Ingresar101 + " Existencias: " + inventario.getExistencias());
    }
}
