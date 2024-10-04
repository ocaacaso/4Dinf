public class Main {
  public static void main(String[] args) {

    degreesToRadiants(180);
    degreesToRadiants(60);

    System.out.println();

    checkMultiple(10, 2);
    checkMultiple(13, 3);

    System.out.println();

    countSeconds(3, 21, 55);
    countSeconds(1, 46, 2);

    System.out.println();

    compareSeconds(3, 21, 55, 2205);
    compareSeconds(1, 46, 2, 9647);
  }

  static double degreesToRadiants(double g) {
    double r = g / 180 * Math.PI;
    System.out.printf("%.0f gradi sono equivalenti a %.2f\n", g, r);
    return r;
  }

  static boolean checkMultiple(int a, int b) {
    if (a % b == 0) {
      System.out.println("True");
      return true;
    } else {
    }
    System.out.println("False");
    return false;
  }

  static int countSeconds(int hours, int minutes, int seconds) {
    int tot = 0;
    tot += seconds;
    tot += minutes * 60;
    tot += hours * 3600;
    System.out.printf("Il totale in secondi e´: %d\n", tot);
    return tot;
  }

  static boolean compareSeconds(int a, int b, int c, int d) {
    int n = countSeconds(a, b, c);
    if (n > d) {
      System.out.println("True");
      return true;
    } else {
      System.out.println("False");
      return false;
    }
  }

}