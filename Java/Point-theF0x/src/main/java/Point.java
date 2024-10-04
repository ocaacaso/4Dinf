public class Point {
  double x;
  double y;

  public Point() {
    this.x = 0;
    this.y = 0;
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void printPoint() {
    System.out.printf("(x: %.2f: y: %.2f)\n", x, y);
  }

  public void moveUp(double a) {
    y += a;
  }
  public void moveDown(double a) {
    y -= a;
  }
  public void moveLeft(double a) {
    x -= a;
  }
  public void moveRight(double a) {
    x += a;
  }

  /*public double distance(double a, double b) {
    return Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
  }*/
  public void distance(double a, double b) {
    System.out.printf("Distanza: %.2f\n", Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2)));
  }

  /*public boolean sameQuadrant(double a, double b) {
    if((a * x > 0) & (b * y > 0)) {
      return true;
    }
    else {
      return false;
    }
  }*/
  public void sameQuadrant(double a, double b) {
    if((a * x > 0) & (b * y > 0)) {
      System.out.println("Sono nello stesso quadrante");
    }
    else {
      System.out.println("Non sono nello stesso quadrante");
    }
  }
}