
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReporteUsuarios {

    public static void generar(List<Persona> usuarios, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            for (Persona p : usuarios) {
                writer.write(p.validarAcceso() + "\n");
            }
            System.out.println("Reporte generado en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al generar el reporte: " + e.getMessage());
        }
    }
}
