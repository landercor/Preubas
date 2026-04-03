
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportPet {

    public static void generar(List<PetOwnerInfo> mascotas, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo + ".txt")) {
            writer.write("=== Reporte de Mascotas ===\n");
            for (PetOwnerInfo m : mascotas) {
                writer.write(m.toString() + " -> " + m.validarDatos() + "\n");
            }
            System.out.println("Reporte generado en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al generar el reporte en " + nombreArchivo + ".txt: " + e.getMessage());
        }
    }
}
