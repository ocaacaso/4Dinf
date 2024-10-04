public abstract class DesktopServer extends Computer {
  protected Type size;

  public DesktopServer(String processor, int ram, int storage, String brand, String model, Type size) {
    super(processor, ram, storage, brand, model);
    this.size = size;
  }

  public String toString() {
    String s = super.toString();
    if (size == Type.TOWER) {
      return String.format("%s (Tower Pc)");
    } else if (size == Type.MID_TOWER) {
      return String.format("%s (Mid tower Pc)");
    }
    return String.format("%s (Full tower Pc)");
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || this.getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    DesktopServer ds = (DesktopServer) o;
    return this.size.equals(ds.size);
  }
}