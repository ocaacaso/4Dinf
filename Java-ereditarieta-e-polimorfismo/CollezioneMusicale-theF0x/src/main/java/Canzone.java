public class Canzone {
  private String titolo;
  private String autore;

  public Canzone(String titolo, String autore) {
    this.titolo = titolo;
    this.autore = autore;
  }

  public String getAutore() {
    return autore;
  }

  public String getTitolo() {
    return titolo;
  }

  public String toString() {
    return titolo + ", " + autore;
  }
}