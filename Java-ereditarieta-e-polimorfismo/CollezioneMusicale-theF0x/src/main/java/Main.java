public class Main {
  public static void main(String[] args) {
    CD ciao = new CD();
    Canzone c1 = new Canzone("Non lo so", "Franco Battiato");
    Canzone c2 = new Canzone("Non lo so", "Franco Battiato");
    Canzone c3 = new Canzone("Non lo so", "Franco Battiato");
    ciao.aggiungiCanzone(c1);
    ciao.aggiungiCanzone(c2);
    ciao.aggiungiCanzone(c3);

    CD ciaoo = new CD();
    ciaoo.aggiungiCanzone(c1);
    ciaoo.aggiungiCanzone(c2);
    ciaoo.aggiungiCanzone(c3);

    CollezioneMusicale cm = new CollezioneMusicale();
    cm.aggiungiSupporto(ciao);
    cm.aggiungiSupporto(ciaoo);

    System.out.println(cm);
  }
}