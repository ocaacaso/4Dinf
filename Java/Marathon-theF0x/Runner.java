public class Runner {
  private String nome;
  private String cognome;
  private int ore;
  private int minuti;
  private int secondi;

  public Runner(String nome, String cognome, int ore, int minuti, int secondi) {
    this.nome = nome;
    this.cognome = cognome;
    this.ore = ore;
    this.minuti = minuti;
    this.secondi = secondi;
  }

  public int calculateSeconds() {
    return (this.ore * 3600) + (this.minuti * 60) + this.secondi;
  }

  public void printRunner() {
    int secondiTotali = calculateSeconds();
    System.out.printf("%s %s: %d:%d:%d, secondi totali: %d\n", nome, cognome, ore, minuti, secondi, secondiTotali);
  }
}