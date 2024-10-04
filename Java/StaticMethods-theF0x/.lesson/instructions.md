# Metodi statici

* Nella programmazione ad oggetti le funzioni vengono chiamate metodi. Per lavorare in modo _imperativo/procedurale_ (come siamo abituati in C) dobbiamo usare dei metodi statici.

* Ogni cosa in Java è contenuto in una classe, anche il `main` (che nel nostro caso è in una classe chiamata `Main`).

```Java
public class Main {
  public static void main(String args[]) {
    ...
  }
}
```

* Il linguaggio Java offre i seguenti tipi:
  * `int`: intero a 32 bit
  * `long`: intero a 64 bit
  * `short`: intero a 16 bit
  * `float`: virgola mobile a 32 bit
  * `double`: virgola mobile a 64 bit
  * `byte`: valore compreso tra -128 e +127
  * `boolean`: vero o falso
  * `char`: un carattere Unicode a 16 bit

* Per stampare su console si usano i comandi:
  * `System.out.print()`: stampa senza andare a capo
  * `System.out.println()`: stampa e va a capo
  * `System.out.printf()`: simile al printf di C

* le funzioni del C diventano metodi statici:

```Java
public class Main {
  ...
  static void f1() {
    ...
  }

  static int f2() {
    ...
  }
}
```


## Esercizi

* Scrivere un metodo statico che trasformi i gradi in radianti. La formula per trasformare gradi in radianti è `r = g / 180 * Math.PI`, dove r sono i radianti, g sono i gradi e Math.PI è il valore di pi greco). Il metodo restituirà un `double`.
* Scrivere metodo statico che prenda due numeri e restituisca `true` se il secondo numero è multiplo del primo e `false` altrimenti.
* Scrivere una metodo statico che prenda come argomenti ore, minuti e secondi e restituisca il numero totale di secondi
* Scrivere metodo statico che prenda come argomenti ore, minuti e secondi più un quarto argomento secondi e restituisca `true` se il numero totale di secondi dei primi tre argomenti è maggiore dei secondi del quarto argomento e `false` altrimenti