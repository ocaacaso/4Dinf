public class Villa extends AbitazioneMultipiano {
  protected float superficieGiardino;
  protected boolean piscina;

  public Villa(int stanze, float superficie, String indirizzo, String città, int numPiani, float giardino, boolean piscina) {
    super(stanze, superficie, indirizzo, città, numPiani);
    superficieGiardino = giardino;
    this.piscina = piscina;
  }

  public String toString() {
    String s = super.toString();
    if (piscina == true) {
      return String.format("%s, %.2fmq di giardino e piscina inclusa", s, superficieGiardino);
    }
    return String.format("%s, %.2fmq di giardino senza piscina", s, superficieGiardino);
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || this.getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    Villa villa = (Villa) o;
    return this.superficieGiardino == villa.superficieGiardino && this.piscina == villa.piscina;
  }
}