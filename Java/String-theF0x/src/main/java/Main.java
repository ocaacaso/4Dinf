public class Main {
  public static void main(String[] args) {
    String ss[] = new String[6];
    
    ss[0] = "Hello World";
    ss[1] = "Ciao mondo";
    ss[2] = "otto";
    ss[3] = "o";
    ss[4] = "Ciao come va?";
    ss[5] = "   Ciao Mondo   ";

    printVertically(ss[0]);
    
    System.out.println();
    System.out.println(reverse(ss[0]));
    
    System.out.println();
    System.out.println(acronym(ss[0]));

    System.out.println();
    System.out.println(concat(ss));
    
    System.out.println();
    System.out.println(isPalindrome(ss[2]));

    System.out.println();
    System.out.println(countOccurrences(ss[0], ss[3]));

    System.out.println();
    System.out.println(countSpaces(ss[4]));

    System.out.println();
    System.out.println(removeLeadingAndTrailingSpaces(ss[5]));
  }

  static void printVertically(String s) {
    for (int i = 0; i < s.length(); i++) {
      System.out.printf("%s\n", s.charAt(i));
    }
  }

  static String reverse(String s) {
    String s2 = "";
    for (int i = s.length()- 1; i >= 0; i--) {
      s2 = s2 + s.charAt(i);
    }
    return s2;
  }

  static String acronym(String s) {
    String s3 = "";
    s = s.toUpperCase();
    s3 = s3 + s.charAt(0) + ".";
    for(int i = 0; i < s.length(); i++) {
      if(s.indexOf(" ", i) >= 0) {
        s3 = s3 + s.charAt(s.indexOf(" ", i) + 1) + ".";
        i = s.indexOf(" ", i) + 1;
      }
      else{
        break;
      }
    }
    return s3;
  }

  static String concat(String ss[]) {
    String s1 = "";
    for(int i = 0; i < ss.length; i++) {
      s1 = s1 + ss[i] + ", ";
    }
    return s1;
  }

  static boolean isPalindrome(String s) {
    return s.equalsIgnoreCase(reverse(s));
  }

  static int countOccurrences(String s, String s1) {
    int cnt = 0;
    for(int i = 0; i < s.length(); i++) {
      int f = s.indexOf(s1, i);
      if(f >= 0) {
        cnt++;
        i = f;
      }
    }
    return cnt;
  }

  static int countSpaces(String s) {
    int cnt = 1;
    for(int i = 0; i < s.length(); i++) {
      if(s.indexOf(" ", i) >= 0) {
        cnt++;
        i = s.indexOf(" ", i) + 1;
      }
    }
    return cnt;
  }

  static String removeLeadingAndTrailingSpaces(String s) {
    int begin = 0;
    int end = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) != ' ') {
        begin = i;
        break;
      }
    }
    for(int i = s.length() - 1; i >= 0; i--) {
      if(s.charAt(i) != ' ') {
        end = i;
        break;
      }
    }
    return s.substring(begin, end + 1);
  }
  
}
  