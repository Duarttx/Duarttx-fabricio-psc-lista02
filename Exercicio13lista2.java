import java.util.Scanner;

public class Exercicio13lista2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerador1;
        int numerador2;
        int denominador1;
        int denominador2;
        
        System.out.print("Digite o numerador da primeira fração:");
        numerador1 = input.nextInt();
        
        System.out.print("Digite o denominador da primeira fração:");
        denominador1 = input.nextInt();

        System.out.print("Digite o numerador da segunda fração:");
        numerador2 = input.nextInt();
        
        System.out.print("Digite o denominador da segunda fração:");
        denominador2 = input.nextInt();

        int novoNumerador, novoDenominador;

        novoNumerador = (numerador1 * denominador2) + (numerador2 * denominador1);
        novoDenominador = denominador1 * denominador2;

        System.out.println("A soma das frações é:");
        System.out.println(novoNumerador + "/" + novoDenominador);

        input.close();
    }
}