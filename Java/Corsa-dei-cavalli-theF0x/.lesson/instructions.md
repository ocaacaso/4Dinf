# Instructions  

Sette cavalli partecipano ad una gara di trotto che si svolge su un percorso di 5 km.

La velocità  di andatura di ogni cavallo può variare ogni 100 metri assumendo valori compresi fra 45 e 60 km/h (45, 46, 47, 48.........60 ).

Al termine della gara dobbiamo stabilire l'ordine di arrivo dei 7 cavalli.

E' richiesta la progettazione classi tramite diagramma UML.

```JAVA
// Esempio di generazione di un numero casuale intero compreso fra min e max

import java.util.*;
public class Casuale{    
  public static void main(String[] args) {
    int min = 50; // numero minimo
    int max = 500; // numero massimo
    int diff = ((max-min) + 1);
    Random random = new Random();
    int num = random.nextInt(diff) + min;
    System.out.println(num);
  }    
}
```

```JAVA
// Esempio di ordinamento
public static void bubbleSort(int[] v) {  
  int n = v.length;  
  int temp = 0;  
  for(int index=0; index < n; index++){  
    for(int j=1; j < (n-index); j++){  
      if(v[j-1] > v[j]){  
        //scambia elementi
        temp = v[j-1];  
        v[j-1] = v[j];  
        v[j] = temp;  
      }  
    }  
  }  
}
```