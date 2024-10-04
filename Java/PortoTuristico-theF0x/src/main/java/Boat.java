public class Boat {
  String name;
  String nationality;
  int length;
  int tonnage;
  Type motor; // true--> vela false--> motore

  public Boat(String name, String nationality, int length, int tonnage, Type motor) {
    this.name = name;
    this.nationality = nationality;
    this.length = length;
    this.tonnage = tonnage;
    this.motor = motor;
  }

  public String toString() {
    if (motor == Type.SAIL) {
      return name + " (" + nationality + "): " + length + "mt x " + tonnage + "Kg, type: sailboat";
    } else {
      return name + " (" + nationality + "): " + length + "mt x " + tonnage + "Kg, type: motorboat";
    }
  }
}