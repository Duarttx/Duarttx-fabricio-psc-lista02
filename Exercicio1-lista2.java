import java.util.Scanner;

public class Exercicio1{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   double horas;
   double minutos;
  double MinutosTotais;
  Scanner sc = new Scanner(System.in);
 System.out.print("Informe quantas horas são: ");
 horas = sc.nextInt();
 System.out.print("Informe quantos minutos são: ");
  minutos = sc.nextDouble();
 MinutosTotais = ((horas * 60)+ minutos);
 System.out.println("o valor total em mínutos é: " + MinutosTotais);
   
 }
 
}