class Main {
  public static void main(String[] args) {
    Time t1 = new Time(10, 20, 3);
    Time t2 = new Time(4, 48, 2);

    System.out.println("ore: " + t1.getHours());
    System.out.println("minuti: " + t1.getMinutes());
    System.out.println("secondi: " + t1.getSeconds());
    System.out.println(t1);

    System.out.println();

    System.out.println("ore: " + t2.getHours());
    System.out.println("minuti: " + t2.getMinutes());
    System.out.println("secondi: " + t2.getSeconds());
    System.out.println(t2);

    System.out.println();

    System.out.println(t1.isBigger(t2));
    System.out.println(t1.isSmaller(t2));
    System.out.println(t1.isEqual(t2));

    System.out.println();

    t1.add(t2);
    System.out.println(t1);

    t2.subtract(t1);
    System.out.println(t2);
    
  }
}