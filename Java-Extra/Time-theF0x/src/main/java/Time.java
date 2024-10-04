public class Time {
  int seconds = 0;

  public Time(int secs) {
    this.seconds += secs;
  }

  public Time(int secs, int mins) {
    this.seconds += secs;
    this.seconds += mins * 60;
  }

  public Time(int secs, int mins, int hours) {
    this.seconds += secs;
    this.seconds += mins * 60;
    this.seconds += hours * 3600;
  }

  public int getHours() {
    return this.seconds / 3600;
  }

  public int getMinutes() {
    return this.seconds / 60;
  }

  public int getSeconds() {
    return seconds;
  }

  public String toString() {
    int hours = getHours();
    int minutes = getMinutes() - (hours * 60);
    int seconds = getSeconds() - (hours * 3600) - (minutes * 60);
    return hours + ":" + minutes + ":" + seconds;
  }

  public boolean isBigger(Time t2) {
    if (this.seconds > t2.seconds) {
      return true;
    }
    return false;
  }

  public boolean isSmaller(Time t2) {
    if (this.seconds < t2.seconds) {
      return true;
    }
    return false;
  }

  public boolean isEqual(Time t2) {
    if (this.seconds == t2.seconds) {
      return true;
    }
    return false;
  }

  public void add(Time t2) {
    this.seconds += t2.seconds;
  }

  public void subtract(Time t2) {
    if (isBigger(t2) == true) {
      this.seconds -= t2.seconds;
    } 
    else {
      this.seconds = 0;
    }
  }
}