import java.security.SecureRandom;
import java.util.Scanner;

//todos os atributos static tem o msm endereço de memória
//não precisa instânciar uma classe para chamar o metodo ou atributo static

public class Aula13 {
  public static void main(String[] args) {
    int num = 0;

    // se cada um é 10, então fica 30
    Jogador.pontos();
    Jogador.pontos();
    Jogador.pontos();

    // System.out.printf("%nAlerta:%s%n", Jogador.alerta ? "sim" : "não");

    Jogador j1 = new Jogador(++num);
    Jogador j2 = new Jogador(++num);
    Jogador j3 = new Jogador(++num);

    Jogador.alerta = true;

    j1.info();
    j2.info();
    j3.info();

  }
}
