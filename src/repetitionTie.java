import java.util.Scanner;

public class repetitionTie {
  public static void main(String[] args) {
    Scanner intNumberScanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int inputNUmber = intNumberScanner.nextInt();

    for (int index = 0; index <= inputNUmber; index++) {
    System.out.println(index);
    }
    intNumberScanner.close();
  }
}
