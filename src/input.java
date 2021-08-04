import java.util.Scanner;//importando o scanner

public class input {
  public static void main(String[] args) {
    Scanner meuScanner = new Scanner(System.in);//criação do input

    System.out.print("entre com o seu nome: ");//mensagem de input
    String nome = meuScanner.nextLine(); //lê valores string

    System.out.print("entre com a sua idade: ");
    int idade = meuScanner.nextInt();

    System.out.print("entre com a sua altura: ");
    float altura = meuScanner.nextFloat();

    System.out.print("usa óculos: ");
    Boolean oculos = meuScanner.nextBoolean();
    
    meuScanner.close();//sempre fechar o input

    System.out.println("seu nome é: " + nome);
    System.out.println("sua idade é: " + idade);
    System.out.println("sua altura é: " + altura);
    System.out.println("Usa óculos?: " + oculos);

  }
}
