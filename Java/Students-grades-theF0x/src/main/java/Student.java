public class Student {
  private String nome;
  private String cognome;
  private int ita;
  private int sto;
  private int mate;
  private int info;
  private int ing;

  public Student(String nome, String cognome, int ita, int sto, int mate, int info, int ing) {
    this.nome = nome;
    this.cognome = cognome;
    this.ita = ita;
    this.sto = sto;
    this.mate = mate;
    this.info = info;
    this.ing = ing;
  }

  public float average() {
    return (this.ita + this.sto + this.mate + this.info + this.ing) / 5;
  }

  public boolean passed() {
    if(average() >= 6) {
      return true;
    }
    else {
      return false;
    }
  }

  public void printStudent() {
    if(passed() == true) {
      System.out.printf("%s %s: media voti %.1f, esito: promosso\n", nome, cognome, average());
    }
    else {
      System.out.printf("%s %s: media voti %.1f, esito: bocciato\n", nome, cognome, average());
    }
  }
}