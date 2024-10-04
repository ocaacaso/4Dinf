#include <stdbool.h>
#include <stdio.h>

bool checkPrimeNumber(int number) {
  for(int i = 2; i < number; i++) {
    if(number % i == 0) {
      return false;
    }
  }
  return true;
}

int countPrimeNumbersInRange(int from, int to) {
  int c = 0;
  for(int i = from; i <= to; i++) {
    if(checkPrimeNumber(i)==true) {
      c++;
    }
  }
  return c;
}