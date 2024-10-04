import java.util.ArrayList;

import org.hamcrest.core.IsInstanceOf;

public class CollezioneMusicale {
  ArrayList<Supporto> supporti = new ArrayList<Supporto>();

  public void aggiungiSupporto(Supporto supporto) {
    supporti.add(supporto);
  }

  public void rimuoviSupporto(Supporto supporto) {
    supporti.remove(supporto);
  }

  public ArrayList<Canzone> cercaCanzonePerAutore(String autore) {
    ArrayList<Canzone> result = new ArrayList<Canzone>();
    for (Supporto s : supporti) {
      result.addAll(s.cercaCanzonePerAutore(autore));
    }
    return result;
  }

  public int numeroDiSupporti() {
    return supporti.size();
  }

  public int numeroDiCD() {
    int t = 0;
    for (Supporto s : supporti) {
      if (s instanceof CD) {
        t++;
      }
    }
    return t;
  }

  public int numeroDiCassette() {
    int t = 0;
    for (Supporto s : supporti) {
      if (s instanceof Cassetta) {
        t++;
      }
    }
    return t;
  }

  public int numeroDiVinili() {
    int t = 0;
    for (Supporto s : supporti) {
      if (s instanceof Vinile) {
        t++;
      }
    }
    return t;
  }

  public int numeroDiFlashMemory() {
    int t = 0;
    for (Supporto s : supporti) {
      if (s instanceof FlashMemory) {
        t++;
      }
    }
    return t;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (Supporto s : supporti) {
      sb.append(s).append("\n");
    }
    return sb.toString();
  }

}