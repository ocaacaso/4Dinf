class Main {
  public static void main(String[] args) {
    Fraction f1 = new Fraction(false, -10, 3);
    Fraction f2 = new Fraction(-5);

    System.out.println(f2);

    f1.simplify();

    f1.divide(f2);
    
    System.out.println(f1);
  }
}