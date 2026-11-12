public class Lab05PerfilEstudiante {
    public static void main(String[] args) {
        // TODO 1: Identificar los tipos de nombre, edad, ciudad, promedio y activo.
        // nombre: String.
        // edad: int.
        // ciudad: String.
        // promedio: double.
        // activo: boolean.
        // TODO 2: Declarar e inicializar esos datos con nombres claros.
        String nombreEstudiante = "Yeimer";
        int edadEstudiante = 22;
        String ciudadEstudiante = "Bogota";
        double promedioEstudiante = 4.5;
        boolean activoEstudiante = true;
        // TODO 3: Declarar final String CURSO con el valor "Java".
        final String CURSO = "Java";
        // TODO 4: Mostrar la ficha inicial con etiquetas legibles.
        System.out.println("FICHA DEL ESTUDIANTE");
        System.out.println("Nombre: " + nombreEstudiante);
        System.out.println("Edad: " + edadEstudiante);
        System.out.println("Ciudad: " + ciudadEstudiante);
        System.out.println("Promedio: " + promedioEstudiante);
        System.out.println("Activo: " + activoEstudiante);
        System.out.println("Curso: " + CURSO);
        // TODO 5: Reasignar ciudad para representar un cambio de residencia y mostrar
        // "Ciudad actualizada: " con el nuevo valor, conservando el mismo tipo.
        ciudadEstudiante = "Cucuta";
        System.out.println("Ciudad actualizada: " + ciudadEstudiante);
        // TODO 6: Probar el perfil A del README; el perfil B es opcional.
        System.out.println("Perfil A");
        String nombreEstudiante2 = "Ana";
        int edadEstudiante2 = 20;
        String ciudadEstudiante2 = "Cucuta";
        double promedioEstudiante2 = 4.2;
        boolean activoEstudiante2 = true;
        final String CURSO2 = "Java";
        System.out.println("FICHA DEL ESTUDIANTE 2");
        System.out.println("Nombre: " + nombreEstudiante2);
        System.out.println("Edad: " + edadEstudiante2);
        System.out.println("Ciudad: " + ciudadEstudiante2);
        System.out.println("Promedio: " + promedioEstudiante2);
        System.out.println("Activo: " + activoEstudiante2);
        System.out.println("Curso: " + CURSO2);
        // TODO 7: Colocar un breakpoint antes de la reasignación; observar ciudad,
        // usar Step Over y registrar el valor anterior y el nuevo.
        // Valor anterior: Bogota
        // Valor nuevo: Cucuta
        // TODO 8: Explicar una elección de tipo y qué garantiza final en CURSO.
        // Elegí String para nombreEstudiante porque permite almacenar texto.
        // final impide reasignar CURSO después de inicializarlo.
    }
}
