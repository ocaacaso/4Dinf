import java.util.ArrayList;

public abstract class Supporto {
  protected ArrayList<Canzone> canzoni = new ArrayList<Canzone>();

  public void aggiungiCanzone(Canzone canzone) {
    canzoni.add(canzone);
  }

  public void rimuoviCanzone(Canzone canzone) {
    canzoni.remove(canzone);
  }

  public ArrayList<Canzone> cercaCanzonePerAutore(String autore) {
    ArrayList<Canzone> risultati = new ArrayList<Canzone>();
    for (int i = 0; i < canzoni.size(); i++) {
      if (this.canzoni.get(i).getAutore().equals(autore)) {
        risultati.add(canzoni.get(i));
      }
    }
    return risultati;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (Canzone c : canzoni) {
      sb.append(c).append("\n");
    }
    return sb.toString();
  }
}