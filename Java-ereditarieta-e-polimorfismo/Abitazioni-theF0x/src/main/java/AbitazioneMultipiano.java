public abstract class AbitazioneMultipiano extends Abitazione {
  protected int numPiani;

  public AbitazioneMultipiano(int stanze, float superficie, String indirizzo, String città, int numPiani) {
    super(stanze, superficie, indirizzo, città);
    this.numPiani = numPiani;
  }

  public String toString() {
    String s = super.toString();
    return String.format("%s, %d piani", s, numPiani);
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || this.getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    AbitazioneMultipiano am = (AbitazioneMultipiano) o;
    return this.numPiani == am.numPiani;
  }
}