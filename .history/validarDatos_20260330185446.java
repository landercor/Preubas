
public class validarDatos {

    //agregando datos para validar el acceso a una cuenta, verificando la edad, si tiene cuenta y si esta bloqueada
    public static void main(String[] args) {
        int edad = 20;
        boolean tienenCuenta = true;

        if (edad >= 18 && tienenCuenta) {
            System.out.println("Login exitoso.");
        } else {
            System.out.println("Acceso denegado. Debes ser mayor de edad y tener una cuenta.");
        }
    }
}
