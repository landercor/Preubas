
class edadR {

    int edadR = 18;
    boolean tieneCuenta = true;
    boolean estaBloqueado = false;

    public static void main(String[] args) {
        edadR persona = new edadR();
        if (persona.estaBloqueado) {
            System.out.println("La cuenta esta bloqueada");
        } else if (persona.edadR < 18) {
            System.out.println("El usuario es menor de edad");
            {
            }
        } else if (persona.tieneCuenta) {
            System.out.println("Usuario logeado");
        } else {
            System.out.println("Usuario no registrado");
        }
    }
}
