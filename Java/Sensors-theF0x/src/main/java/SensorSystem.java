public class SensorSystem {
  Sensor[] ss = new Sensor[100];
  double[] mediaHistory = new double[10];
  int[] sensorMalfunctionHystory = new int[10];
  double media = 0;
  int sensorMalfunction = 0;

  public SensorSystem() {
    for (int i = 0; i < ss.length; i++) {
      ss[i] = new Sensor();
    }
  }

  private void calculateAverages() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 100; j++) {
        try {
          media += ss[j].getTemperature();
        } catch (SensorMalfunctionException e) {
          sensorMalfunction++;
        }
      }
      media /= (ss.length - sensorMalfunction);
      mediaHistory[i] = media;
      sensorMalfunctionHystory[i] = sensorMalfunction;
      sensorMalfunction = 0;
    }
  }

  public void print() {
    calculateAverages();
    for (int i = 0; i < 10; i++) {
      System.out.println("Giro %d:\n\tTemperatura media: %.2f;\n\tSensori guasti: %d;\n".formatted(i+1, mediaHistory[i], sensorMalfunctionHystory[i]));
    }
  }

}