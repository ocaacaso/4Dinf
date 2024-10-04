public class Negozio extends AbitazioneMultipiano {
  protected int postiAuto;
  protected boolean mezziPubblici;

  public Negozio(int stanze, float superficie, String indirizzo, String città, int numPiani, int postiAuto, boolean mezziPubblici) {
    super(stanze, superficie, indirizzo, città, numPiani);
    this.postiAuto = postiAuto;
    this.mezziPubblici = mezziPubblici;
  }

  public String toString() {
    String s = super.toString();
    if (mezziPubblici == true) {
      return String.format("%s, parcheggio da %d posti e raggiungibile tramite mezzi", s, postiAuto);
    }
    return String.format("%s, parcheggio da %d posti e  non raggiungibile tramite mezzi", s, postiAuto);
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || this.getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    Negozio negozio = (Negozio) o;
    return this.postiAuto == negozio.postiAuto && this.mezziPubblici == negozio.mezziPubblici;
  }
}