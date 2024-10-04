public class Notebook extends Computer {
  protected int weight;
  protected int length;
  protected int height;
  protected int depth;

  public Notebook (String processor, int ram, int storage, String brand, String model, Type size, int weight, int length, int height, int depth) {
    super(processor, ram, storage, brand, model);
    this.weight = weight;
    this.length = length;
    this.height = height;
    this.depth = depth;
  }

  public String toString() {
    String s = super.toString();
    return String.format("%s %dKg, %dx%dx%d cm", weight, length, height, depth);
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || this.getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    Notebook notebook = (Notebook) o;
    return this.weight == notebook.weight && this.length == notebook.length && this.height == notebook.height && this.depth == notebook.depth;
  }
}