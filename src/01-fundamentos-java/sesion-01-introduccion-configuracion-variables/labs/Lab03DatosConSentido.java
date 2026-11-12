public class Lab03DatosConSentido {
    public static void main(String[] args) {
        // TODO 1: Elegir y justificar los tipos para nombre, edad, temperatura,
        // inicial y activo. Usa String, int, double, char y boolean.
        // String: se utiliza para almacenar texto.
        // int: se utiliza para almacenar números enteros.
        // double: se utiliza para almacenar números decimales.
        // char: se utiliza para almacenar un solo carácter.
        // boolean: se utiliza para representar valores verdadero o falso.
        // TODO 2: Declarar e inicializar las cinco variables con nombres claros.
        String nombre = "Yeimer Andrés";
        int edad = 22;
        double temperatura = 36.5;
        char inicial = 'Y';
        boolean activo = true;
        // TODO 3: Mostrar cada dato en su propia línea, con una etiqueta.
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Activo: " + activo);
        // TODO 4: Probar el caso A del README; el caso B es opcional.
        System.out.println("Caso A");
        String nombre2 = "Ana";
        int edad2 = 20;
        double temperatura2 = 23.5;
        char inicial2 = 'A';
        boolean activo2 = true;
        System.out.println("Nombre: " + nombre2);
        System.out.println("Edad: " + edad2);
        System.out.println("Temperatura: " + temperatura2);
        System.out.println("Inicial: " + inicial2);
        System.out.println("Activo: " + activo2);
        // TODO 5: Explicar por qué String no es un tipo primitivo.
        // Porque es una clase de Java que permite almacenar texto
    }
}
