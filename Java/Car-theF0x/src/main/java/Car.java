public class Car {
  String name = new String("");
  Passenger ps[];

  public Car(String name) {
    this.name = this.name + name;
    this.ps = new Passenger[5];
  }

  public Car(String name, int nPassengers) {
    this.name = this.name + name;
    if(nPassengers <= 10) {
      this.ps = new Passenger[nPassengers];
    }
    else {
      throw new RuntimeException("N° posti non valido");
    }
  }

  public void stampa() {
    System.out.printf("%s (%d posti):\n", this.name, ps.length);
    for (int i = 0; i < ps.length; i++) {
      System.out.println(ps[i]);
    }
  }

  public int numberOfPassengers() {
    int t = 0;
    for (int i = 0; i < ps.length; i++) {
      if (ps[i] != null) {
        t++;
      }
    }
    return t;
  }

  public int numberOfEmptySeats() {
    int t = 0;
    for (int i = 0; i < ps.length; i++) {
      if (ps[i] == null) {
        t++;
      }
    }
    return t;
  }

  public void addPassenger(Passenger p) {
    int t = 0;
    for (int i = 0; i < ps.length; i++) {
      if (ps[i] == null) {
        ps[i] = p;
        t++;
        break;
      }
    }
    if (t == 0) {
      throw new RuntimeException("Nessun posto libero disponibile");
    }
  }

  public boolean containsPassenger(Passenger p) {
    for (int i = 0; i < ps.length; i++) {
      if (ps[i] == p) {
        return true;
      }
    }
    return false;
  }

  public void removePassenger(Passenger p) {
    if (containsPassenger(p) == true) {
      for (int i = 0; i < ps.length; i++) {
        if (ps[i] == p) {
          ps[i] = null;
        }
      }
    } else {
      throw new RuntimeException("Passeggero non trovato");
    }
  }

  public Passenger removePassenger() {
    Passenger p = null;
    for (int i = 0; i < ps.length; i++) {
      if (ps[i] != null) {
        p = ps[i];
        ps[i] = null;
        return p;
      }
    }
    throw new RuntimeException("Nessun paseggero presente");
  }

  public void movePassengersFromCar(Car c2) {
    if (c2.numberOfPassengers() <= this.numberOfEmptySeats()) {
      for (int i = 0; i < c2.ps.length; i++) {
        addPassenger(c2.ps[i]);
        c2.removePassenger(c2.ps[i]);
      }
    }
    else{
      for (int i = 0; i < this.ps.length; i++) {
        addPassenger(c2.ps[i]);
        c2.removePassenger(c2.ps[i]);
      }
    }
  }
}