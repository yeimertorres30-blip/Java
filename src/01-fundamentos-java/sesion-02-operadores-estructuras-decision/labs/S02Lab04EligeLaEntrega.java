public class S02Lab04EligeLaEntrega {
    public static void main(String[] args) {
        String tipoEntrega = "EXPRESS";

        // TODO 1: Resolver ESTANDAR=500, EXPRESS=1200 y RECOGIDA=0 centavos con switch.
        int costo = -1;

        switch (tipoEntrega) {
            case "ESTANDAR":
                costo = 500;
                break;
            case "EXPRESS":
                costo = 1200;
                break;
            case "RECOGIDA":
                costo = 0;
                break;
        // TODO 2: Manejar default como opción inválida; no mostrar un costo válido.
            default:
                costo = -1;
                break;
        }
        // TODO 3: En opciones válidas mostrar "Costo (centavos): " con el valor.
        if (costo != -1) {
            System.out.println("Costo (centavos): " + costo);
        }
        // TODO 4: Usar un ternario para elegir "Retiro en tienda" o "Entrega a domicilio".
        String etiqueta = tipoEntrega.equals("RECOGIDA")
                ? "Retiro en tienda"
                : "Entrega a domicilio";
        // TODO 5: Mostrar la etiqueta con "Etiqueta: "; para invalidos mostrar solo
        // "Tipo de entrega invalido".
        if (costo != -1) {
            System.out.println("Etiqueta: " + etiqueta);
        } else {
            System.out.println("Tipo de entrega invalido");
        }
        // TODO 6: Probar los tres tipos y DRON; opcionalmente comparar switch clásico y moderno
        // en tu copia personal. Entregar una versión y explicar break y las flechas.
        System.out.println("Prueba 1: ESTANDAR");
        tipoEntrega = "ESTANDAR";
        int costoPrueba = -1;

        switch (tipoEntrega) {
            case "ESTANDAR":
                costoPrueba = 500;
                break;
            case "EXPRESS":
                costoPrueba = 1200;
                break;
            case "RECOGIDA":
                costoPrueba = 0;
                break;
            default:
                costoPrueba = -1;
                break;
        }

        if (costoPrueba != -1) {
            System.out.println("Costo (centavos): " + costoPrueba);
            String etiquetaPrueba = tipoEntrega.equals("RECOGIDA")
                    ? "Retiro en tienda" : "Entrega a domicilio";
            System.out.println("Etiqueta: " + etiquetaPrueba);
        } else {
            System.out.println("Tipo de entrega invalido");
        }
        System.out.println("Prueba 2: EXPRESS");
        tipoEntrega = "EXPRESS";
        costoPrueba = -1;

        switch (tipoEntrega) {
            case "ESTANDAR":
                costoPrueba = 500;
                break;
            case "EXPRESS":
                costoPrueba = 1200;
                break;
            case "RECOGIDA":
                costoPrueba = 0;
                break;
            default:
                costoPrueba = -1;
                break;
        }

        if (costoPrueba != -1) {
            System.out.println("Costo (centavos): " + costoPrueba);
            String etiquetaPrueba = tipoEntrega.equals("RECOGIDA")
                    ? "Retiro en tienda" : "Entrega a domicilio";
            System.out.println("Etiqueta: " + etiquetaPrueba);
        } else {
            System.out.println("Tipo de entrega invalido");
        }
        System.out.println("Prueba 3: RECOGIDA");
        tipoEntrega = "RECOGIDA";
        costoPrueba = -1;

        switch (tipoEntrega) {
            case "ESTANDAR":
                costoPrueba = 500;
                break;
            case "EXPRESS":
                costoPrueba = 1200;
                break;
            case "RECOGIDA":
                costoPrueba = 0;
                break;
            default:
                costoPrueba = -1;
                break;
        }

        if (costoPrueba != -1) {
            System.out.println("Costo (centavos): " + costoPrueba);
            String etiquetaPrueba = tipoEntrega.equals("RECOGIDA")
                    ? "Retiro en tienda" : "Entrega a domicilio";
            System.out.println("Etiqueta: " + etiquetaPrueba);
        } else {
            System.out.println("Tipo de entrega invalido");
        }
        System.out.println("Prueba 4: DRON");
        tipoEntrega = "DRON";
        costoPrueba = -1;

        switch (tipoEntrega) {
            case "ESTANDAR":
                costoPrueba = 500;
                break;
            case "EXPRESS":
                costoPrueba = 1200;
                break;
            case "RECOGIDA":
                costoPrueba = 0;
                break;
            default:
                costoPrueba = -1;
                break;
        }

        if (costoPrueba != -1) {
            System.out.println("Costo (centavos): " + costoPrueba);
            String etiquetaPrueba = tipoEntrega.equals("RECOGIDA")
                    ? "Retiro en tienda" : "Entrega a domicilio";
            System.out.println("Etiqueta: " + etiquetaPrueba);
        } else {
            System.out.println("Tipo de entrega invalido");
        }

    }
}
