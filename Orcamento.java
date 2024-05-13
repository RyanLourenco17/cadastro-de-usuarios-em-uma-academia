import java.util.Scanner;

public class Orcamento {
    private double precoPlanoAnual = 80.00;
    private double precoPlanoMensal = 100.00;
    private double percentualDanca = 0.25;
    private double percentualPersonal = 0.55;
    private double percentualDefesaP = 0.40;
    private double precoFinal;

    public void calcularOrcamento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o produto:");
        System.out.println("1. Plano Anual / R$80,00");
        System.out.println("2. Plano Mensal / R$100,00");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        double precoInicial = 0.00;
        switch (opcao) {
            case 1:
                precoInicial = precoPlanoAnual;
                break;
            case 2:
                precoInicial = precoPlanoMensal;
                break;
            default:
                System.out.println("Opção errada");
                return;
        }

        System.out.println(precoInicial);

        System.out.println("1. Dança / 25% do valor inicial");
        System.out.println("2. Personal / 55% do valor inicial");
        System.out.println("3. Defesa Pessoal / 40% do valor inicial");
        System.out.println("4. Nao escolher nenhum");
        System.out.print("Opção: ");
        int opcao2 = scanner.nextInt();
        switch (opcao2) {
            case 1:
                precoInicial += (precoInicial *= percentualDanca);
                break;
            case 2:
                precoInicial += (precoInicial *= percentualPersonal);
                break;
            case 3:
                precoInicial += (precoInicial *= percentualDefesaP);
            case 4:
                precoInicial += 0;
            default:
                System.out.println(precoInicial);
                return;
        }

        // Atribuir o preço final calculado
        precoFinal = precoInicial;
        
        System.out.println("R$" + precoInicial);

    }
    @Override
    public String toString() {
        // Retornar uma representação legível do orçamento
        return "Preço final do orçamento: R$" + precoFinal;
    }
}
