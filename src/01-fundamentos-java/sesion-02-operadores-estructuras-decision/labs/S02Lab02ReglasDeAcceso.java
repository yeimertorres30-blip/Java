public class S02Lab02ReglasDeAcceso {
    public static void main(String[] args) {
        int edad = 18;
        boolean esMiembro = false;
        boolean tieneInvitacion = true;
        boolean bloqueado = false;

        // TODO 1: Escribir la regla de acceso en lenguaje natural.
        // Puede entrar si tiene al menos 18 años, es miembro o tiene invitación y no está bloqueado.
        // TODO 2: Construir puedeEntrar combinando edad, membresía, invitación y bloqueo.
        boolean puedeEntrar = !bloqueado && ((edad >= 18 && esMiembro) || tieneInvitacion);
        // TODO 3: Mostrar "Acceso permitido" o "Acceso denegado" con if/else.
        if (puedeEntrar) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        // TODO 4: Probar los tres casos mínimos del README; las otras combinaciones son opcionales.
        System.out.println("Caso 1");
        int edad2 = 18;
        boolean esMiembro2 = false;
        boolean tieneInvitacion2 = true;
        boolean bloqueado2 = false;
        boolean puedeEntrar2 = !bloqueado2 && ((edad2 >= 18 && esMiembro2) || tieneInvitacion2);
        if (puedeEntrar2) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        System.out.println("Caso2");
        int edad3 = 17;
        boolean esMiembro3 = true;
        boolean tieneInvitacion3 = false;
        boolean bloqueado3 = false;

        boolean puedeEntrar3 = edad3 >= 18 && (esMiembro3 || tieneInvitacion3) && !bloqueado3;

        if (puedeEntrar3) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        System.out.println("Caso3");
        int edad4 = 25;
        boolean esMiembro4 = true;
        boolean tieneInvitacion4 = true;
        boolean bloqueado4 = true;

        boolean puedeEntrar4 = edad4 >= 18 && (esMiembro4 || tieneInvitacion4) && !bloqueado4;

        if (puedeEntrar4) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        // TODO 5: Explicar por qué el bloqueo impide siempre el acceso.
        // si bloqueado es true, !bloqueado es false. Como usamos &&, la condición completa será false.
        // TODO 6 (opcional): Colocar un breakpoint en if y observar puedeEntrar antes de elegir la rama.
    }
}
