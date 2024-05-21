import java.util.Scanner;

abstract class CalcularIMC {
    public abstract void calcularIMC();
}

class Calc extends CalcularIMC {
    public void calcularIMC() {
        Scanner scanner = new Scanner(System.in);
        float peso;
        float altura;
        do {
            System.out.println("Informe o peso: ");
            peso = scanner.nextFloat();
        } while (peso <= 0);
        do {
            System.out.println("Informe a altura: ");
            altura = scanner.nextFloat();
        } while (altura <= 0);

        float indice = peso / (altura * altura);
        System.out.printf("\nSeu IMC é igual a: %.2f", indice);
    }
}
