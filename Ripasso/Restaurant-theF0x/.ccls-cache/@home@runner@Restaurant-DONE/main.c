#include <stdbool.h>
#include <stdio.h>

#define MAX_ITEMS 100

// Struct for a menu item
typedef struct {
  char name[100];
  char description[100];
  float price;
} MenuItem;

/*
funzione che legge il file 
*/
int loadMenuItems(MenuItem items[]) {
  FILE *file = fopen("files/menu_items.txt", "r");
  if (file == NULL) {
    perror("Error opening file");
    return 1;
  }

  int n = 0;
  while (!feof(file)) {
    MenuItem item;
    fscanf(file, "%99[^;];", item.name);
    fscanf(file, "%99[^;];", item.description);
    fscanf(file, "%f\n", &item.price);
    items[n++] = item;
  }

  fclose(file);

  return n;
}

void printMenuItem(int i, MenuItem item) {
  printf("%d)\n%s\n%s\n$%.2f\n", i, item.name, item.description, item.price);
}

void printTotal(MenuItem items[], int n) {
  float total = 0;
  printf("The bill\n");
  for (int i = 0; i < n; i++) {
    printMenuItem(i + 1, items[i]);
    total += items[i].price;
  }
  printf("Total: %f\n", total);
}

void printMenu(MenuItem items[], int n) {
  printf("Welcome to the restaurant menu!\n");
  printf("Here are the available items:\n\n");

  for (int i = 0; i < n; i++) {
    printMenuItem(i + 1, items[i]);
  }
}

int chooseDishes(MenuItem menuItems[], int n, MenuItem selectedItems[]) {
  int selectedItemsNum = 0;
  int choice = -1;
  while (choice != 0) {
    if (selectedItemsNum == 0) {
      printf("Choose one dish ");
    } else {
      printf("Choose another dish ");
    }
    printf(" (0 to exit): ");
    scanf("%d", &choice);
    if (choice < 0 || choice > n) {
       printf("Invalid option\n");
    } else if (choice != 0) {
      selectedItems[selectedItemsNum++] = menuItems[choice-1];
    }
  }
  printf("\n");
  return selectedItemsNum;
}

int main(void) {
  MenuItem menuItems[MAX_ITEMS];
  int menuItemsNum = loadMenuItems(menuItems);

  printMenu(menuItems, menuItemsNum);

  MenuItem selectedItems[MAX_ITEMS];
  int selectedItemsNum = chooseDishes(menuItems, menuItemsNum, selectedItems);

  printTotal(selectedItems, selectedItemsNum);
  return 0;
}