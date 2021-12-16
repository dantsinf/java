import java.util.Scanner;

public class Aula6 {
  public static void main(String[] args) {

    // part1
    /*
     * final int tam = 5; int[] num = new int[tam]; int[] numeros = { 10, 20, 30,
     * 40, 50 };
     * 
     * num[0] = 10; num[1] = 5; num[2] = 15; num[3] = 0; num[4] = 8;
     * 
     * for (int i = 0; i < numeros.length; i++) { // System.out.printf("%d - ",
     * numeros[2]); System.out.printf("%d - ", numeros[i]); }
     */

    // part2
    /*
     * final int tam = 5; char[] gabarito = { 'a', 'a', 'd', 'b', 'c' }; char[]
     * respostas = new char[tam]; int nota = 0;
     * 
     * respostas[0] = 'a'; respostas[1] = 'a'; respostas[2] = 'd'; respostas[3] =
     * 'b'; respostas[4] = 'c'; for (int i = 0; i < tam; i++) { if (respostas[i] ==
     * gabarito[i]) { nota++; } } System.out.printf("Nota do aluno: %d", nota);
     */

    final int tam = 5;
    char[] gabarito = { 'a', 'a', 'd', 'b', 'c' };
    char[] respostas = new char[tam];
    int nota = 0;
    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < tam; i++) {
      // digite as letras do array gabarito
      System.out.printf("Informe a resposta %d:", i);
      respostas[i] = scan.nextLine().charAt(0);
    }

    for (int i = 0; i < tam; i++) {
      if (respostas[i] == gabarito[i]) {
        nota++;
      }
    }

    System.out.printf("Nota do aluno: %d", nota);

  }
}
