#include <math.h>
#include <stdio.h>

#define MAX 100

/*
Funzione che conta il numero di studenti bocciati (viene considerato bocciato uno studente che ha almeno una materia con voto inferiore a 6).

grades rappresenta una matrice di voti, come ad esempio

  6 7 5 3 8
  6 6 7 8 9
  6 6 6 7 5
  6 7 8 7 8

s rappresenta il numero di studenti (le righe)
g rappresenta il numero di voti (le colonne)

Nell'esempio proposto la funzione deve restituire 2.
*/
int countFailingStudents(int grades[MAX][MAX], int s, int g) {
  // TODO
}

/*
Funzione che conta il numero di materie facili, ovvero dove tutti gli studenti hanno voto positivo. Nella matrice di esempio la funzione restituirà 2 (le materie alle colonne 0 e 1).
*/
int countEasySubjects(int grades[MAX][MAX], int s, int g) {
  // TODO
}

/*
Funzione che copia nell’array `students` di dimensione `s` il numero di materie insufficienti per ogni studente. Partendo dalla matrice di esempio, l’array `students` avrà dimensione 4 e conterrà i valori { 2, 0, 1, 0 }.
*/
void copyFailedSubjectsPerStudent(int grades[MAX][MAX], int s, int g, int students[]) {
  // TODO
}
