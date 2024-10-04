public class Race {
  Runner[] rs = new Runner[10];

  public Race() {
    for (int i = 0; i < rs.length; i++) {
      rs[i] = new Runner("Runner" + i);
    }
  }

  // Funzione che pulisce lo schermo
  private void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  // Ferma il thread per un certo numero di millisecondi
  private void wait(int millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      System.out.println("Errore");
    }
  }

  public void start() {
    boolean ctrl = false;
    int winner = 0;
    int i = 0;
    while (ctrl == false) {
      clearScreen();
      for (i = 0; i < rs.length; i++) {
        rs[i].advance();
        System.out.println(rs[i]);
        if (rs[i].hasFinished() == true) {
          ctrl = true;
          winner = i;
        }
      }
      wait(650);
    }
    System.out.println("And the winner is: Runner" + winner);
  }

}