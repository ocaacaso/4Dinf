#include <stdio.h>
#include <stdbool.h>

int countDivisors(int number) {
  int c=0;
  for(int i=2; i<number; i++) {
    if(number % i ==0) {
      c++;
    }
  }
  return c;
}