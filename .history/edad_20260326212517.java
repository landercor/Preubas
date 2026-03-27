
class edad {

    public static void main(String[] args) {
    }

    public static String verificarEdad(int edad) {

        if (edad < 18) {
            return "menor de edad";
        } else if (edad < 60) {
            return "Eres adulto";
        } else {
            return "Eres adulto mayor";
        }

    }
}
