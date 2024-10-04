public class Main {
  public static void main(String[] args) {
    
    Student ss[] = new Student[5];
    ss[0] = new Student("Filippo", "Fossa", 7, 6, 6, 10, 7);
    ss[1] = new Student("Michele", "Polidori", 3, 5, 6, 7, 4);
    ss[2] = new Student("Gabriele", "Fiorucci", 5, 4, 8, 7, 8);

    for(int i = 0; i < ss.length; i++) {
      ss[i].printStudent();
    }

    System.out.println();


    System.out.printf("Media generale: %.1f", generalAverage(ss));
    System.out.printf("\nGli studenti passati sono: %d", countPassedStudents(ss));
  }

  static float generalAverage(Student ss[]) {
    float generalAverage = 0;
    for(int i = 0; i < ss.length; i++) {
      generalAverage += ss[i].average();
    }
    return generalAverage/ss.length;
  }

  static int countPassedStudents(Student ss[]) {
    int c = 0;
    for(int i = 0; i < ss.length; i++)
    if(ss[i].average() >= 6) {
      c++;
    }
    return c;
  }
}