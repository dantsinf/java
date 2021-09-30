import java.util.Scanner;

public class Aula7 {
  public static void main(String[] args) {

    final int tam = 10;
    int[] num = { 9, 2, 7, 1, 8, 5, 3, 4, 0, 6 };
    int[] numeros = new int[tam];
    int p = 15;
    int pos;

    // Arrays.sort(num); //sort ordena o array
    // Arrays.fill(numeros,10); //preenche o array com valor específico
    System.arraycopy(num, 0, numeros, 0, tam);
    System.arraycopy(src, srcPos, dest, destPos, length);

    for (int n : numeros) {
      System.out.printf("%d - ", n);
    }

  }
}
