import java.time.*;

public abstract class GasWaterCounter extends Counter {
  protected String id;
  protected LocalDateTime installation;
  protected LocalDateTime lastReadingDate;
  protected double lastReadingValue;

  private final double SECS_TO_CUBICMETERS = 0.005;

  public GasWaterCounter(String id, LocalDateTime installation) {
    super(id, installation);
    lastReadingDate = installation;
    lastReadingValue = 0;
  }

  public double reading(LocalDateTime reading) {
    Duration duration = Duration.between(installation, reading);
    long seconds = duration.getSeconds();

    double totalValue = seconds * SECS_TO_CUBICMETERS;
    double value = totalValue - lastReadingValue;
    lastReadingValue = totalValue;

    lastReadingDate = reading;

    return value;
  }
}