# Recursion and iteration (in Java)

## Algoritmi iterativi e algoritmi ricorsivi:

* Tutto ciò che può essere scritto in modo iterativo (con un ciclo) può essere scritto in modo ricorsivo.
* Tutto ciò che può essere scritto in modo ricorsivo può essere scritto in modo iterativo.

## Qual è il più facile da scrivere?

* A volte la versione ricorsiva di un problema è più semplice da scrivere di quella iterativa
* A volte la versione iterativa di un problema è più semplice da scrivere di quella ricorsiva

## Efficienza

* La versione ricorsiva di un algoritmo è quasi sicuramente più inefficiente di quella iterativa.

## Funzioni ricorsive

Una funzione ricorsiva è una funzione che richiama se stessa. Perché una funzione ricorsiva sia scritta bene deve:

* avere uno o più casi base (casi in cui la funzione termina)
* tutti gli altri casi devono richiamare la stessa funzione su una versione semplificata del problema
* a volte devo adeguare la firma di una funzione per poterla scrivere in modo ricorsivo

## Esempio - Il fattoriale

Il fattoriale di 5 è: 5! = 5 * 4 * 3 * 2 * 1.

In generale, il fattoriale di n è: n! = n * n-1 * n-2 * ... * 2 * 1.

Il fattoriale di 5 può anche essere scritto come: 5! = 5 * 4! e il fattoriale di n come: n! = n * (n-1)!

Scritta così, questa definizione è incompleta perché andrebbe avanti all'infinito, per cui mi serve un caso in cui questa ricorsione termina (detta il caso base). Nel nostro caso è: 1! = 1

Quindi il fattoriale può essere definito come:

1! = 1

n! = n * (n-1)

Da cui, la funzione scritta in C è:

```C
static int fattoriale(n) {
  if (n == 1) {
    return 1;
  } else {
    return n * fattoriale(n-1);
  }
}
```

## Esercizi

Scrivere funzioni ricorsive che risolvano i seguenti problemi:

* funzione che prenda in input un array e lo stampi dal primo all'ultimo elemento
* funzione che prenda in input un array e lo stampi dall'ultimo al primo elemento
* funzione che prenda in input un array e ne sommi gli elementi
* funzione che prenda in input un array e restituisca `true` se tutti i suoi elementi sono pari e `false` altrimenti
* funzione che prenda in input un array e restituisca `true` se è palindromo e `false` altrimenti