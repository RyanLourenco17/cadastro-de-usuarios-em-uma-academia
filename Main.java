import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManipuladorDados manipularDados = new ManipuladorDados();
        CadastroUsuario cadastroUsuario = new CadastroUsuario(manipularDados);
        // ArrayList<Usuario> usuarios = manipularDados.recuperarUsuarios();
        
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar usuário");
            System.out.println("2. Modificar usuário");
            System.out.println("3. Deletar usuário");
            System.out.println("4. Salvar dados");
            System.out.println("5. Recuperar dados");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    clearScreen();
                    cadastroUsuario.criarUsuario();
                    break;
                case 2:
                    clearScreen();
                    cadastroUsuario.modificarUsuario();
                    break;
                case 3:
                    clearScreen();
                    cadastroUsuario.deletarUsuario();
                    break;
                // case 4:
                //     clearScreen();
                //     manipularDados.salvarUsuarios(usuarios);
                //     break;
                // case 5:
                //     clearScreen();
                //     usuarios = manipularDados.recuperarUsuarios();
                //     break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
    
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }
    }
}