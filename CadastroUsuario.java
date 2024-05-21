import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuario {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ManipuladorDados manipuladorDados;

    public CadastroUsuario(ManipuladorDados manipuladorDados) {
        this.manipuladorDados = manipuladorDados;
    }

    public void criarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o email do usuário:");
        String email = scanner.nextLine();
        while (!email.contains("@")) {
            System.out.println("Email inválido. Por favor, digite um email válido:");
            email = scanner.nextLine();
        }

        System.out.println("Digite o cpf do usuário:");
        String cpf = scanner.nextLine();
        while (cpf.length() != 11) {
            System.out.println("CPF inválido. Por favor, digite um CPF válido com 11 dígitos:");
            cpf = scanner.nextLine();
        }

        System.out.println("Digite o telefone do usuário:");
        String numeroTelefone = scanner.nextLine();
        while (numeroTelefone.length() != 12) {
            System.out.println("Número de telefone inválido. Por favor, digite um número de telefone válido com 12 dígitos:");
            numeroTelefone = scanner.nextLine();
        }

        Orcamento plano = null; 

        System.out.println("Deseja criar um orçamento para este usuário? (S/N)");
        String resposta = scanner.next();
        if (resposta.equalsIgnoreCase("S")) {
            plano = new Orcamento();
            plano.calcularOrcamento();
        }

        Usuario novoUsuario = new Usuario(nome, cpf, email, numeroTelefone, plano);
        usuarios.add(novoUsuario);

        manipuladorDados.salvarUsuario(novoUsuario);

        System.out.println("Usuário criado com sucesso!");
    }

    public void modificarUsuario() {
        Scanner scanner = new Scanner(System.in);
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários para modificar o orçamento.");
            return;
        }

        System.out.println("Lista de usuários:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(i + ". " + usuarios.get(i));
        }

        System.out.println("Digite o número do usuário que deseja modificar:");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        if (indice < 0 || indice >= usuarios.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        Usuario usuarioSelecionado = usuarios.get(indice);
        System.out.println("Usuário selecionado: " + usuarioSelecionado);

        System.out.println("Deseja atualizar o usuário (U) ou o orçamento (O)?");
        String resposta = scanner.next();
        scanner.nextLine(); // Limpar o buffer do scanner
        if (resposta.equalsIgnoreCase("U")) {
            System.out.println("Digite o novo nome do usuário: ");
            String nome = scanner.nextLine();
            usuarioSelecionado.setNome(nome);

            System.out.println("Digite o novo cpf do usuário: ");
            String cpf = scanner.nextLine();
            while (cpf.length() != 11) {
                System.out.println("CPF inválido. Por favor, digite um CPF válido com 11 dígitos:");
                cpf = scanner.nextLine();
            }
            usuarioSelecionado.setCpf(cpf);

            System.out.println("Digite o novo email do usuário: ");
            String email = scanner.nextLine();
            while (!email.contains("@")) {
                System.out.println("Email inválido. Por favor, digite um email válido:");
                email = scanner.nextLine();
            }
            usuarioSelecionado.setEmail(email);

            System.out.println("Digite o novo telefone do usuário: ");
            String numeroTelefone = scanner.nextLine();
            while (numeroTelefone.length() != 12) {
                System.out.println("Número de telefone inválido. Por favor, digite um número de telefone válido com 12 dígitos:");
                numeroTelefone = scanner.nextLine();
            }
            usuarioSelecionado.setNumeroTelefone(numeroTelefone);

            System.out.println("Usuário modificado com sucesso!");
        } else if (resposta.equalsIgnoreCase("O")) {
            Orcamento plano = new Orcamento();
            plano.calcularOrcamento();
            usuarioSelecionado.setPlano(plano);
            System.out.println("Orçamento atualizado com sucesso!");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public void deletarUsuario() {
        Scanner scanner = new Scanner(System.in);
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários para deletar.");
            return;
        }

        System.out.println("Lista de usuários:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(i + ". " + usuarios.get(i));
        }

        System.out.println("Digite o número do usuário que deseja deletar:");
        int indice = scanner.nextInt();

        if (indice < 0 || indice >= usuarios.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        usuarios.remove(indice);
        System.out.println("Usuário deletado com sucesso!");
    }
}
