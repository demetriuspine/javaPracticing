import java.util.Scanner;

public class condicional {
  public static void main(String[] args) {
    Scanner verifyingScanner = new Scanner(System.in);
    
    System.out.print("Digite o número inteiro a ser verificado: ");
    int number = verifyingScanner.nextInt();

    if (number % 2 == 0) {
      System.out.println("O número " + number + " é par");
    } else {
      System.out.println("O número " + number + " é impar");
    }
    verifyingScanner.close();
  }
}
