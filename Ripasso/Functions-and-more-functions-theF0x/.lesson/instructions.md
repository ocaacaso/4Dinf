# Functions and more functions

Vogliamo imparare a scrivere funzioni! Le funzioni sono di due tipi:

* quelle che restituiscono un risultato (funzioni non void)
* quelle che non restituiscono un risultato (funzioni void)

Inoltre vogliamo distinguere:

* la definizione di una funzione (con la sua firma)
* l'invocazione della funzione

Nell'invocazione delle funzioni non void vogliamo inoltre salvare il risultato della funzione per utilizzarlo successivamente nel programma.

## Esercizi

Per ogni esercizio scrivere una funzione e poi richiamarla nel `main`.

Se la funzione restituisce un risultato, il risultato va salvato su una variabile e poi va stampato.

Ogni funzione deve essere richiamata nel `main` due volte, con variabili differenti.

**N.B. Non ci interessa chiedere i valori all'utente, per cui non useremo `scanf`.**

* Scrivere una funzione che trasformi i gradi in radianti. La formula per trasformare gradi in radianti è `r = g / 180 * M_PI, dove r sono i radianti, g sono i gradi e M_PI è il valore di pi greco).
* Scrivere una funzione che prenda due numeri e restituisca `true` se il secondo numero è multiplo del primo e `false` altrimenti.
* Scrivere una funzione che prenda come argomenti ore, minuti e secondi e restituisca il numero totale di secondi
* Scrivere una funzione che prenda come argomenti ore, minuti e secondi più un quarto argomento secondi e restituisca `true` se il numero totale di secondi dei primi tre argomenti è maggiore dei secondi del quarto argomento e `false` altrimenti
* Scrivere una funzione che prenda in input un array di interi, la dimensione dell'array e sommi tutti i valori dell'array.
* Scrivere una funzione che prenda in input un array di interi, la dimensione dell'array e un ulteriore valore di tipo intero e restituisca `true` se la somma di tutti i valori dell'array è maggiore dell'ultimo argomento passato e `false` altrimenti.