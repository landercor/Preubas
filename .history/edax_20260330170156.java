
class edax {

    boolean estaBloqueado = false;
    boolean tieneCuenta = true;
    int[] edadAct = {17, 18, 20, 40, 32, 54, 10, 21, 19, 16, 15, 45, 50, 28, 12};
    boolean esAdmin = true;
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
        double promedio = (double) persona.total / persona.edadAct.length;.promedio = (double) persona.total / persona.edadAct.length;

        System.out.println("\nPromedio de edades: " + persona.promedio);


        /*--
        // Mostrar el conteo de mayores y menores de edad
        System.out.println("Total de personas mayores de edad: " + mayores);

        System.out.println("Total de personas menores de edad: " + menores);
        for (int edadActual : persona.edadAct) {
            if (edadActual < 18) {
                System.out.println(("personas menores de edad acceso denegado: " + edadActual));
            }
        }
    --*/
    /*--

        // Verificar el acceso basado en la edad, cuenta y bloqueo
        if (persona.estaBloqueado) {
            System.out.println("La cuenta esta bloqueada. ");
        } else if (persona.esAdmin) {
            System.err.println("------------------------------");
            System.out.println("El usuario es admin y tiene acceso completo. ");
        }
        System.err.println("------------------------------");
    --*/
        System.err.println("------------------------------");
        
    }


    /*
        if (persona.tieneCuenta) {
            if (persona.edadAct.length >= 20) {
                System.out.println("Usuario encontrado.");
            } else {
                System.out.println("------------------------------");
                System.out.println("Usuario no encontrado.");
            }
            System.out.println("------------------------------");
        }
     */
}
