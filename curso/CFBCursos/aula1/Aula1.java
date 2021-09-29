public class Aula1 {
  public static void main(String[] args) {

    int num = 100;
    String nome = "Maria";

    // print não tem quebra de linha
    System.out.print("O começo");
    // System.out.print("O começo\n"); tem quebra de linha no final
    // println tem quebra de linha no final
    System.out.println("Aula1 e 2");
    // %s string e %d inteiro
    System.out.printf("%s - %d", "Setembro", 2021);
    // %n é quebra de linha
    System.out.printf("\nValor da variável num:%d%nNome:%s", num, nome);
  }
}
