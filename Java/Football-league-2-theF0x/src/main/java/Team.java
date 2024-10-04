 public class Team {
  String nome;
  int won = 0;
  int lost = 0;
  int drawn = 0;
  int scored = 0;
  int conceded = 0;

  public Team(String nome) {
    this.nome = nome;
  }

  public void addMatch(boolean home, int goals1, int goals2) {
   if(home == true) {
      scored += goals1;
      conceded += goals2;
      if(goals1 > goals2) {
        won ++;
      }
      else if(goals1 < goals2) {
        lost ++;
      }
      else if(goals1 == goals2) {
       drawn ++;
      }
    }
    else if(home == false) {
      scored += goals2;
      conceded += goals1;
      if(goals1 > goals2) {
        lost ++;
      }
      else if(goals1 < goals2) {
        won ++;
      }
      else if(goals1 == goals2) {
        drawn ++;
      }
    }
  }

  private int calculatePoints() {
    return (this.won * 3) + this.drawn;
  }

  public void printStatistics() {
    int played = won + lost + drawn;
    int scoredPoints = calculatePoints();
    System.out.printf("%s\nPartite giocate: %d\nPartite Vinte: %d\nPartite perse: %d\nPartite Pareggiate: %d\nPunti fatti: %d\nGol fatti: %d\nGol subiti: %d\n\n", nome, played, won, lost, drawn, scoredPoints, scored, conceded);
  }
  
}