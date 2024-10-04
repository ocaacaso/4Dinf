#include <stdbool.h>
#include <stdio.h>

#define MAX_ITEMS 100

// Struct for a menu item
typedef struct {
  // TODO
} MenuItem;

/*
funzione che legge il file contenente gli item del menu e li carica nell'array items.
Importante: La funzione restituisce il numero di item caricati
*/
int loadMenuItems(MenuItem items[]) {
  // TODO
  return -1;
}

/* funzione che stampa un singolo item */
void printMenuItem(int i, MenuItem item) {
  // TODO
}

/* funzione che stampa tutto il menu */
void printMenu(MenuItem items[], int n) {
  // TODO
}

/* funzione che prende l'array degli item del menu e l'array degli item selezionati.
La funzione chiederà all'utente di scegliere dei piatti e li inserirà nell'array selectedItem.
Importante: la funzione restituisce il numero di item selezionati.
*/
int chooseDishes(MenuItem menuItems[], int n, MenuItem selectedItems[]) {
  // TODO
  return -1;
}

/* funzione che stampa il conto mostrando i piatti scelti e calcolandone il totale */
void printBill(MenuItem items[], int n) {
  // TODO
}

int main(void) {
  
  return 0;
}