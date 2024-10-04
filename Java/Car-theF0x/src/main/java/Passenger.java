public class Passenger {
  String name = new String("");
  String lastName = new String("");

  public Passenger(String name, String lastName) {
    this.name = this.name + name;
    this.lastName = this.lastName + lastName;
  }

  public String toString() {
    return this.name + " " + this.lastName;
  }
}