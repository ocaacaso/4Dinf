import java.util.ArrayList;

public class Autonoleggio {
  ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();

  public void add(Veicolo v) {
    veicoli.add(v);
  }

  public void remove(Veicolo v) {
    veicoli.remove(v);
  }

  public Veicolo searchByPlate(String s) {
    for (Veicolo v : veicoli) {
      if (v.targa.equals(s)) {
        return v;
      }
    }
    throw new RuntimeException("Targa non trovata");
  }

  public ArrayList<Auto> searchBySeats(int a) {
    ArrayList<Auto> vs = new ArrayList<Auto>();
    for (Veicolo v : veicoli) {
      Auto u = (Auto) v;
      if (u instanceof Auto) {
        if (u.nPosti == a) {
          vs.add(u);
        }
      }
    }
    return vs;
  }

  public ArrayList<Furgone> searchByLoad(int a) {
    ArrayList<Furgone> vs = new ArrayList<Furgone>();
    for (Veicolo v : veicoli) {
      Furgone f = (Furgone) v;
      if (f instanceof Furgone) {
        if (f.carico == a) {
          vs.add(f);
        }
      }
    }
    return vs;
  }
}