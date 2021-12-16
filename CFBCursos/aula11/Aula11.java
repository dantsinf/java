import java.security.SecureRandom;
import java.util.Scanner;

public class Aula11 {
  public static void main(String[] args) {
    int num = 0;
    // resposta: 0,1,2 porque primeiro ele usa o 0 e depois acrescenta
    // Jogador j1 = new Jogador(num++);
    // Jogador j2 = new Jogador(num++);
    // Jogador j3 = new Jogador(num++);

    // resposta: 1,2,3 começa acrescentando
    Jogador j1 = new Jogador(++num);
    Jogador j2 = new Jogador(++num);
    Jogador j3 = new Jogador(++num);

    // j1.num = 10;
    // j2.num = 5;
    // System.out.printf("%n%d", j1.num);
    // System.out.printf("%n%d", j2.num);
  }
}
