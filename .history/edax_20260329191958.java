
class edax {

    boolean tieneCuenta = true;
    boolean estaBloqueado = false;
    boolean esAdmin = false;
    int[] edadAct = {17, 18, 20, 40, 32, 54, 10, 21, 19, 16, 15, 45, 5, 8, 12};
    int total = 0;

    public static void main(String[] args) {

        edax persona = new edax();
        for (int edadActual : persona.edadAct) {

            if (edadActual >= 18) {
                System.out.println("Mayor de edad: " + edadActual);
            } else {
                System.out.println("Menor de edad: " + edadActual);
            }
            persona.total += edadActual;
        }
        persona.total = persona.total + persona.edadAct.length;
        System.out.println("\nEl total de edades es: " + persona.total);

        if (persona.estaBloqueado) {
            System.out.println("La cuenta esta bloqueada.");
        } else if (persona.esAdmin) {
            System.out.println("El usuario es admin y tiene acceso completo. " + persona.esAdmin);
        } else if (persona.tieneCuenta) {
            System.out.println("Los usuarios que no estan registrados.");
        } else {
            System.out.println("Usuario logeado.");
        }
        for (int edadActual : persona.edadAct) {
            if (edadActual < 18) {
                System.out.println(("personas menores de edad acceso denegado: " + edadActual));
            }
        }
    }
}
