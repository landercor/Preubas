
class edax {

    boolean estaBloqueado = false;
    boolean tieneCuenta = true;
    int[] edadAct = {17, 18, 20, 40, 32, 54, 10, 21, 19, 16, 15, 45, 50, 28, 12};
    boolean esAdmin = false;
    int total = 0;
    double promedio = 0;

    public static void main(String[] args) {

        edax persona = new edax();

        int mayores = 0;
        int menores = 0;

        for (int edadActual : persona.edadAct) {

            // Verificar si la persona es mayor de edad
            if (edadActual >= 18) {
                System.out.println("Mayor de edad: " + edadActual);
                mayores++;
            } else {
                System.out.println("Menor de edad: " + edadActual);
                menores++;
            }

        }

        // Verificar el acceso basado en la edad, cuenta y bloqueo para cada edad
        System.out.println("------------------------------");

        for (int edadActual : persona.edadAct) {
            if (edadActual >= 18 && persona.tieneCuenta && !persona.estaBloqueado) {
                System.out.println("Acceso peromitido con rango de edad: " + edadActual);
            } else {
                System.out.println("Acceso denegado para rango de edad: " + edadActual);
            }
            persona.total += edadActual;
        }
        System.out.println("------------------------------");
        persona.promedio = (double) persona.total / persona.edadAct.length;

        System.out.println("mayores de edad: " + mayores);
        System.out.println("menores de edad: " + menores);
        System.out.println("Promedio de edades: " + persona.promedio);

        System.out.println("------------------------------");

        // Logica global
        // Verificar el acceso basado en la edad, cuenta y bloqueo
        if (persona.estaBloqueado) {
            System.out.println("La cuenta esta bloqueada. ");
        } else if (persona.esAdmin) {
            System.err.println("------------------------------");
            System.out.println("El usuario es admin y tiene acceso completo. ");
        } else if (persona.edadAct.length >= 12 && persona.edadAct.length <= 17) {
            System.out.println("personas menores de edad acceso denegado: " + persona.edadAct.length);
        } else if (persona.edadAct.length >= 20) {
            System.out.println("Usuario encontrado.");
        } else {
            System.out.println("Usuario no encontrado.");
        }

        if (persona.tieneCuenta) {
            if (persona.edadAct.length >= 12 || persona.edadAct.length <= 17) {
                System.out.println("Usuario no encontrado.");
            } else {
                System.out.println("------------------------------");
                System.out.println("Usuario no encontrado.");

            }
        }

        // Verificar si la persona tiene cuenta
        if (persona.tieneCuenta) {
            if (persona.edadAct.length >= 20) {
                System.out.println("Usuario encontrado.");
            } else {
                System.out.println("------------------------------");
                System.out.println("Usuario no encontrado.");
            }
            System.out.println("------------------------------");
        }
    }
}
