class Main {
  public static void main(String[] args) {
    Sensor[] ss = new Sensor[100];

    Double average = 0.0;
    int cnt = 0;
    int cnt2 = 0;

    for (int i = 0; i < ss.length; i++) {
      ss[i] = new Sensor();
    }

    for (int i = 0; i < ss.length; i++) {
      try {
        double d = ss[i].getTemperature();
        average += d;
        cnt++;
        System.out.printf("Sensore %d:\t\t%.2f\n", i + 1, d);
      } 
      catch (SensorMalfunctionException e) {
        System.out.println("Sensore " + (i + 1) + ":\t\tGUASTO");
        cnt2++;
      }
    }

    average = average/cnt;
    System.out.println();
    System.out.printf("Temperatura media: %.2f\n", average);
    System.out.println("Numereo di sensori guasti: " + cnt2);
    System.out.printf("\n\n");

    
    SensorSystem ss2 = new SensorSystem();

    ss2.print();
  }
}