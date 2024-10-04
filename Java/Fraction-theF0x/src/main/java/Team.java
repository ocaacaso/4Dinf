public class Team {
  private String name;
  private int won;
  private int lost;
  private int drawn;
  private int scored;
  private int conceded;

  public Team(String name, int won, int lost, int drawn, int scored, int conceded) {
    this.name = name;
    this.won = won;
    this.lost = lost;
    this.drawn = drawn;
    this.scored = scored;
    this.conceded = conceded;
  }

  public int calculateScore() {
    return this.won * 3 + this.drawn;
  }

  public void printTeam() {
    int score = this.calculateScore();
    System.out.printf("%s: %d\n", this.name, score);
  }

}