# Passing and failing students  

La matrice `grades` è una matrice che contiene i voti di `s` studenti (le righe) per `g` materie (le colonne). Qui di seguito un esempio di una matrice con `s = 4` e `g = 5`:

    6 7 5 3 8
    6 6 7 8 9
    6 6 6 7 5
    6 7 8 7 8

1. Scrivere una funzione con firma `int countFailingStudents(int grades[MAX][MAX], int s, int g)` che conti il numero di studenti bocciati (viene considerato bocciato uno studente che ha almeno una materia con voto inferiore a 6). Nella matrice di esempio la funzione restituirà 2 (gli studenti alle righe 0 e 2).
2. Scrivere una funzione con firma `int countEasySubjects(int grades[MAX][MAX], int s, int g)` che conti il numero di materie dove tutti gli studenti hanno voto positivo. Nella matrice di esempio la funzione restituirà 2 (le materie alle colonne 0 e 1).
3. Scrivere una funzione `void copyFailedSubjectsPerStudent(int grades[MAX][MAX], int s, int g, int students[])` che copi nell’array `students` di dimensione `s` il numero di materie insufficienti per ogni studente. Partendo dalla matrice di esempio, l’array `students` avrà dimensione 4 e conterrà i valori { 2, 0, 1, 0 }.