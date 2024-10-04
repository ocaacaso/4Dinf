#include <stdbool.h>
#include <stdio.h>

bool checkPrimeNumber(int number) {
  for (int i = 2; i <= number / 2; i++) {
    if (number % i == 0) {
      return false;
    }
  }
  return true;
}

int countPrimeNumbersInRange(int from, int to) {
  int count = 0;
  for (int i = from; i <= to; i++) {
    if (checkPrimeNumber(i)) {
      count++;
    }
  }
  return count;
}