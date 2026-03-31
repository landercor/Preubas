
class edax {

    boolean estaBloqueado = false;
    boolean tieneCuenta = true;
    int total = 0;
    int[] edadAct = {17, 18, 20, 40, 32, 54, 10, 21, 19, 16, 15, 45, 50, 28, 12};
    boolean esAdmin = false;
    double promedio = 0;

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
        for (int edadActual : persona.edadAct) {
            if (edadActual < 18) {
                System.out.println(("personas menores de edad acceso denegado: " + edadActual));
            }
        }

        persona.promedio = (double) persona.total / persona.edadAct.length;
        System.out.println("\nPromedio de edades: " + persona.promedio);

        if (persona.estaBloqueado) {
            System.out.println("La cuenta esta bloqueada.");
        } else if (persona.esAdmin) {
            System.out.println("El usuario es admin y tiene acceso completo. " + persona.esAdmin);
        } else if (persona.tieneCuenta) {
            if (persona.edadAct.length > 20) {
                System.out.println("Usuario encontrado.");
            }
        }
    }
}
