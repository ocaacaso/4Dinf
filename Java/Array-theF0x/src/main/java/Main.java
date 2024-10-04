public class Main {
  public static void main(String[] args) {

    int a[] = { 1, 2, 3, 4, 5 };
    int b[] = { 6, 7, 8, 9, 10, 11 };
    boolean d[] = { true, false, true, false, true };


    printArray(a);

    System.out.printf("\n\nLa somma dell'array selezionato è: %d", sum(a));

    
    int c1[] = concatenationArray(a, b);
    System.out.println("\n\nArray risultante dalla concatenazione:");
      for(int i = 0; i < c1.length; i++) {
        System.out.printf("%d\t", c1[i]);
      }

    int c2[] = sumArray(a, b);
    System.out.println("\n\nArray risultante dalla somma:");
    for(int i = 0; i < c2.length; i++) {
      System.out.printf("%d\t", c2[i]);
    }

    int c3[] = confrontoBooleano(a, d);
    System.out.println("\n\nArray risultante dal confronto:");
    for(int i = 0; i < c3.length; i++) {
      System.out.printf("%d\t", c3[i]);
    }
  }

  public static void printArray(int a[]) {
    System.out.println("Array di interi composto da: ");
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%d\t",a[i]);
    }

  }

  public static int sum(int a[]) {
    int somma = 0;
    for (int i = 0; i < a.length; i++) {
      somma = somma + a[i];
    }
    return somma;
  }

  public static int[] concatenationArray(int a[], int b[]) {
    int c[] = new int[a.length + b.length];
    for (int i = 0; i < a.length; i++) {
      c[i] = a[i];
    }
    for (int i = 0; i < b.length; i++) {
      c[i + a.length] = b[i];
    }
    return c;
  }

  public static int[] sumArray(int a[], int b[]) {
    int c[] = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      c[i] = a[i] + b[i];
    }
    return c;
  }

  public static int[] confrontoBooleano(int a[], boolean b[]) {
    int j = 0;
    int c[] = new int [b.length];
    for(int i = 0; i < b.length; i++){
      if(b[i] == true){
         c[j] = a[i];
      }
      j++;
    }
    return c;
  }

}