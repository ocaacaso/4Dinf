public abstract class Computer {
  protected String cpu;
  protected int ram;
  protected int storage;
  protected String brand;
  protected String model;

  public Computer(String cpu, int ram, int storage, String brand, String model) {
    this.cpu = cpu;
    this.ram = ram;
    this.storage = storage;
    this.brand = brand;
    this.model = model;
  }

  public String toString() {
    return String.format("%s %s: %s, %dGb Ram, %dGb storage", brand, model, cpu, ram, storage);
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || this.getClass() != o.getClass())
      return false;
    Computer computer = (Computer) o;

    return this.cpu.equals(computer.cpu) && this.ram == computer.ram && this.storage == computer.storage && this.brand.equals(computer.brand) && this.model.equals(computer.model);
  }
}