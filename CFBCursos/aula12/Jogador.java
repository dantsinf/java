public class Jogador {

  private final int maxVidas = 3;
  private int num = 0;
  private int vidas = 0;

  public Jogador(int num) {
    this.num = num;
    this.vidas = 3;
    System.out.printf("%nJogador numero %d criado%n", num);
  }

  public int getVidas() {
    return this.vidas;
  }

  public void addVidas() { // private só pode ser usado dentro da própria classe
    if (this.vidas > maxVidas) {
      this.vidas++;
    }
  }

  // public void addVidas(int vidas) {
  // if (vidas > maxVidas) {
  // this.vidas = maxVidas;
  // } else if (vidas < 0) {
  // this.vidas = 0;
  // } else {
  // this.vidas = vidas;
  // }
  // }
}