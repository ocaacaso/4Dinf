class Main {
  public static void main(String[] args) {

    Boat b1 = new Boat("Vesperigo Apucci", "Italia", 15, 28000, Type.SAIL);
    Boat b2 = new Boat("Costa Concordia", "Italia", 25, 56000, Type.MOTOR);
    Boat b3 = new Boat("Barcone immigrati", "Camerun", 7, 1000, Type.MOTOR);
    Boat b4 = new Boat("Avesperigo Pucci", "Italia", 25, 30000, Type.MOTOR);

    Port p = new Port();

    System.out.println("Posto assegnato: " + p.addBoat(b1));
    System.out.println("Posto assegnato: " + p.addBoat(b2));
    System.out.println("Posto assegnato: " + p.addBoat(b3));
    System.out.println("Posto assegnato: " + p.addBoat(b4));

    p.print();

    System.out.println(p.removeBoat("Avesperigo Pucci", 5));
  }
}