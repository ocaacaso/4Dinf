public class Main {
  public static void main(String[] args) {
    Bus bs[] = new Bus[3];
    bs[0] = new Bus("Linea P");
    bs[1] = new Bus("Linea G");
    bs[2] = new Bus("Linea F");

    stampa(bs);
    System.out.println();
    
    distribuisci(bs, 120);
    stampa(bs);
    System.out.println();

    bs[0].faiScendere(20);
    stampa(bs);
    System.out.println();

    

    bilanciaPasseggeri(bs);
    stampa(bs);
  }

  static void stampa(Bus bs[]) {
    for (int i = 0; i < bs.length; i++) {
      bs[i].stampa();
    }
  }

  static int distribuisci(Bus bs[], int passeggeri) {
    int t = 0;
    for (int i = 0; i < bs.length; i++) {
      t += bs[i].faiSalire(passeggeri / bs.length);
    }
    if (passeggeri % 2 == 0) {
      return t;
    }
    return t + 1;
  }

  static void bilanciaPasseggeri (Bus bs[]) {
    for(int i = 0; i < bs.length - 1; i++) {
      bs[i].bilanciaPasseggeri(bs[i + 1]);
    }
    bs[bs.length - 1].bilanciaPasseggeri(bs[0]);
  }
}