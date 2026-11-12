package s07lab04;

public class S07Lab04InterfacesMain {
    public static void mostrarExportacion(Exportable formato) {
        // TODO 4: Imprimir formato.exportar con Asistencia y 12.
        System.out.println(formato.exportar("Asistencia", 15));
    }

    public static void main(String[] args) {
        // TODO 5: Llamar al mismo cliente con un ResumenTexto y un ResumenCsv.
        Exportable texto = new ResumenCsv();
        Exportable csv = new ResumenCsv();
        System.out.print("Texto: ");
        mostrarExportacion(texto);
        System.out.print("Csv: ");
        mostrarExportacion(csv);
    }
}
