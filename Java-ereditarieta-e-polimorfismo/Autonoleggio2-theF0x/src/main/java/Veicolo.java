public abstract class Veicolo {
  protected String targa;
  protected int matricola;
  protected String modello;
  protected String marca;
  protected int cc;
  protected int annoAcquisto;

  public Veicolo(String t, int m, String mo, String ma, int cc, int aA) {
    targa = t;
    matricola = m;
    modello = mo;
    marca = ma;
    this.cc = cc;
    annoAcquisto = aA;
  }

  public abstract int costoNoleggio(int gg, int km);

  public String toString() {
    return String.format("%s %s %dcc %d, targa: %s, matricola: %d", marca, modello, cc, annoAcquisto, targa, matricola);
  }
}