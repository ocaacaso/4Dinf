public class InfiniteIntArray {
  private int array[];
  private int size;

  /*
   * Il costruttore non prende alcun parametro e crea un array di 10 elementi.
   * L'attributo size all'inizio è a 0
   */
  public InfiniteIntArray() {
    this.array = new int[10];
    size = 0;
  }

  /*
   * Questo metodo viene chiamato quando viene richiesto di aggiungere uno o più
   * elementi ma l'array è pieno. Il metodo dovrà creare un nuovo array, copiare
   * tutti gli elementi del vecchio array in quello nuovo e sostituire il vecchio
   * array con quello nuovo.
   */
  private void expandArray() {
    int[] temp = new int[this.array.length * 2];
    for (int i = 0; i < this.array.length; i++) {
      temp[i] = this.array[i];
    }
    this.array = temp;
  }

  /* Aggiunge un elemento alla lista. */
  public void add(int e) {
    if (size == array.length) {
      expandArray();
      array[size] = e;
      size++;
    } else {
      array[size] = e;
      size++;
    }
  }

  /* Restituisce l'elemento in una determinata posizione */
  public int get(int index) {
    return array[index];
  }

  /*
   * Rimuove l'elemento in una determinata posizione e compatta gli elementi
   * successivi (left shift). Infine restituisce l'elemento rimosso
   */
  public int remove(int index) {
    int t = array[index];
    for (int i = index; i < size; i++) {
      array[i] = array[i + 1];
    }
    size--;
    return t;
  }

  /* Restituisce la dimensione attuale della lista */
  public int size() {
    return size;
  }

  /* Verifica se la lista è vuota */
  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

  /*
   * Aggiunge tutti gli elementi dalla lista specificata alla fine di questa lista
   */
  public void addAll(InfiniteIntArray list) {
    for (int i = 0; i < list.size; i++) {
      add(list.array[i]);
    }
  }

  /*
   * Rimuove tutti gli elementi presenti nella lista specificata da questa lista e
   * restituisce il numero di elementi rimossi
   */
  public int removeAll(InfiniteIntArray list) {
    int cnt = 0;
    for (int i = 0; i < list.size; i++) {
      remove(list.array[i]);
      cnt++;
    }
    return cnt;
  }
}