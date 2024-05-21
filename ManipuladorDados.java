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
    public static void ExibirUsuario() {
        try (FileReader arquivo = new FileReader(FILE_NAME);
             BufferedReader abrir = new BufferedReader(arquivo)) {
            String linha;
            while ((linha = abrir.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao abrir arquivo: " + e.getMessage());
        }
    }
}