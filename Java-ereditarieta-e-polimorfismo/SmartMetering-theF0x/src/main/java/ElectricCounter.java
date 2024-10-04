import java.time.*;

public class ElectricCounter extends Counter {
  protected String id;
  protected LocalDateTime installation;
  protected LocalDateTime lastReading;
  protected double lastReadingValue;
  protected int maxPower = 3;

  public ElectricCounter(String id, LocalDateTime installation) {
    super(id, installation);

  }

  public double reading(LocalDateTime reading) {
    Duration duration = Duration.between(lastReading, reading);
    double seconds = duration.getSeconds();
    return seconds;
  }
}