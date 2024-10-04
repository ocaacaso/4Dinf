public class Auto extends Veicolo {
  protected int nPosti;

  public Auto (String t, int m, String mo, String ma, int cc, int aA, int nPosti) {
    super(t, m, mo, ma, cc, aA);
    this.nPosti = nPosti;
  }

  public int costoNoleggio(int gg, int km){
    return (gg * 50) + (km / 25);
  }

  public String toString() {
    String s = super.toString();
    return s + " " + nPosti + " posti";
  }
}