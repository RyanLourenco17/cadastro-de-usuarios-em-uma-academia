import java.util.Scanner;

abstract class Calc{
    public void IMC(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o peso: ");
        float peso = scanner.nextFloat();
        System.out.println("Informe a altura: ");
        float altura = scanner.nextFloat();
        float indice = peso / (altura * altura);
        System.out.println("\n Seu IMC é: "+ indice );
    }
}
