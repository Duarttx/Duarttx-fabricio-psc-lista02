import java.util.Scanner;

public class Exercicio8lista2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tamanhoArquivoMB = 0;
        double velocidadeMbps = 0;

        double tamanhoArquivoBits = 0;

        System.out.print("Informe o tamanho do arquivo em MB: ");
        tamanhoArquivoMB = input.nextDouble();

        System.out.print("Informe a velocidade de download em Mega Bits por segundo (Mpbs): ");
        velocidadeMbps = input.nextDouble();

        tamanhoArquivoBits = tamanhoArquivoMB * 8;

        System.out.printf("A velocidade do download em segundos é: %.0f segundos", tamanhoArquivoBits/velocidadeMbps);

        input.close();
    }
}