import java.util.Scanner;

public class Exercicio9lista2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Float peso;
        Float altura;

        System.out.print("Digite seu peso atual em quilogramas: ");
        peso = input.nextFloat();

        System.out.print("Digite sua altura atual em centímetros: ");
        altura = input.nextFloat();

        altura = altura / 100;

        float IMC;
        IMC = peso / (altura * altura);

        float pesoIdeal;
        pesoIdeal = 22 * altura * altura;

        System.out.println("O valor do IMC é: " + IMC + "\n" + "O seu peso ideal é: " + pesoIdeal);

        input.close();
    }
}