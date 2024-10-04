public class Runner {
  // costante per il traguardo
  private static final int FINISH_LINE = 100;
  String name;
  double distance = 0.0;

  public Runner(String nome) {
    name = nome;
  }

  public void advance() {
    distance += (int) (Math.random() * 11);
  }

  public boolean hasFinished() {
    if (distance >= FINISH_LINE) {
      return true;
    }
    return false;
  }

  public double getDistance() {
    return distance;
  }

  public String toString() {

    String result = name + "\t |";

    for (int i = 0; i < (distance / 10); i++) {
      result += " ";
    }

    result += "o";

    if (hasFinished() == true) {
      return result;
    }

    else {
      for (int i = 0; i <= (FINISH_LINE - distance) / 10 - 1; i++) {
        result += " ";
      }
      result += "|";
      return result;
    }
  }

}