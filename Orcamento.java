import java.util.Scanner;

public class Orcamento {
    //preço dos produtos principais
    double precoPlanoAnual = 80.00;
    double precoPlanoMensal = 100.00;
    //Percentuais de alteração dos subprodutos
    double percentualDanca = 40;
    double percentualPersonal = 65;
    double percentualDefesaP = 50;
    double semAlteracao = 0;
    double precoInicial = 0.00;
    double precoFinal;


    public void calcularOrcamento() {
        Scanner scanner = new Scanner(System.in);
        // instanciar
        Orcamento Valores = new Orcamento();
        // Pronto. Só tinha que instanciar e chamar no local preferível.
        Main main = new Main();
    
        // Exibir opções de produtos principais
        System.out.println("Escolha do Plano:");
        System.out.println("1. Plano Anual / R$80,00");
        System.out.println("2. Plano Mensal / R$100,00");
        System.out.println("Opção: ");
    
        //case switch
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
        main.clearScreen();
        System.out.println("Preço do plano escolhido R$"+precoInicial);
    
    
        //exibir subprodutos
        System.out.println("Opções de aulas e treinos."+ 
        "-> Dança custa R$40,00 "+
        "-> Personal custa R$65,00 "+
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
    
        // Atribuição do preço final ao atributo precoFinal
        precoFinal = precoInicial;
    
        System.out.println("O valor da sua mensalidade ficou por R$" + precoInicial);
    } 
    
    @Override
    public String toString() {
        // Retornar uma representação legível do orçamento
        return "Preço final do orçamento: R$" + precoFinal;
    }
}
