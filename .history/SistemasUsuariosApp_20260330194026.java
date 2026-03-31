
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemasUsuariosApp {

    public static void main(String[] args) {
        ArrayList<Persona> usuarios = new ArrayList<>();
        usuarios.add(new Persona("Juan", 25, true));
        usuarios.add(new Persona("Maria", 17, true));
        usuarios.add(new Persona("Carlos", 30, false));

        try (Scanner sc = new Scanner(System.in)) {
            int cantidad = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después de leer el número

            for (int i = 0; i < cantidad; i++) {
                // Lógica para procesar cada usuario
                System.out.println("\n Procesando usuario " + (i + 1) + ":");
                System.out.println("nombre:");
                String nombre = sc.nextLine();

                System.out.println("Edad:");
                int edad = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea después de leer el número

                System.out.println("¿Tiene cuenta? (true/false):");
                boolean tieneCuenta = sc.nextBoolean();

                usuarios.add(new Persona(nombre, edad, tieneCuenta));

            }
            // Generar reporte de usuarios
            System.out.println("\n Generando reporte de usuarios...");
            for (Persona p : usuarios) {
                System.out.println(p.validarAcceso() + "\n");
            }
        }

        // Guardar el reporte en un archivo de texto
        try (FileWriter writer = new FileWriter("reporte_usuarios.txt")) {
            for (Persona p : usuarios) {
                writer.write(p.validarAcceso() + "\n");
            }
            System.out.println("Reporte de usuarios generado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al generar el reporte de usuarios." + e.getMessage());
        }
    }

}
