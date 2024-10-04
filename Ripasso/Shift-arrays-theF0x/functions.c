#include <math.h>
#include <stdio.h>

/*
Funzione che copia tutti gli elementi dell'array sorgente nell'array
destinazione spostandoli di una posizione a sinistra. L'elemento più a sinistra
verrà spostato a destra. Ad esempio, dall'array:

src = { 1, 2, 3, 4, 5 }

vogliamo ottenere l'array:

dst = { 2, 3, 4, 5, 1 }
*/
void leftShift(int src[], int dst[], int n) {
  for (int i = 1; i < n; i++) {
    dst[i - 1] = src[i];
  }
  dst[n - 1] = src[0];
}

/*
Come la funzione precedente ma gli elementi vengono spostati nell'array di
partenza e non in un nuovo array.
*/
void leftShiftInPlace(int src[], int n) {
  int temp = src[0];
  for (int i = 0; i < n - 1; i++) {
    src[i] = src[i + 1];
    }
  src[n-1] = temp;
}

/*
Funzione che copia tutti gli elementi dell'array sorgente nell'array
destinazione spostandoli di una posizione a destra. L'elemento più a destra
verrà spostato a sinistra. Ad esempio, dall'array:

src = { 1, 2, 3, 4, 5 }

vogliamo ottenere l'array:

dst = { 5, 1, 2, 3, 4 }
*/
void rightShift(int src[], int dst[], int n) {
  for( int i = 0; i < n-1; i++) {
    dst[i+1] = src[i];
  }
    dst[0] = src[n-1];
}

/*
Come la funzione precedente ma gli elementi vengono spostati nell'array di
partenza e non in un nuovo array.
*/
void rightShiftInPlace(int src[], int n) {
  int temp = src[n-1];
  for (int i = n - 1; i > 0; i--) {
    src[i] = src[i - 1];
    }
  src[0] = temp;
}
