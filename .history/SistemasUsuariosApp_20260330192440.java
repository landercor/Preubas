
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SistemasUsuariosApp {

    public static void main(String[] args) {
        ArrayList<Persona> usuarios = new ArrayList<>();
        usuarios.add(new Persona("Juan", 25, true));
        usuarios.add(new Persona("Maria", 17, true));
        usuarios.add(new Persona("Carlos", 30, false));

        int cantidad = sc.nextInt();
        sc.nexLine(); // Consumir el salto de línea después de leer el número

        for (int i = 0; i < cantidad; i++) {
            // Lógica para procesar cada usuario
            System.out.println("\n Procesando usuario " + (i + 1) + ":");
            System.out.println("nombre:");

            System.out.println("Edad:");
            int edad = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después de leer el número

            System.out.println("¿Tiene cuenta? (true/false):");
            boolean tieneCuenta = sc.nextBoolean();
        }
        try (FileWriter writer = new FileWriter("reporte_usuarios.txt")) {
            for (Persona p : usuarios) {
                writer.write(p.validarAcceso());
            }
            System.out.println("Reporte de usuarios generado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al generar el reporte de usuarios.");
        }
    }
}
