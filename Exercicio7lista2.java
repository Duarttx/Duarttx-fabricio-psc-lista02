import java.util.Scanner;
public class Exercicio7lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double larguraArea = 0.0;
        Double comprimentoArea = 0.0;
        Double larguraCeramica = 0.0;
        Double comprimentoCeramica = 0.0;
        Double valorCeramica = 0.0;

        double area = 0;
        double areaCeramica = 0;

        double quantidadePecasBasico = 0;
        double quantidadePecasTotal = 0;
        double precoTotalCeramica = 0;

        System.out.print("Informe a largura da Area: ");
        larguraArea = input.nextDouble();

        System.out.print("Informe o comprimento da Area: ");
        comprimentoArea = input.nextDouble();

        System.out.print("Informe a largura da Ceramica: ");
        larguraCeramica = input.nextDouble();

        System.out.print("Informe o comprimento da Ceramica: ");
        comprimentoCeramica = input.nextDouble();

        System.out.print("Informe o valor do metro quadrado da Ceramica: ");
        valorCeramica = input.nextDouble();

        area = larguraArea * comprimentoArea;
        areaCeramica = larguraCeramica * comprimentoCeramica;

        quantidadePecasBasico = area/areaCeramica;

        quantidadePecasTotal = quantidadePecasBasico + (quantidadePecasTotal * 0.1);

        precoTotalCeramica = (valorCeramica * areaCeramica) * quantidadePecasTotal;

        System.out.printf("A quantidade de peças necessárias para a obra eh: %.0f\n", quantidadePecasTotal);
        System.out.printf("O preco total para comprar as pecas eh: %.2f", precoTotalCeramica);

        input.close();
    }
}

