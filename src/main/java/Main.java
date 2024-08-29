import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite um numero");
    
    int numero = sc.nextInt();
    System.out.println("O numero digitado foi");
    System.out.println(numero);

    if(numero > 0){
      System.out.println("O numero é positivo");
    }
    
    if(numero < 0){
      System.out.println("O numero é negativo");
    }
    
    if(numero == 0){
      System.out.println("é zero");
    }
    sc.close();
  }


  
}