#include <stdio.h>

int fattoriale(n) {
  if (n == 1) {
    return 1;
  } else {
    return n * fattoriale(n-1);
  }
}

int main(void) {
  printf("Il fattoriale di 5 è %d\n", fattoriale(5));
  return 0;
}