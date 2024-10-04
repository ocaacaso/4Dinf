public class Bus {
  String name = "";
  int passengers;

  public Bus (String name) {
    this.name = this.name + name;
    passengers = 0;
  }

  public void stampa() {
    System.out.println(name + ": " + passengers);
  }

  public int faiSalire(int passeggeri) {
    if(passeggeri > 50) {
      this.passengers = 50;
      return (passeggeri - this.passengers);
    }
    this.passengers += passeggeri;
    return 0;
  }

  public int numeroPasseggeri() {
    return this.passengers;
  }

  public int faiScendere(int passeggeri) {
    int t = 0;
    if(passeggeri > this.passengers) {
      t = this.passengers;
      this.passengers = 0;
      return t;
    }
    this.passengers -= passeggeri;
    return passeggeri;
  }

  public void bilanciaPasseggeri(Bus altroBus) {
    int t = 0;
    t += altroBus.passengers + this.passengers;
    if(t % 2 == 0) {
      altroBus.passengers = t/2;
      this.passengers = t/2;
    }
    else {
      altroBus.passengers = (t/2) + 1;
      this.passengers = t/2;
    }
  }
}