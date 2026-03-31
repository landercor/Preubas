
public static void main(String[] args) {
        int edad = 20;
        boolean tienenCuenta = false;

        if (edad >= 18 && tienenCuenta) {
            System.out.println("Login exitoso.");
        } else {
            System.out.println("Acceso denegado. Debes ser mayor de edad y tener una cuenta.");
        }
    }
