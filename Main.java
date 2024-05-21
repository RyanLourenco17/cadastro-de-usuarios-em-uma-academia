import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManipuladorDados manipularDados = new ManipuladorDados();
        CadastroUsuario cadastroUsuario = new CadastroUsuario(manipularDados);
        Calc calculadoraIMC = new Calc();

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Modificar Cliente");
            System.out.println("3. Deletar Cliente");
            System.out.println("4. Calcular IMC");
            System.out.println("5. Exibir Dados");
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
                case 4:
                    clearScreen();
                    calculadoraIMC.calcularIMC();
                    break;
                case 5:
                    clearScreen();
                    ManipuladorDados.ExibirUsuario();
                    break;
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

