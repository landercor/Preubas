
import java.util.ArrayList;
import java.util.Scanner;

public class SystemPetApp {

    public static void main(String[] args) {
        ArrayList<PetOwnerInfo> mascotas = new ArrayList<>();
        mascotas.add(new PetOwnerInfo("Juan Pérez", "12345", "Buddy", 3, true, "Seguro XYZ", true));
        mascotas.add(new PetOwnerInfo("María García", "67890", "Mittens", 1, false, "Seguro ABC", true));
        mascotas.add(new PetOwnerInfo("Carlos López", "54321", "Charlie", 5, true, "Seguro XYZ", false));
        mascotas.add(new PetOwnerInfo("Ana Martínez", "09876", "Luna", 2, true, "Seguro DEF", true));

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Cuantas mascotas desea ingresar? ");
            int cantidad = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            for (int i = 0; i < cantidad; i++) {
                System.out.println("\nProcesando mascota " + (i + 1) + ":");
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                System.out.print("Tiene mascota? (si/no): ");
                String tieneMascotaStr = sc.nextLine();
                boolean tieneMascota = "si".equalsIgnoreCase(tieneMascotaStr);

                mascotas.add(new PetOwnerInfo(nombre, "", "", edad, tieneMascota, "", true));
            }
        }

        // Generar informe una sola vez
        System.out.println("\n=== Informe de mascotas registradas ===");
        for (PetOwnerInfo m : mascotas) {
            System.out.println(m.validarDatos());
        }
        ReportPet.generar(mascotas, "reporte_mascotas");
    }
}
