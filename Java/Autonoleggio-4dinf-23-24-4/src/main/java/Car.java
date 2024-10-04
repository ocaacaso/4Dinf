public class Car {
  private String plate;
  private String marca;
  private String modello;
  private int nSeats = 0;

  public Car(String marca, String modello, int nSeats, String plate) {
    this.marca = marca;
    this.modello = modello;
    this.nSeats = nSeats;
    this.plate = plate;
  }

  public String toString() {
    return this.marca + " " + this.modello + ": " + this.nSeats + " posti, targa: " + this.plate;
  }

  public String getPlate() {
    return this.plate;
  }

  public int getNSeats() {
    return this.nSeats;
  }
}