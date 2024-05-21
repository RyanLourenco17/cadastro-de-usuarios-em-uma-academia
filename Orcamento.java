import java.util.Scanner;

public class Orcamento {
    double precoPlanoAnual = 80.00;
    double precoPlanoMensal = 100.00;
    double percentualDanca = 40;
    double percentualPersonal = 65;
    double percentualDefesaP = 50;
    double semAlteracao = 0;
    double precoInicial = 0.00;
    double precoFinal;

    public Orcamento() {}

    public Orcamento(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public void calcularOrcamento() {
        Scanner scanner = new Scanner(System.in);
        Orcamento Valores = new Orcamento();
        Main.clearScreen();

        System.out.println("Escolha do Plano:");
        System.out.println("1. Plano Anual / R$80,00");
        System.out.println("2. Plano Mensal / R$100,00");
        System.out.println("Opção: ");
    
        int opcao = scanner.nextInt();
        double precoInicial = 0.00;
        switch (opcao){
            case 1:
                precoInicial = Valores.precoPlanoAnual;
                break;
            case 2:
                precoInicial = Valores.precoPlanoMensal;
                break;
            default:
                System.out.println("Opção errada");
                return;
        }
        Main.clearScreen();
        System.out.println("Preço do plano escolhido R$"+precoInicial);
    
        System.out.println("Opções de aulas e treinos."+"\n"+
                "-> Dança custa R$40,00 "+"\n"+
                "-> Personal custa R$65,00 "+"\n"+
                "-> Defesa Pessoal custa R$50,00");
        System.out.println("1. Dança");
        System.out.println("2. Personal");
        System.out.println("3. Defesa Pessoal");
        System.out.println("4. Nao escolher nenhum");
        System.out.print("Opção: ");
        int opcao2 = scanner.nextInt();
        switch (opcao2){
            case 1:
                precoInicial += Valores.percentualDanca ;
                break;
            case 2:
                precoInicial += Valores.percentualPersonal;
                break;
            case 3:
                precoInicial += Valores.percentualDefesaP;
                break;
            case 4:
                precoInicial += Valores.semAlteracao;
                break;
            default:
                System.out.println(precoInicial);
                return;
        }
    
        precoFinal = precoInicial;
    
        System.out.println("O valor da sua mensalidade ficou por R$" + precoInicial);
        Main.clearScreen();
    } 
    
    @Override
    public String toString() {
        return "Preço final do orçamento: R$" + precoFinal;
    }
}

