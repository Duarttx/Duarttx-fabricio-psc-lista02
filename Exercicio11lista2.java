import java.util.Scanner;

public class Exercicio11lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float Watts;
        Float horas;
        Float preco;
        
        System.out.print("Digite a potencia do equipamento em Watts: ");
        Watts = input.nextFloat();
        System.out.print("Digite a quantidade de horas que ele fica ligado por dia: ");
        horas = input.nextFloat();
        System.out.print("Digite o preço do KW/h: ");
        preco = input.nextFloat();

        Float conversor;
        conversor = (Watts * horas) / 1000;

        Float precoTotal;
        precoTotal = conversor * preco;

        System.out.println("A quantidade de KW/h consumido é: " + conversor + "\n" + "O valor total a ser pago é:" + precoTotal);
        input.close();
    }
}