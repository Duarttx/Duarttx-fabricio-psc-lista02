import java.util.Scanner;

public class Exercicio14lista2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x1;
        float y1;
        float x2;
        float y2;
        System.out.print("Digite o valor de x1: ");
        x1 = input.nextFloat();
        
        System.out.print("Digite o valor de y1: ");
        y1 = input.nextFloat();
        
        System.out.print("Digite o valor de x2: ");
        x2 = input.nextFloat();
        
        System.out.print("Digite o valor de y2: ");
        y2 = input.nextFloat();

        float calculo;
        calculo = (float) Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));

        System.out.println("A distância entre os pontos é: " + calculo);
        input.close();
    }
}