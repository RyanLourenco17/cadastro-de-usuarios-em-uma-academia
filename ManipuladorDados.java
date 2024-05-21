import java.io.*;
import java.util.ArrayList;

public class ManipuladorDados {
    private static final String FILE_NAME = "usuarios.txt";

    // Salvar um usuário no arquivo
    public void salvarUsuario(Usuario usuario) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(usuario);
        } catch (IOException e) {
            System.out.println("Erro ao salvar usuário: " + e.getMessage());
        }
    }
}



