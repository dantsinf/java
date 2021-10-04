import java.security.SecureRandom;
import java.util.Scanner;

public class Aula8 {
  public static void main(String[] args) {

    // part1
    /*
     * final int linhas = 3; final int colunas = 5; int[][] numeros = new
     * int[linhas][colunas]; for (int l = 0; l < linhas; l++) { for (int c = 0; c <
     * colunas; c++) { numeros[l][c] = new SecureRandom().nextInt(100); } }
     * 
     * for (int l = 0; l < linhas; l++) { for (int c = 0; c < colunas; c++) {
     * System.out.printf("%d | ",numeros[l][c]);
     * //System.out.printf("%2d | ",numeros[l][c]);//para quando ter um dígito só,
     * ficar organizado } System.out.printf("%n"); }
     */

    // part2
    final int linhas = 3;
    final int colunas = 5;
    int[][] numeros = new int[linhas][colunas];
    int[][] num = { { 10, 20, 30, 40, 50 }, { 1, 2, 3, 4, 5 }, { 100, 200, 300, 400, 500 } };

    for (int l = 0; l < linhas; l++) {
      for (int c = 0; c < colunas; c++) {
        numeros[l][c] = new SecureRandom().nextInt(100);
      }
    }
    /*
     * for (int l = 0; l < linhas; l++) { for (int c = 0; c < colunas; c++) {
     * System.out.printf("%d | ",numeros[l][c]);
     * //System.out.printf("%2d | ",numeros[l][c]);//para quando ter um dígito só,
     * ficar organizado } System.out.printf("%n"); }
     */

    for (int[] n : num) {
      for (int v : n) {
        System.out.printf("%3d | ", v);
      }
      System.out.printf("%n");
    }

  }
}
