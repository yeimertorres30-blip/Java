public class S05Lab02MedidasRectangulo {
    public static void main(String[] args) {
        // TODO 6: Crear primeraFigura de 5 por 3 y segundaFigura de 4 por 4.
        S05Rectangulo primera_figura = new S05Rectangulo(5.0, 3.0);
        S05Rectangulo segunda_figura = new S05Rectangulo(4.0, 4.0);
        // TODO 7: Mostrar area, perimetro y esCuadrado de cada figura.
        System.out.println("Primera figura (5x3)");
        System.out.println("Area: " + primera_figura.calcularArea());
        System.out.println("Perimetro: " + primera_figura.calcularPerimetro());
        System.out.println("¿Es cuadrado?: " + primera_figura.esCuadrado());
        System.out.println("Segunda figura (4x4)");
        System.out.println("Area: " + segunda_figura.calcularArea());
        System.out.println("Perimetro: " + segunda_figura.calcularPerimetro());
        System.out.println("¿Es cuadrado?: " + segunda_figura.esCuadrado());
    }
}
