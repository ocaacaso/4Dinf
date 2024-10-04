class Main {
  public static void main(String[] args) {
    Point p1 = new Point(4, 4);
    Point p2 = new Point(7, 2);

    p1.printPoint();
    p2.printPoint();

    System.out.println();

    p1.moveUp(4);
    p1.moveDown(2);
    p1.moveLeft(7);
    p1.moveRight(2);

    p1.printPoint();

    System.out.println();

    /*double distanza = p1.distance(-1, 5);
    System.out.printf("Distanza: %.2f\n", distanza);*/
    p1.distance(-1, 5);

    System.out.println();

    /*boolean checkQuadrant = p1.sameQuadrant(-4, 2);
    if(checkQuadrant == true) {
      System.out.println("Sono nello stesso quadrante");
    }
    else{
      System.out.println("Non sono nello stesso quadrante");
    }*/
    p1.sameQuadrant(-4, 2);
    p2.sameQuadrant(-4, 9);
  }
}