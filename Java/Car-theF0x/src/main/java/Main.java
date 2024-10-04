public class Main {
  public static void main(String[] args) {
    Car c1 = new Car("Ferrari");
    Car c2 = new Car("Porsche", 3);

    Passenger p1 = new Passenger("Filippo", "Fossa");
    Passenger p2 = new Passenger("Fa", "Bio");
    Passenger p3 = new Passenger("Fabrizio", "Frescodizona");
    Passenger p4 = new Passenger("Valentino", "Kiaro");
    Passenger p5 = new Passenger("Maurizio", "Gialosai");

    c1.addPassenger(p1);
    c1.addPassenger(p2);
    c1.stampa();

    System.out.println();

    c2.addPassenger(p3);
    c2.addPassenger(p4);
    c2.addPassenger(p5);
    c2.stampa();

    c1.movePassengersFromCar(c2);
    System.out.println();

    c1.stampa();
    System.out.println();
    c2.stampa();
  }
}