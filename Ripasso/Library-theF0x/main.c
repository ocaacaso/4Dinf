#include <stdio.h>
#include <stdbool.h>
#include <string.h>

#define MAX 1

typedef struct {
  int isbn;
  char title[20];
  char author[20];
  char publisher[20];
  int yof; // year of release
} Book;

void getInformation(Book books[], int i) {
  printf("Insert ISBN code: ");
  scanf("%d", &books[i].isbn);

  printf("Insert title: ");
  scanf("%s", books[i].title);

  printf("Insert author name: ");
  scanf("%s", books[i].author);

  printf("Insert publisher: ");
  scanf("%s", books[i].publisher);

  printf("Insert year of release: ");
  scanf("%d", &books[i].yof);

  printf("\n\n");
}

void printInformation(Book books[], int i) {
  printf("ISBN: %d\n", books[i].isbn);
  printf("Title: %s\n", books[i].title);
  printf("Author: %s\n", books[i].author);
  printf("Publisher: %s\n", books[i].publisher);
  printf("Year of release: %d\n\n", books[i].yof);
}

void printByCode(Book books[], int ask_code) {
  printf("Insert ISBN code: ");
  scanf("%d", &ask_code);
  bool found = false;
  for (int i = 0; i < MAX; i++) {
    if (books[i].isbn == ask_code) {
      found = true;
      printInformation(books, i);
    }
    break;
  }
  if(found == false) {
     printf("ISBN code not found\n\n");
  }
}

void printByTitle(Book books[], char ask_title[]) {
  printf("Insert book title: ");
  scanf("%s", ask_title);
  bool found = false;
  for (int i = 0; i < MAX; i++) {
    if(strcmp(books[i].title, ask_title) == 0) {
      printInformation(books, i);
      found = true;
      break;
    }
  }
  if (found == false) {
    printf("title not found\n");
  }
}

int main(void) {
  int ask_code;
  char ask_title[20];
  Book books[MAX];
  
  for (int i = 0; i < MAX; i++) {
    printf("Book n°%d\n", i + 1);
    getInformation(books, i);
  }
  
  for (int i = 0; i < MAX; i++) {
    printf("Book n°%d\n", i + 1);
    printInformation(books, i);
  }
  
  printByCode(books, ask_code);

  printByTitle(books, ask_title);
  return 0;
}