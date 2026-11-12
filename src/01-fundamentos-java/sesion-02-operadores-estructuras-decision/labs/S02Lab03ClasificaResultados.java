public class S02Lab03ClasificaResultados {
    public static void main(String[] args) {
        int nota = 85;

        // TODO 1: Rechazar notas fuera de 0 a 100 antes de clasificarlas.
        boolean notaValida = nota >= 0 && nota <= 100;
        // TODO 2: Clasificar con if/else if/else: A desde 90, B desde 80,
        // C desde 70, D desde 60 y E por debajo de 60.
        String categoria = "";

        if (notaValida) {
            if (nota >= 90) {
                categoria = "A";
            } else if (nota >= 80) {
                categoria = "B";
            } else if (nota >= 70) {
                categoria = "C";
            } else if (nota >= 60) {
                categoria = "D";
            } else {
                categoria = "E";
            }
        }

        // TODO 3: Mostrar "Categoria X" o "Nota invalida" según corresponda.
        if (!notaValida) {
            System.out.println("Nota invalida");
        } else {
            System.out.println("Categoria " + categoria);
        }
        // TODO 4: Probar nota 85, 90 y 101; las demás entradas son opcionales.
        System.out.println("Prueba 1: Nota 85");
        int nota2 = 85;
        if (nota2 < 0 || nota2 > 100) {
            System.out.println("Nota invalida");
        } else if (nota2 >= 90) {
            System.out.println("Categoria A");
        } else if (nota2 >= 80) {
            System.out.println("Categoria B");
        } else if (nota2 >= 70) {
            System.out.println("Categoria C");
        } else if (nota2 >= 60) {
            System.out.println("Categoria D");
        } else {
            System.out.println("Categoria E");
        }

        System.out.println("Prueba 2: Nota 90");
        int nota3 = 90;
        if (nota3 < 0 || nota3 > 100) {
            System.out.println("Nota invalida");
        } else if (nota3 >= 90) {
            System.out.println("Categoria A");
        } else if (nota3 >= 80) {
            System.out.println("Categoria B");
        } else if (nota3 >= 70) {
            System.out.println("Categoria C");
        } else if (nota3 >= 60) {
            System.out.println("Categoria D");
        } else {
            System.out.println("Categoria E");
        }

        System.out.println("Prueba 3: Nota 101");
        int nota4 = 101;
        if (nota4 < 0 || nota4 > 100) {
            System.out.println("Nota invalida");
        } else if (nota4 >= 90) {
            System.out.println("Categoria A");
        } else if (nota4 >= 80) {
            System.out.println("Categoria B");
        } else if (nota4 >= 70) {
            System.out.println("Categoria C");
        } else if (nota4 >= 60) {
            System.out.println("Categoria D");
        } else {
            System.out.println("Categoria E");
        }
        // TODO 5: Explicar con nota = 95 por qué el orden de las condiciones importa.
        // Con nota = 95, la primera condición nota >= 90 es verdadera, por lo que se clasifica como A. Si comprobamos nota >= 80 primero, se clasificaría como B.
    }
}
