#include <math.h>
#include <stdio.h>

/*
funzione che conta quanti valori di v sono compresi tra a e b (inclusi)
*/
int es7(int v[], int n, int a, int b) {
  int c = 0;
  for(int i = 0; i < n; i++) {
    if(v[i] <= b && v[i] >= a) {
        c++;
      }
  }
  return c;
}

/*
funzione che conta quanti valori di v NON sono compresi tra a e b (inclusi)
*/
int es8(int v[], int n, int a, int b) {
  int c = 0;
  for(int i = 0; i < n; i++) {
    if(!(v[i] <= b && v[i] >= a)) {
      c++;
    }
  }
  return c;
}

/*
funzione che conta quanti valori di v sono compresi tra a e b (inclusi) oppure
tra c e d (inclusi)
*/
int es9(int v[], int n, int a, int b, int c, int d) {
  int cnt = 0;
  for(int i = 0; i < n; i++) {
    if(v[i] >= a && v[i] <= b || v[i] >= c && v[i] <=d) {
      cnt++;
    }
  }
  return cnt;
}

/*
funzione che conta quanti valori di v NON sono compresi tra a e b (inclusi)
oppure tra c e d (inclusi)
*/
int es10(int v[], int n, int a, int b, int c, int d) {
  int cnt = 0;
  for(int i = 0; i < n; i++) {
    if(!(v[i] >= a && v[i] <= b || v[i] >= c && v[i] <=d)) {
      cnt++;
    }
  }
  return cnt;
}
