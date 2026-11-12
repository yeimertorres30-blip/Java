public class Lab04DiagnosticaYCorrige {
    public static void main(String[] args) {
        // En tu copia personal, activa un caso por vez, lee el error y repáralo.
        // Los casos están comentados para que esta plantilla pueda compilar.

        // Caso 1: String nombre = 'Ana';
        // TODO 1: Corregir las comillas, mostrar el nombre y explicar la causa.
        String nombre = "Ana";
        // La causa es que se debe poner en comillas dobles y no sencillas
        // Caso 2: int temperatura = 23.5;
        // TODO 2: Conservar el valor decimal usando un tipo adecuado y mostrarlo.
        double temperatura = 23.5;
        // Caso 3:
        // int edad;
        // System.out.println(edad);
        // TODO 3: Inicializar edad antes de mostrarla y explicar por qué es necesario.
        int edad = 22;
        System.out.println(edad);
        // debe darle un valor a la variable para poder mostrarla pq o si no dara error
        // Caso 4:
        // final String CURSO = "Java";
        // CURSO = "Python";
        // TODO 4: Conservar CURSO como final y mostrar "Java", sin reasignarlo.
        final String CURSO = "Java";
        System.out.println(CURSO);
        // TODO 5: Registrar los cuatro mensajes del compilador en tu README personal,
        // junto con la causa y la corrección aplicada a cada caso.
        // TODO 1:
        // Error: estaba usando comillas simples para un String.
        // Causa: En Java, los String se escriben con comillas dobles.
        // Corrección: Cambie 'Ana' por "Ana".

        // TODO 2:
        // Error: Estaba usando int para un valor decimal.
        // Causa: La variable int no permite guardar números decimales.
        // Corrección: Cambie el tipo int por double.

        // TODO 3:
        // Error: No estaba inicializada la variable edad.
        // Causa: Al no inicializar la variable no mostrara nada.
        // Corrección: Inicialice edad con el valor 22 antes de mostrarla.

        // TODO 4:
        // Error: westaba mal asignada la variable.
        // Causa: Una variable declarada con final no puede reasignarse.
        // Corrección: Se conservó el valor "Java" y se eliminó la reasignación de CURSO = "Python".
    }
}