public class Appartamento extends Abitazione {
  protected int piano;
  protected boolean ascensore;
  protected int terrazzi;

  public Appartamento(int stanze, float superficie, String indirizzo, String città, int piano, boolean ascensore, int terrazzi) {
    super(stanze, superficie, indirizzo, città);
    this.piano = piano;
    this.ascensore = ascensore;
    this.terrazzi = terrazzi;
  }

  public String toString() {
    String s = super.toString();
    if (ascensore == true) {
      return String.format("%s, %d° piano, %d terrazzi ed ascensore", s, piano, terrazzi);
    }
    return String.format("%s, %d° piano, %d terrazzi senza ascensore", s, piano, terrazzi);
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || this.getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    Appartamento appartamento = (Appartamento) o;
    return this.piano == appartamento.piano && this.ascensore == appartamento.ascensore
        && this.terrazzi == appartamento.terrazzi;
  }

}