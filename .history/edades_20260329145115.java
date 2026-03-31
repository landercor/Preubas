
class edades {

    public static void main(String[] args) {
// The lines `int edad = 18;` and `boolean tienenCuenta = true;` are declaring and initializing two variables in Java.

        int edad = 17;
        boolean tienenCuenta = true;

        if (edad >= 18 && tienenCuenta) {
            System.out.println("Login exitoso.");
        } else if (edad >= 18) {
            System.out.println("Necesitas una cuenta para iniciar sesión.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
