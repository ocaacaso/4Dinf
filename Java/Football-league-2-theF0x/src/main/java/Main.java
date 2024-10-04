class Main {
  public static void main(String[] args) {
    Team t1 = new Team("Juventus");
    t1.printStatistics();

    t1.addMatch(true, 3, 0);
    t1.addMatch(false, 0, 0);
    t1.addMatch(false, 1, 0);
    t1.addMatch(false, 0, 1);

    t1.printStatistics();
  }
}