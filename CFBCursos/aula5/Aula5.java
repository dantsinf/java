import java.util.Scanner;

public class Aula5 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    // FOR
    /*
     * for (int cont = 0; cont < 5; cont++) { System.out.println(cont +
     * " Ao lado a quantidade da do FOR"); }
     */

    // While
    /*
     * int max = scan.nextInt(); int cont = 0; while (cont < max) {
     * System.out.println(cont + " - Aula 5"); cont++; }
     */

    int cont = 0;
    do {
      System.out.println(cont + " - Aula 5");
      cont++;
    } while (cont < 0);

    System.out.println("Fim do programa");
  }
}
