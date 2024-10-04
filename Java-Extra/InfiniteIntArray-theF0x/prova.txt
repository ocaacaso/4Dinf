public class Main {
  /* Metodo che stampa tutti gli elementi dell'array */
  public static void print(InfiniteIntArray l) {
    for (int i = 0; i < l.size(); i++) {
      System.out.println(l.get(i));
    }
  }

  public static void main(String[] args) {
    InfiniteIntArray l1 = new InfiniteIntArray();

    // aggiunge i numeri da 1 a 30 a l1
    for(int i = 1; i <= 30; i++) {
      l1.add(i);
    }

    print(l1);

    int c = l1.get(3);
    System.out.printf("L'elemento nella cella 3 è %d\n", c);

    l1.remove(10);
    l1.remove(20);
    l1.remove(15);

    print(l1);

    InfiniteIntArray l2 = new InfiniteIntArray();
    // aggiunge i numeri da 21 a 30 a l2
    for(int i = 21; i <= 30; i++) {
      l2.add(i);
    }

    // aggiungo tutti gli elementi di l2 a l1
    l1.addAll(l2);

    print(l1);

    InfiniteIntArray l3 = new InfiniteIntArray();
    // aggiunge i numeri da 5 a 10 a l2
    for(int i = 5; i <= 10; i++) {
      l2.add(i);
    }

    int removed = l1.removeAll(l3);

    System.out.printf("Sono stati rimossi %d elementi\n", removed);

    print(l1);
  }
}