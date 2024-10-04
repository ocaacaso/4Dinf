#include <stdbool.h>
#include <stdio.h>

/*
Questa funzione prende una stringa e un carattere e restituisce true se quel
carattere è contenuto nella stringa.

Esempio 1:
s = "Nel mezzo del cammin di nostra vita"
c = "m"
restituisce true

Esempio 1:
s = "Nel mezzo del cammin di nostra vita"
c = "q"
restituisce false
*/
bool containsLetter(char s[], char c) {
  int i = 0;
 for(int i = 0; s[i] != '\0'; i++) {
    if (s[i] == c) {
      return true;
    }
  }
  return false;
}

/*
Questa funzione prende due stringhe e conta quante lettere della prima stringa
sono contenute nella seconda. Per farlo viene utilizzata la funzione precedente.

Esempio 1:
s1 = "PIPPO"
s2 = "PIPPICALZELUNGHE"
restituisce 4 (sono presenti 'P', 'I', 'P' e 'P', ma non 'O').

Esempio 1:
s1 = "PIPPICALZELUNGHE"
s2 = "PIPPO"
restituisce 5 (sono presenti 'P', 'I', 'P' e 'P', 'I' ma non tutte le altre
lettere).
*/
int countLetters(char s1[], char s2[]) {
  int cnt = 0;
  for(int i = 0; s1[i] != '\0'; i++) {
    if(containsLetter(s2, s1[i]) == true)
      cnt++;
  }
  return cnt;
}
