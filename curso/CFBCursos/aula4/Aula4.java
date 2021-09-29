import java.util.Scanner;

public class Aula4 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n1, n2, res = 0;
    String nome = "";

    System.out.print("Digite seu nome: ");
    nome = scan.nextLine();
    System.out.print("Digite um numeral: ");
    n1 = scan.nextInt();
    System.out.print("Digite outro numeral: ");
    n2 = scan.nextInt();
    res = n1 + n2;
    System.out.printf("%s, a soma de %d com %d e igual a %d", nome, n1, n2, res);
  }
}
