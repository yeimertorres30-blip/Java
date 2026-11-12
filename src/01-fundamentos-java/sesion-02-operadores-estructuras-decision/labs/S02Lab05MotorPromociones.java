public class S02Lab05MotorPromociones {
    public static void main(String[] args) {
        long subtotalCentavos = 18_500;
        int cantidad = 4;
        boolean esMiembro = true;
        String tipoEntrega = "EXPRESS";

        // TODO 1: Predecir los resultados antes de programar.
        // Subtotal: 18500
        // Descuento: 1850 (10%)
        // Neto: 16650
        // Envio: 1200
        // Total: 17850

        // TODO 2: Validar subtotal y cantidad.
        if (subtotalCentavos < 0 || subtotalCentavos > 1_000_000 || cantidad <= 0) {
            System.out.println("Error: El subtotal debe estar entre 0 y 1,000,000 y la cantidad debe ser mayor a cero.");
            return;
        }

            // TODO 3: Elegir el costo de envio y rechazar tipos desconocidos.
        if (!tipoEntrega.equals("ESTANDAR") && !tipoEntrega.equals("EXPRESS")) {
            System.out.println("Error: Tipo de entrega desconocido. Solo se permite ESTANDAR o EXPRESS.");
            return;
        }

                // TODO 4: Determinar el porcentaje de descuento.
        double porcentajeDescuento = 0.0;
        if (esMiembro && subtotalCentavos >= 20_000) {
            porcentajeDescuento = 0.10;
        } else if (esMiembro || cantidad >= 3) {
            porcentajeDescuento = 0.05;
        } else {
            porcentajeDescuento = 0.0;
        }

                // TODO 5: Calcular descuento y neto en centavos.
        long descuentoCentavos = (long) (subtotalCentavos * porcentajeDescuento);
        long netoCentavos = subtotalCentavos - descuentoCentavos;

                // TODO 6: Aplicar envio gratis solo a ESTANDAR
                // cuando el neto sea de al menos 25000 centavos.
        long envioCentavos = 0;
        switch (tipoEntrega) {
            case "ESTANDAR":
                envioCentavos = 5_000;
                break;
            case "EXPRESS":
                envioCentavos = 12_000;
                break;
            default:
                envioCentavos = 0;
                break;
        }

        if (tipoEntrega.equals("ESTANDAR") && netoCentavos >= 25_000) {
            envioCentavos = 0;
        }

        long totalCentavos = netoCentavos + envioCentavos;

                // TODO 7: Mostrar el desglose con las etiquetas requeridas.
        System.out.println("       DESGLOSE DE LA COMPRA            ");
        System.out.println("Subtotal: $" + (subtotalCentavos / 100.0));
        System.out.println("Descuento: -$" + (descuentoCentavos / 100.0));
        System.out.println("Importe Neto: $" + (netoCentavos / 100.0));
        System.out.println("Costo de Envío: $" + (envioCentavos / 100.0));
        System.out.println("Total a Pagar: $" + (totalCentavos / 100.0));

        // TODO 8: Probar los cinco casos mínimos del README; registrar resultados.
        System.out.println("Prueba 1: EXPRESS");
        long subtotal2 = 18500;
        int cantidad2 = 4;
        boolean miembro2 = true;
        String entrega2 = "EXPRESS";

        boolean datosValidos2 = subtotal2 >= 0
                && subtotal2 <= 1_000_000 && cantidad2 > 0;

        if (!datosValidos2) {
            System.out.println("Pedido invalido: subtotal o cantidad fuera de rango");
        } else {
            long envio2;

            switch (entrega2) {
                case "ESTANDAR": envio2 = 500; break;
                case "EXPRESS": envio2 = 1200; break;
                case "RECOGIDA": envio2 = 0; break;
                default: envio2 = -1; break;
            }

            if (envio2 < 0) {
                System.out.println("Pedido invalido: tipo de entrega desconocido");
            } else {
                int porcentaje2;
                if (miembro2 && subtotal2 >= 10_000) {
                    porcentaje2 = 10;
                } else if (!miembro2 && subtotal2 >= 20_000) {
                    porcentaje2 = 5;
                } else {
                    porcentaje2 = 0;
                }

                long descuento2 = subtotal2 * porcentaje2 / 100;
                long neto2 = subtotal2 - descuento2;
                if (entrega2.equals("ESTANDAR") && neto2 >= 25_000) {
                    envio2 = 0;
                }
                long total2 = neto2 + envio2;

                System.out.println("Subtotal (centavos): " + subtotal2);
                System.out.println("Descuento (%): " + porcentaje2);
                System.out.println("Descuento (centavos): " + descuento2);
                System.out.println("Neto (centavos): " + neto2);
                System.out.println("Envio (centavos): " + envio2);
                System.out.println("Total (centavos): " + total2);
            }
        }
        System.out.println("Prueba 2: ESTANDAR, neto 24999");
        long subtotal3 = 26314;
        int cantidad3 = 1;
        boolean miembro3 = false;
        String entrega3 = "ESTANDAR";

        boolean datosValidos3 = subtotal3 >= 0
                && subtotal3 <= 1_000_000 && cantidad3 > 0;

        if (!datosValidos3) {
            System.out.println("Pedido invalido: subtotal o cantidad fuera de rango");
        } else {
            long envio3;
            switch (entrega3) {
                case "ESTANDAR": envio3 = 500; break;
                case "EXPRESS": envio3 = 1200; break;
                case "RECOGIDA": envio3 = 0; break;
                default: envio3 = -1; break;
            }

            if (envio3 < 0) {
                System.out.println("Pedido invalido: tipo de entrega desconocido");
            } else {
                int porcentaje3;
                if (miembro3 && subtotal3 >= 10_000) {
                    porcentaje3 = 10;
                } else if (!miembro3 && subtotal3 >= 20_000) {
                    porcentaje3 = 5;
                } else {
                    porcentaje3 = 0;
                }

                long descuento3 = subtotal3 * porcentaje3 / 100;
                long neto3 = subtotal3 - descuento3;
                if (entrega3.equals("ESTANDAR") && neto3 >= 25_000) {
                    envio3 = 0;
                }
                long total3 = neto3 + envio3;

                System.out.println("Subtotal (centavos): " + subtotal3);
                System.out.println("Descuento (%): " + porcentaje3);
                System.out.println("Descuento (centavos): " + descuento3);
                System.out.println("Neto (centavos): " + neto3);
                System.out.println("Envio (centavos): " + envio3);
                System.out.println("Total (centavos): " + total3);
            }
        }
        System.out.println("Prueba 3: ESTANDAR, neto 25000");
        long subtotal4 = 26315;
        int cantidad4 = 1;
        boolean miembro4 = false;
        String entrega4 = "ESTANDAR";

        boolean datosValidos4 = subtotal4 >= 0
                && subtotal4 <= 1_000_000 && cantidad4 > 0;

        if (!datosValidos4) {
            System.out.println("Pedido invalido: subtotal o cantidad fuera de rango");
        } else {
            long envio4;
            switch (entrega4) {
                case "ESTANDAR": envio4 = 500; break;
                case "EXPRESS": envio4 = 1200; break;
                case "RECOGIDA": envio4 = 0; break;
                default: envio4 = -1; break;
            }

            if (envio4 < 0) {
                System.out.println("Pedido invalido: tipo de entrega desconocido");
            } else {
                int porcentaje4;
                if (miembro4 && subtotal4 >= 10_000) {
                    porcentaje4 = 10;
                } else if (!miembro4 && subtotal4 >= 20_000) {
                    porcentaje4 = 5;
                } else {
                    porcentaje4 = 0;
                }

                long descuento4 = subtotal4 * porcentaje4 / 100;
                long neto4 = subtotal4 - descuento4;
                if (entrega4.equals("ESTANDAR") && neto4 >= 25_000) {
                    envio4 = 0;
                }
                long total4 = neto4 + envio4;

                System.out.println("Subtotal (centavos): " + subtotal4);
                System.out.println("Descuento (%): " + porcentaje4);
                System.out.println("Descuento (centavos): " + descuento4);
                System.out.println("Neto (centavos): " + neto4);
                System.out.println("Envio (centavos): " + envio4);
                System.out.println("Total (centavos): " + total4);
            }
        }
        System.out.println("Prueba 4: cantidad cero");
        long subtotal5 = 18500;
        int cantidad5 = 0;
        boolean miembro5 = true;
        String entrega5 = "EXPRESS";

        boolean datosValidos5 = subtotal5 >= 0
                && subtotal5 <= 1_000_000 && cantidad5 > 0;

        if (!datosValidos5) {
            System.out.println("Pedido invalido: subtotal o cantidad fuera de rango");
        } else {
            System.out.println("Los datos son validos");
        }
        System.out.println("Prueba 5: DRON");
        long subtotal6 = 18500;
        int cantidad6 = 4;
        boolean miembro6 = true;
        String entrega6 = "DRON";

        boolean datosValidos6 = subtotal6 >= 0
                && subtotal6 <= 1_000_000 && cantidad6 > 0;

        if (!datosValidos6) {
            System.out.println("Pedido invalido: subtotal o cantidad fuera de rango");
        } else {
            long envio6;
            switch (entrega6) {
                case "ESTANDAR": envio6 = 500; break;
                case "EXPRESS": envio6 = 1200; break;
                case "RECOGIDA": envio6 = 0; break;
                default: envio6 = -1; break;
            }

            if (envio6 < 0) {
                System.out.println("Pedido invalido: tipo de entrega desconocido");
            } else {
                System.out.println("La entrega es valida");
            }
        }
        // TODO 9 (opcional): Inspeccionar con Debug descuentoCentavos, netoCentavos y envioCentavos.

        // TODO 10: Mejorar nombres y repetir las pruebas sin alterar las reglas.
        System.out.println("Subtotal: " + subtotalCentavos);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Es miembro: " + esMiembro);
        System.out.println("Tipo de entrega: " + tipoEntrega);
    }
}
