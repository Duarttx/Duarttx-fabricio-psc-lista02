import java.util.Scanner;
public class Exercicio6lista2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double larguraArea = 0.0;
        Double comprimentoArea = 0.0;
        Double larguraCeramica = 0.0;
        Double comprimentoCeramica = 0.0;

        Double area = 0.0;
        Double areaCeramica = 0.0;

        Double quantidadePecasBasico = 0.0;
        Double quantidadePecasTotal = 0.0;

        System.out.print("Informe a largura da Area: ");
        larguraArea = input.nextDouble();

        System.out.print("Informe o comprimento da Area: ");
        comprimentoArea = input.nextDouble();

        System.out.print("Informe a largura da Ceramica: ");
        larguraCeramica = input.nextDouble();

        System.out.print("Informe o comprimento da Ceramica: ");
        comprimentoCeramica = input.nextDouble();

        area = larguraArea * comprimentoArea;
        areaCeramica = larguraCeramica * comprimentoCeramica;

        quantidadePecasBasico = area/areaCeramica;

        quantidadePecasTotal = quantidadePecasBasico + (quantidadePecasTotal * 0.1);

        System.out.printf("A quantidade de peças necessárias para a obra é: %.0f", quantidadePecasTotal);
        
        input.close();
    }
    
}