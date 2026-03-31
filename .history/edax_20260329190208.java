
class edax {

    int edax = 17;
    boolean tieneCuenta = true;
    boolean estaBloqueado = false;
    boolean esAdmin = false;
    boolean esMayorDeEdad = edax >= 18;

    public static void main(String[] args) {

        edax persona = new edax();

        for (int persona.edadAct:
        edax
            
        ) {
            
        
            if (persona.edadAct >= 18) {
                System.out.println("Mayor de edad: " + persona.edadAct);
            } else {
                System.out.println("Menor de edad: " + persona.edadAct);
            }
        }

        if (persona.estaBloqueado) {
            System.out.println("La cuenta esta bloqueada.");
        } else if (persona.esAdmin) {
            System.out.println("El usuario es admin y tiene acceso completo. " + persona.esAdmin);
        } else if (persona.edax < 18) {
            System.out.println("El usuario es menor de edad.");
        } else if (persona.tieneCuenta) {
            System.out.println("El usuario no esta registrado.");
        } else {
            System.out.println("Usuario logeado.");
        }
    }
}
