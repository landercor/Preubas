
class edades {

    int edad = 18;
    boolean tienenCuenta = true;

    public static void main(String[] args) {

        if (edad >= 18 && tienenCuenta) {
            System.out.println("Login exitoso.");
        } else if (edad >= 18) {
            System.out.println("Necesitas una cuenta para iniciar sesión.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
