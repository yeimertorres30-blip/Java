public class S06Lab03PedidoMain {
    public static void main(String[] args) {
        // TODO 6: Crear primerPedido y segundoPedido; mostrar el estado inicial de ambos.
        S06Pedido primerPedido = new S06Pedido();
        S06Pedido segundoPedido = new S06Pedido();
        System.out.println("    ESTADO INICIAL");
        System.out.println("Estado inicial primerPedido: " + primerPedido.getEstado());
        System.out.println("Estado inicial segundoPedido: " + segundoPedido.getEstado());
        // TODO 7: Enviar primerPedido y luego intentar cancelarlo; consultar tras cada accion.
        System.out.println("\n    PRUEBAS CON PRIMER PEDIDO");
        primerPedido.enviar();
        System.out.println("Tras enviar: " + primerPedido.getEstado());
        primerPedido.cancelar();
        System.out.println("Tras intentar cancelar: " + primerPedido.getEstado());
        // TODO 8: Cancelar segundoPedido y luego intentar enviarlo; consultar tras cada accion.
        System.out.println("\n    PRUEBAS CON SEGUNDO PEDIDO");
        segundoPedido.cancelar();
        System.out.println("Tras cancelar: " + segundoPedido.getEstado());
        segundoPedido.enviar();
        System.out.println("Tras intentar enviar: " + segundoPedido.getEstado());
    }
}
