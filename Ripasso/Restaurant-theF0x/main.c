#include <stdbool.h>
#include <stdio.h>

#define MAX 100

// Struct for a menu item
typedef struct {
  char name[MAX];
  char desc[MAX]; // Item description
  float price;
} MenuItem;

/*
funzione che legge il file contenente gli item del menu e li carica nell'array
items. Importante: La funzione restituisce il numero di item caricati
*/
int loadMenuItems(MenuItem items[]) {
  int n = 0;
  FILE *pFile;
  pFile = fopen("files/menu_items.txt", "r");
  if (pFile == NULL) {
    return -1;
  }
  while (!feof(pFile)) {
    MenuItem mi;
    fscanf(pFile, "%99[^;];%99[^;];%f\n", mi.name, mi.desc, &mi.price);
    items[n] = mi;
    n++;
  }
  fclose(pFile);
  return n;
}

/* funzione che stampa un singolo item */
void printMenuItem(MenuItem mi, int i) {
  printf("%d- %s:\n%s.  %.2f\n\n", i + 1, mi.name, mi.desc, mi.price);
}

/* funzione che stampa tutto il menu */
void printMenu(MenuItem items[], int n) {
  int i;
  for (i = 0; i < n; i++) {
    printMenuItem(items[i], i);
  }
}

/* funzione che prende l'array degli item del menu e l'array degli item
selezionati. La funzione chiederà all'utente di scegliere dei piatti e li
inserirà nell'array selectedItem. Importante: la funzione restituisce il numero
di item selezionati.
*/
int chooseDishes(MenuItem items[], int n, MenuItem selectedItems[]) {
  int choice = 1, i = 1;
  printf("\n\n");
  while (choice != 0) {
    printf("Choose a dish (enter 0 to exit): ");
    scanf("%d", &choice);
    if (choice <= n) {
      selectedItems[i] = items[choice - 1];
      i++;
    } else {
      printf("Invalid option\n");
    }
  }
  return i;
}

/* funzione che stampa il conto mostrando i piatti scelti e calcolandone il
 * totale */
void printBill(MenuItem selectedItems[], int selectedDishes) {
  float bill = 0;
  printf("\nBill:");
  for (int i = 1; i < selectedDishes - 1; i++) {
    bill += selectedItems[i].price;
    printf("\n%s:\t\t%.2f", selectedItems[i].name, selectedItems[i].price);
  }
  printf("\n\nYour total is:\n%.2f", bill);
}

int main(void) {
  MenuItem items[MAX];
  int n = loadMenuItems(items);
  MenuItem selectedItems[MAX];

  printMenu(items, n);

  int selectedDishes = chooseDishes(items, n, selectedItems);

  printBill(selectedItems, selectedDishes);

  return 0;
}