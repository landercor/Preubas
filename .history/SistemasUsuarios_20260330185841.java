
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;

public class SistemasUsuarios {

    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan", 25, true, false));
        usuarios.add(new Usuario("Maria", 17, true, false));
        usuarios.add(new Usuario("Carlos", 30, false, true));

        try {
            FileWriter writer = new FileWriter("reporte_usuarios.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Usuario usuario : usuarios) {
                bufferedWriter.write(usuario.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
