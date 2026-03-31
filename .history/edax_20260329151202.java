
class edax {

    int edax = 17;
    boolean tieneCuenta = true;
    boolean estaBloqueado = false;
    boolean esAdmin = true;

    public static void main(String[] args) {

        edax persona = new edax();

        if (persona.edax < 18) {
            System.out.println("El usuario es menor de edad.");
        } else if (persona.tieneCuenta) {
            System.out.println("Usuario logeado.");
        } else if (persona.estaBloqueado) {
            System.out.println("La cuenta esta bloqueada.");
        } else {
            System.out.println("Usuario no registrado.");
        }
        System.out.println("El usuario es admin: " + persona.esAdmin);
    }
}
