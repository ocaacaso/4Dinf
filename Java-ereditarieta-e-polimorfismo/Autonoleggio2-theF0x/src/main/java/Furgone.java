public class Furgone extends Veicolo {
  protected int carico;

  public Furgone (String t, int m, String mo, String ma, int cc, int aA, int carico) {
    super(t, m, mo, ma, cc, aA);
    this.carico = carico;
  }

  public int costoNoleggio(int gg, int km){
    return (gg * 70) + ((km-100) / 30);
  }

  public String toString() {
    String s = super.toString();
    return s + " carico: " + carico + "Kg";
  }
}