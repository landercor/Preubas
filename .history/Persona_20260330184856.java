
class Persona {

    private String nombre;
    private int edad;
    private boolean tieneCuenta;

    // Constructor
    public Persona(String nombre, int edad, boolean tieneCuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.tieneCuenta = tieneCuenta;

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean istieneCuenta() {
        return tieneCuenta;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTienecuenta(boolean tieneCuenta) {
        this.tieneCuenta = tieneCuenta;
    }

    public String validarAcceso() {
        if (!tieneCuenta) {
            return "Usuario " + nombre + "sin cuenta, por favor regístrate.";
        } else if (edad < 18) {
            return "Usuario " + nombre + "no tiene la edad suficiente para acceder.";
        } else {
            return "Acceso  " + nombre + " con acceso permitido.";
        }
    }
}
