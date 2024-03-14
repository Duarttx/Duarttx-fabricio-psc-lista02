import java.util.Scanner;

 public class Exercicio2lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precoEtanol = 0;
        double precoGasolina = 0;
        double variacao;

        System.out.print("Informe o valor do etanol: ");
        precoEtanol = input.nextDouble();
    
        System.out.print("Informe o valor da gasolina: ");
        precoGasolina = input.nextDouble();

        variacao = ( precoEtanol*100)/precoGasolina;
        
        if (variacao < 70)
        System.out.println("Sera melhor abastercer com Etanol");
        else
        System.out.println("Sera melhor abastecer com Gasolina");
        
        input.close();


    
    }    
}
