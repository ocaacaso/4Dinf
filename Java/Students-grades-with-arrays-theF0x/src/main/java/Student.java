public class Student{
  String nome;
  String cognome;
  int voti[] = new int [5];

  public Student(String nome, String cognome, int voto1, int voto2, int voto3, int voto4, int voto5){
    this.nome = nome;
    this.cognome = cognome;
    voti[0] = voto1;
    voti[1] = voto2;
    voti[2] = voto3;
    voti[3] = voto4;
    voti[4] = voto5;
  }

  public float average() {
    return (voti[0] + voti[1] + voti[2] + voti[3] + voti[4])/5;
  }

  public boolean passed() {
    if(average() >= 6) {
      return true;
    }
    else {
      return false;
    }
  }

  public void printStudent() {
    if(passed() == true) {
      System.out.printf("%s %s: media voti %.1f, esito: promosso\n", nome, cognome, average());
    }
    else {
      System.out.printf("%s %s: media voti %.1f, esito: bocciato\n", nome, cognome, average());
    }
  }
}
