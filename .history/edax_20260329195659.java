
class edax {

    boolean estaBloqueado = false;
    boolean tieneCuenta = true;
    int total = 0;
    int[] edadAct = {17, 18, 20, 40, 32, 54, 10, 21, 19, 16, 15, 45, 50, 28, 12};
    boolean esAdmin = true;
    double promedio = 0;
    boolean AccesoPermitido = true;

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
        System.err.println("------------------------------");
        for (int edadActual : persona.edadAct) {
            if (edadActual < 18) {
                System.out.println(("personas menores de edad acceso denegado: " + edadActual));
            }
        }

        if (persona.estaBloqueado) {
            System.out.println("La cuenta esta bloqueada. ");
        } else if (persona.esAdmin) {
            System.err.println("------------------------------");
            System.out.println("El usuario es admin y tiene acceso completo. ");
        }
        System.err.println("------------------------------");
        if (persona.tieneCuenta) {
            if (persona.edadAct.length >= 20) {
                System.out.println("Usuario encontrado.");
            } else {
                System.err.println("------------------------------");
                System.out.println("Usuario no encontrado.");
            }
            System.err.println("------------------------------");
        }
        for (int edadActual : persona.edadAct) {
            if (edadActual >= 18) {
                System.out.println("Mayor de edad: " + edadActual);
            }
            edadActual++;
        }
        for (int edadAct : persona.edadAct) {
            if (edadAct >= 18 && perosna.tieneCuenta && !perosna.estaBloqueado) {
                System.out.println("Acceso peromitido con rango de edad: " + edadAct);
            } else {
                System.out.println("Acceso denegado para edad: " + edadAct);
            }
        }

        System.err.println("------------------------------");
        persona.promedio = (double) persona.total / persona.edadAct.length;
        System.out.println("\nPromedio de edades: " + persona.promedio);
    }
}
