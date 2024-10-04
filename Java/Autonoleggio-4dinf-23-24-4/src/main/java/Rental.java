public class Rental {
  private Car ds[];

  public Rental (int nPosti) {
    this.ds = new Car [nPosti];
  }

  public Rental () {
    this.ds = new Car [1000];
  }

  public void print() {
    for(int i = 0; i < ds.length; i++) {
      System.out.println(ds[i]);
    }
    System.out.println();
  }

  public void addCar(Car c) {
    int t = 0;
    for (int i = 0; i < ds.length; i++) {
      if (ds[i] == null) {
        ds[i] = c;
        t++;
        break;
      }
    }
    if (t == 0) {
      throw new RuntimeException("Limite massimo di auto raggiunto");
    }
  }

  public Car removeCar(String plate) {
    Car c = null;
    for (int i = 0; i < ds.length; i++) {
      if (ds[i] != null) {
        if (ds[i].getPlate().equals(plate)) {
          c = ds[i];
          ds[i] = null;
          return c;
        }
      }
    }
    throw new RuntimeException("Nessuna auto trovata");
  }

  public Car findCar(String plate) {
    for (int i = 0; i < ds.length; i++) {
      if (ds[i] != null) {
        if (ds[i].getPlate().equals(plate)) {
          return ds[i];
        }
      }
    }
    throw new RuntimeException("Nessuna auto trovata");
  }

  public void findCarsBySeats(int nSeats) {
    int t = 0;
    for (int i = 0; i < ds.length; i++) {
      if (ds[i].getNSeats() == nSeats) {
        System.out.println(ds[i]);
        t++;
      }
    }
    if (t == 0) {
      throw new RuntimeException("Nessuna auto trovata");
    }
  }
}