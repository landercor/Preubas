
class edades {

    public static void main(String[] args) {
// The lines `int edad = 18;` and `boolean tienenCuenta = true;` are declaring and initializing two variables in Java.

        int edad = 18;
        boolean tienenCuenta = false;
        int[] edades = {18, 17, 20, 40, 32, 54, 10, 21, 19, 16};

        if (edad >= 18 && tienenCuenta) {
            System.out.println("Login exitoso.");
        } else if (edad >= 18) {
            System.out.println("\n Necesitas una cuenta para iniciar sesion.");
        } else {
            System.out.println("Acceso denegado.");
        }
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 18) {
                System.out.println("Mayor de edad: " + edades[i]);
            }
        }
    }
}
