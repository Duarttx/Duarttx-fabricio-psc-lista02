import java.util.Scanner;

public class  Exercicio10lista2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso;
        System.out.print("Digite o seu peso em quilogramas: ");
        peso = input.nextFloat();

        Float pesoAgua;
        pesoAgua = peso * 35;

        Float litros;
        litros = pesoAgua / 1000;

        System.out.println("O volume de água à ser ingerido é: " + litros);
        input.close();
    }
}