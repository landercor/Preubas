
class edax {

    int edax = 17;
    boolean tieneCuenta = true;
    boolean estaBloqueado = false;
    boolean esAdmin = true;

    public static void main(String[] args) {

        edax persona = new edax();

        if (persona.estaBloqueado) {
            System.out.println("La cuenta esta bloqueada.");
        } else if (persona.esAdmin) {
            System.out.println("El usuario es admin y tiene acceso completo. " + persona.esAdmin);
        } else if (persona.tieneCuenta) {
            System.out.println("El usuario no esta registrado.");
        } else if (persona.edax < 18) {
            System.out.println("El usuario es menor de edad.");
        } else {
            System.out.println("Usuario logeado.");
        }
    }
}
