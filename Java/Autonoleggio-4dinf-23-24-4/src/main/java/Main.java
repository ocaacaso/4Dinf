class Main {
  public static void main(String[] args) {

    Car c1 = new Car("Fiat", "Punto", 5, "FN195ST");
    Car c2 = new Car("Ferrari", "499 Pista", 2, "GG104EZ");
    
    Rental d = new Rental();
    
    d.addCar(c1);
    d.addCar(c2);
    
    d.print();

    System.out.println(d.findCar("FN195ST"));
    System.out.println();

    d.removeCar("GG104EZ");

    d.print();


  }
}