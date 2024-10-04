# String

In Java le stringhe sono delle classi (anche se all'interno contengono comunque un array di charatteri).

Per creare una stringa posso fare:

```Java
// versione esplicita, scomoda
String s = new String("Ciao");
// versione implicita, comoda
String s = "Ciao";
```

Posso vedere la lunghezza della stringa con il metodo `length()` (da non confondere con l'attributo length degli array!):

```Java
String s1 = "Ciao a tutti";
System.out.printf("La strings '%s' è  lunga %d\n", s1, s1.length());
```

Posso concatenare stringhe con l'operatore `+`:

```Java
String s1 = "Ciao";
String s2 = " "
String s3 = "mondo"
String s = s1 + s2 + s3;
System.out.println(s);
```

Se voglio prendere l'i-esimo carattere della stringa devo usare il metodo `charAt`:

```Java
String s1 = "Ciao a tutti";
// prendo il carattere in posizione 5
char c = s1.charAt(5);
```

**Le stringhe sono immutabili, per cui non esistono metodi per modificarle.** Ci sono però molti metodi che restituiscono versioni modificate della stringa attuale.

Qui di seguito alcuni dei metodi più utili della classe `String`:

* `int length()`
  * Restituisce la lunghezza della stringa, ovvero il numero di caratteri al suo interno.
* `char charAt(int index)`
  * Restituisce il carattere alla posizione specificata nell'indice. L'indice inizia da zero.
* `String concat(String str)`
  * Concatena la stringa specificata `str` alla fine della stringa corrente e restituisce una nuova stringa.
* `String substring(int beginIndex)`
  * Restituisce una sottostringa iniziando dalla posizione specificata `beginIndex` fino alla fine della stringa.
* `String substring(int beginIndex, int endIndex)`
  * Restituisce una sottostringa che inizia dalla posizione `beginIndex` e va fino (ma non include) alla posizione `endIndex`.
* `boolean equals(Object another)`
  * Verifica se la stringa è uguale a un altro oggetto. Restituisce `true` se le stringhe sono uguali, false altrimenti.
* `boolean equalsIgnoreCase(String another)`
  * Verifica se la stringa è uguale a un'altra stringa ignorando le differenze tra maiuscole e minuscole.
* `int indexOf(String str)`
  * Restituisce l'indice della prima occorrenza della sottostringa specificata, o -1 se la sottostringa non è presente nella stringa.
* `int indexOf(String str, int fromIndex)`
  * Cerca la prima occorrenza della sottostringa specificata `str` a partire dalla posizione `fromIndex` all'interno della stringa chiamante. Restituisce l'indice della prima occorrenza trovata o -1 se la sottostringa non è presente dalla posizione specificata in poi.
* `String toUpperCase()`
  * Restituisce una nuova stringa con tutti i caratteri convertiti in maiuscolo.
* `String toLowerCase()`
  * Restituisce una nuova stringa con tutti i caratteri convertiti in minuscolo.
* `int compareTo(String anotherString)`
  * Confronta la stringa chiamante con un'altra stringa (`anotherString`). Restituisce un valore intero che indica la relazione tra le due stringhe. Un valore negativo indica che la stringa chiamante è minore, zero indica che sono uguali, e un valore positivo indica che la stringa chiamante è maggiore.

## Esercizi (metodi statici nel main)

* scrivere un metodo statico `printVertically` che prenda in input una stringa e la stampi verticalmente, ovvero un carattere sotto l'altro. L'idea è quella di ciclare su tutti i caratteri (usando i metodi `length` e `charAt`) e stampando ogni singolo carattere e andando a capo.
* scrivere un metodo statico `reverse` che prenda in input una stringa e restituisca una nuova stringa che è l'inverso della prima.
* Scrivere un metodo statico `acronym` che prenda in input una frase e ne costruisca l'acronimo. Ad esempio, ricevendo in input la frase "Nel mezzo del cammin di nostra vita" restituirà "N.M.D.C.D.N.V.". Usare il metodo `indexOf` per cercare gli spazi e di conseguenza individuare le parole, il metodo `substring` per prendere la prima lettera di una parola, il metodo `toUpperCase` per rendere la parola maiuscola e l'operatore `+` per concatenare.
* Scrivere un metodo statico `concat` che accetti un array di stringhe e le concateni tutte in un'unica stringa.
* Scrivere un metodo statico `isPalindrome` che accetti una stringa e restituisca `true` se è palindroma (la stringa è uguale quando è letta al contrario), altrimenti restituisca `false`.
* Scrivere un metodo statico `countOccurrences` che accetti una stringa e una sottostringa, e restituisca il numero di occorrenze della sottostringa nella stringa principale.
* Scrivere un metodo statico `countSpaces` che accetti una stringa e restituisca il numero di parole presenti in essa. Si può assumere che le parole siano separate da spazi.
* Scrivere un metodo statico `removeLeadingAndTrailingSpaces` che accetti una stringa e restituisca una nuova stringa in cui gli spazi bianchi iniziali e finali sono rimossi.