import java.util.Scanner;

public class Exercicio1lista2{
 public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double horas;
    double minutos;
    double MinutosTotais;
    System.out.print("Informe quantas horas são: ");
    horas = input.nextInt();
    System.out.print("Informe quantos minutos são: ");
    minutos = input.nextDouble();
    MinutosTotais = ((horas * 60)+ minutos);
    System.out.println("o valor total em mínutos é: " + MinutosTotais);
   
  }
 
}