import java.util.Random;

public class Sensor {
  private static final int MALFUNCTION_PROBABILITY = 50; // 1 su 50 probabilità di guasto
  private static final Random random = new Random();

  private boolean isFunctional;

  public Sensor() {
    randomlySetFunctional();
  }

  private void randomlySetFunctional() {
    // 1 su 50 probabilità di guasto
    this.isFunctional = random.nextInt(MALFUNCTION_PROBABILITY) != 0; 
  }

  public double getTemperature() {
    if (isFunctional) {
      randomlySetFunctional();
      // Temperatura casuale compresa tra -10 e 50 gradi Celsius
      return -10 + random.nextDouble() * 60;
    } else {
      throw new SensorMalfunctionException("Il sensore è guasto.");
    }
  }
}