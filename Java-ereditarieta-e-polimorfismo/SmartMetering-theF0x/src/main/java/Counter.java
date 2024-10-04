import java.time.*;

public abstract class Counter {
  protected String id;
  protected LocalDateTime installation;
  protected LocalDateTime lastReadingDate;
  protected double lastReadingValue;

  public Counter(String id, LocalDateTime installation) {
    this.id = id;
    this.installation = installation;
    lastReadingDate = installation;
    lastReadingValue = 0;
  }

  public abstract double reading(LocalDateTime reading);
}