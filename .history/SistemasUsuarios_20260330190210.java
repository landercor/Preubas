
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;

public class SistemasUsuarios {

    public static void main(String[] args) {
        ArrayList<Persona> usuarios = new ArrayList<>();
        usuarios.add(new Persona("Juan", 25, true, false));
        usuarios.add(new Persona("Maria", 17, true, false));
        usuarios.add(new Persona("Carlos", 30, false, true));

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
