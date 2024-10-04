public class Main {
  public static void stampa(int i) {
    System.out.println(i);
    if (i != 0) {
      stampa(i - 1);
    }
  }

  public static int fib(int n) {
    if (n == 1)
      return 1;
    if (n == 2)
      return 2;
    return fib(n - 1) + fib(n - 2);
  }

  public static void l2f(int i, int n[]) {
    System.out.println(n[i]);
    if (i > 0)
      l2f(i - 1, n);
  }

  public static void f2l(int i, int n[]) {
    System.out.println(n[i]);
    if (i != n.length - 1)
      f2l(i + 1, n);
  }

  public static void firstToLast(int i, int n[]) {
    if (i < n.length) {
      System.out.println(n[i]);
      firstToLast(i + 1, n);
    }
  }

  public static void lastToFirst(int i, int n[]) {
    if (i < n.length) {
      lastToFirst(i + 1, n);
      System.out.println(n[i]);
    }
  }

  public static int sumArray(int i, int n[]) {
    if (i == n.length - 1) return n[i];
    return n[i] + sumArray(i + 1, n);
  }

  public static boolean everithingEven(int i, int n[]) {
    if (i == n.length - 1 && n[i] % 2 == 0) return true;
    
  }

  public static void main(String[] args) {
    int[] n = new int[10];
    for (int i = 0; i < n.length; i++) {
      n[i] = 2;
    }
    System.out.println(everithingEven(0, n));
  }
}