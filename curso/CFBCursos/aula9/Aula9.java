import java.security.SecureRandom;
import java.util.Scanner;

public class Aula9 {
  public static void main(String[] args) {

    // part1
    /*
     * msg("Java"); msg("Javascript"); msg("PHP"); }
     * 
     * public static void msg(String m) { System.out.println(m); }
     */

    // part2
    /*
     * msg("Java", 5); }
     * 
     * public static void msg(String m, int l) { for (int i = 0; i < l; i++) {
     * System.out.println(m); } }
     */

    // part3
    int r;

    msg("Java", 1);
    r = soma(10, 5);
    System.out.println(r);
  }

  public static int soma(int n1, int n2) {
    int res = n1 + n2;
    return res;
  }

  public static void msg(String m, int l) {
    for (int i = 0; i < l; i++) {
      System.out.println(m);
    }
  }

}
