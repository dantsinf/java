public class Aula3 {
  public static void main(String[] args) {

    int nota = 90;
    int faltas = 10;
    int maxFaltas = 5;
    int media = 60;
    String res;

    // part1 ifelse
    /*
     * if (nota >= media) { System.out.println("Aprovado"); } else {
     * System.out.println("Reprovado"); } System.out.println("Final do programa");
     * // System.out.println("Aula1 e 2");
     */

    // part2 e &&
    /*
     * if (nota >= media && faltas <= maxFaltas) { System.out.println("Aprovado"); }
     * else { System.out.println("Reprovado"); }
     */

    // part3 IF Ternário
    /*
     * res = (nota >= media ? "Aprovado" : "Reprovado");
     * System.out.println("Resultado: " + res);
     */

    // Switch
    int pos = 1;
    switch (pos) {
      case 1:
        System.out.println("Primeiro lugar");
        break;
      case 2:
        System.out.println("Segundo lugar");
        break;
      default:
        System.out.println("Não subiu no pódio");
        break;
    }

  }
}
