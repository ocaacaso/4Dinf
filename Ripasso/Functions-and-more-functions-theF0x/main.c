#include <stdio.h>
#include <math.h>
#include <stdbool.h>


float degreesToRadiants(int a){
  float r = a / (180 * M_PI);
  return r;
}

bool checkMultiple(int a, int b) {
  if(a%b == 0) {
    printf("True\n");
    return true;
  }
  else{
    printf("False\n");
    return false;
  }
}

int countSeconds(int hours, int minutes, int seconds) {
  int tot = 0;
  tot += seconds;
  tot += minutes*60;
  tot += hours*3600;

  return tot;
}

bool compareSeconds(int a, int b, int c, int d) {
  int n = countSeconds(a, b, c);
  if(n > d) {
    printf("True\n");
    return true;
  }
  else{
    printf("False\n");
    return false;
  }
}

int addInt(int n){
  int ns[n];
  int tot = 0;
  for(int i = 0; i < n; i++) {
    ns[i] = (i + 1) * (i + 1);
    tot = tot + ns[i];
  }
  printf("Total: %d\n", tot);
  return tot;
}

bool compareArray(int n, int m) {
  int a = addInt(n);
  if(a > m) {
    printf("True\n");
    return true;
  }
  else{
    printf("False\n");
    return false;
  }
}

int main() {

  printf("Prima funzione: \n");
  printf("%f\n", degreesToRadiants(90));
  printf("%f\n", degreesToRadiants(120));

  printf("\nSeconda funzione: \n");
  checkMultiple(10, 2);
  checkMultiple(20, 3);

  printf("\nTerza funzione: \n");
  printf("%d\n", countSeconds(3, 30, 57));
  printf("%d\n", countSeconds(2, 50, 23));

  printf("\nQuarta funzione: \n");
  compareSeconds(3, 30, 57, 2000);
  compareSeconds(2, 50, 23, 30000);
  
  printf("\nQuinta funzione: \n");
  int e = addInt(5);
  int f = addInt(3);

  printf("\nSesta funzione: \n");
  compareArray(5, 39);
  compareArray(3, 20);

  
  return 0;
}