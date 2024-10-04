public class Port {
  private Boat[] bs = new Boat[99];

  public boolean checkLength(Boat b1) {
    if (b1.length > 10) {
      return true;
    }
    return false;
  }

  public void print() {
    for (int i = 0; i < bs.length; i++) {
      if (bs[i] != null) {
        System.out.println((i + 1) + "- " + bs[i]);
      }
    }
  }

  public int addBoat(Boat b1) {
    boolean ctrl = false;
    int t = 0;

    if (checkLength(b1) == true) {
      if (b1.motor == Type.MOTOR) {
        for (int i = 20; i < bs.length; i++) {
          if (bs[i] == null) {
            bs[i] = b1;
            ctrl = true;
            t = i + 1;
            return t;
          }
        }
      } else if (b1.motor == Type.SAIL) {
        for (int i = 50; i < bs.length; i++) {
          if (bs[i] == null) {
            bs[i] = b1;
            ctrl = true;
            t = i + 1;
            return t;
          }
        }
      }
    }

    else {
      if (b1.motor == Type.MOTOR) {
        for (int i = 0; i < bs.length; i++) {
          if (bs[i] == null) {
            bs[i] = b1;
            ctrl = true;
            t = i + 1;
            return t;
          }
        }
      } else if (b1.motor == Type.SAIL) {
        for (int i = 0; i < 50; i++) {
          if (bs[i] == null) {
            bs[i] = b1;
            ctrl = true;
            t = i + 1;
            return t;
          }
        }
      }
    }
    throw new RuntimeException("Nessun posto disponibile");
  }

  public int removeBoat(String name, int gg) {
    int t = 0;
    for (int i = 0; i < bs.length; i++) {
      if (bs[i] != null && bs[i].name.equals(name)) {
        if (bs[i].motor == Type.SAIL) {
          t = (10 * bs[i].length) * gg;
          bs[i] = null;
          break;
        } else {
          t = (20 * bs[i].tonnage) * gg;
          bs[i] = null;
          break;
        }
      }
    }
    return t;
  }

  public void searchByPlace(int place) {
    if (bs[place - 1] != null) {
      System.out.println(bs[place - 1]);
    } else {
      throw new RuntimeException("Nessuna barca presente");
    }
  }

  public String[] groupByNationality(String nat) {
    int ctrl = 0;
    for (int i = 0; i < bs.length; i++) {
      if (bs[i] != null && bs[i].nationality.equals(nat)) {
        ctrl++;
      }
    }

    String[] bs2 = new String[ctrl];
    int j = 0;
    for (int i = 0; i < bs.length; i++) {
      if (bs[i] != null && bs[i].nationality.equals(nat)) {
        bs2[j] = bs[i].name;
        j++;
      }
    }
    return bs2;
  }

}