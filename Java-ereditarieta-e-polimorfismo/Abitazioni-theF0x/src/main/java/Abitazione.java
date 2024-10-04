public abstract class Abitazione {
  protected int stanze;
  protected float superficie;
  protected String indirizzo;
  protected String città;

  public Abitazione(int stanze, float superficie, String indirizzo, String città) {
    this.stanze = stanze;
    this.superficie = superficie;
    this.indirizzo = indirizzo;
    this.città = città;
  }

  public String toString() {
    return String.format("%d stanze, %.2fmq, indirizzo: %s (%s)", stanze, superficie, indirizzo, città);
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || this.getClass() != o.getClass())
      return false;
    Abitazione abitazione = (Abitazione) o;

    return this.stanze == abitazione.stanze && this.superficie == abitazione.superficie
        && this.indirizzo.equals(abitazione.indirizzo) && this.città.equals(abitazione.città);
  }
}