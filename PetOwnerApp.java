
public class PetOwnerApp {

    public static void main(String[] args) {
        PetOwnerInfo propietario = new PetOwnerInfo(
                "Juan Pérez", "12345", "Buddy", 3, true, "Seguro XYZ", true
        );

        System.out.println(propietario.toString());
    }
}
