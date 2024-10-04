public class Desktop extends DesktopServer {
  protected String gpu;

  public Desktop(String processor, int ram, int storage, String brand, String model, Type size, String gpu) {
    super(processor, ram, storage, brand, model, size);
    this.gpu = gpu;
  }

  public String toString() {
    String s = super.toString();
    return String.format("%s gpu: %s", gpu);
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || this.getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    Desktop desktop = (Desktop) o;
    return this.gpu.equals(desktop.gpu);
  }
}