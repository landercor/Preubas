
class edax {

    int edax = 17;
    boolean tieneCuenta = true;
    boolean estaBloqueado = false;
    boolean esAdmin = false;
    int[] edadAct = {17, 18, 20, 40, 32, 54, 10, 21, 19, 16, 32, 45, 50, 60, 70};
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

        if (persona.estaBloqueado) {
            System.out.println("La cuenta esta bloqueada.");
        } else if (persona.esAdmin) {
            System.out.println("El usuario es admin y tiene acceso completo. " + persona.esAdmin);
        } else if (persona.tieneCuenta) {
            System.out.println("El usuario no esta registrado.");
        } else {
            System.out.println("Usuario logeado.");
        }
    }
}
