#include <stdio.h>
#include <stdbool.h>

/*
Questa funzione prende due stringhe, s1 ed s2 e un indice.
Se la stringa s2 è contenuta in s1 a partire dall'indice from, restituisce true, altrimenti false.
Quindi confronto il carattere 0 di s2 con il carattere from di s1, poi il carattere 1 di s2 con il carattere from+1 di s1 e così via.
Esempio:
s1 = "Nel mezzo del cammin di nostra vita"
s2 = "mezzo"
from = 4
*/
bool contains(char s1[], char s2[], int from) {
  for(int i = 0; s2[i] != '\0'; i++) {
    if (s1[from+i] != s2[i]) {
      return false;
    }
  }
  return true;
}

int find(char s1[], char s2[]) {
  for(int i = 0; s1[i] != '\0'; i++) {
    if (contains(s1, s2, i)) {
      return i;
    }
  }
  return -1;
}
