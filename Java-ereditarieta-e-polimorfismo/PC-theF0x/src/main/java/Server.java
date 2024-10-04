public class Server extends DesktopServer {
  protected int nCpu;
  protected boolean raid;

  public Server (String processor, int ram, int storage, String brand, String model, Type size, int nCpu, boolean raid) {
    super(processor, ram, storage, brand, model, size);
    this.nCpu = nCpu;
    this.raid = raid;
  }

  public String toString() {
    String s = super.toString();
    if (raid == true) {
      return String.format("%s gpu: %d cpu and raid", nCpu);
    }
    return String.format("%s gpu: %d cpu without raid", nCpu);
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || this.getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;
    Server server = (Server) o;
    return this.nCpu == server.nCpu && this.raid == server.raid;
  }
}