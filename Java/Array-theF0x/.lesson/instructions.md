# Array

## Creazione/inizializzazione

In Java un array si può creare in più modi:

```Java
// creo array di 10 celle a 0
int a[] = new int[10];
// sintassi Java per array di 3 celle inizializzate
int a[] = new int[] { 1, 2, 3 };
// come sopra ma con sintassi simile al C
int a[] = { 1, 2, 3 };
```

## Utilizzo

L'utilizzo delle singole celle è uguale a quella del C:

```Java
...
a[0] = 10;
int c = a[3];
b[3] = a[2];
System.out.println(b[2]);
...
```

## Lunghezza dell'array

In Java gli array tengono la loro lunghezza nell'attributo length:

```Java
...
int a[] = { 1, 2, 3 };
...
System.out.println(a.length);
...
```

Questa attributo `length` è comodo per i cicli:

```Java
...
int a[] = { 1, 2, 3 };
...
for (int i = 0; i < a.length; i++) {
  ...
}
...
```

Di conseguenza non è più necessario passare la lunghezza dell'array nella firma delle funzioni/metodi:

```Java
...
void func(int a[]) {
  ...
  for (int i = 0; i < a.length; i++) {
    ...
  }
  ...
}
...
```

## Array come tipi di ritorno delle funzioni

A differenza del C, gli array possono essere restituiti da una funzione/metodo:

```Java
...
int[] func() {
  ...
  int a[] = new int[10];
  ...
  return a;
}
...
```

## Esercizi (metodi statici nel main)

* Scrivere una funzione che prenda in input un array di interi e lo stampi.
* Scrivere una funzione che prenda in input un array di interi e sommi tutti i valori dell'array.
* Scrivere una funzione che prenda in input due array di interi e ne restituisca la concatenazione. Se ad esempio abbiamo come input gli array { 3, 5, 2 } e { 1, 2, 3, 4, 5 }, l'array risultante sarà { 3, 5, 2, 1, 2, 3, 4, 5 }.
* Scrivere una funzione che prenda in input due array di interi (anche di dimensioni differenti) e che restituisca un terzo array che conterrà la somma cella per cella dei due array. Se ad esempio gli array in ingresso sono { 3, 5, 2 } e { 1, 2, 3, 4, 5 }, l'array risultante sarà { 4, 7, 5, 4, 5 }.
* Scrivere una funzione che prenda in input un array di interi e un array di booleani della stessa dimensione e restituisca un array di interi contenenti solo i valori che corrispondono alle celle contenenti `true`. Ad esempio, se in input abbiamo l'array { 4, 7, 5, 4, 5 } e l'array { true, true, false, true, false }, l'array restituito sarà { 4, 7, 4 }.