#include <stdio.h>
#include <stdlib.h>

struct Node {
  int data;
  struct Node *next;
} *Head;

void create(int A[], int n) {
  struct Node *t, *last;
  Head = (struct Node *)malloc(sizeof(struct Node));
  Head->data = A[0];
  Head->next = Head;
  last = Head;

  for (int i = 1; i < n; i++) {
    t = (struct Node *)malloc(sizeof(struct Node));
    t->data = A[i];
    t->next = last->next;
    last->next = t;
    last = t;
  }
}

void Display(struct Node *h) {
  do {
    printf("%d ", h->data);
    h = h->next;
  } while (h != Head);
  printf("\n");
}

void RDisplay(struct Node *h) {
  static int flag = 0;
  if (h == Head && flag != 0) {
    flag = 0;
    printf("\n");
    return;
  }
  printf("%d ", h->data);
  flag++;
  RDisplay(h->next);
}

void Insert(struct Node *h, int x, int index) {
  for (int i = 0; i < index; i++) {
    h = h->next;
  }

  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  newNode->data = x;
  newNode->next = h->next;
  h->next = newNode;
}

void Delete(struct Node *h, int index) {
  for (int i = 0; i < index - 1; i++) {
    h = h->next;
  }

  if (index == 0) {
    while (Head != h->next) {
      h = h->next;
    }
    // printf("%d ", h->data);
    struct Node *toDelete = h->next;
    Head = toDelete->next;
    h->next = h->next->next;

    free(toDelete);
  } else {
    struct Node *toDelete = h->next;

    h->next = h->next->next;

    free(toDelete);
  }
}

int main() {
  int A[] = {2, 3, 4, 5, 6};
  create(A, 5);
  Display(Head);
  // RDisplay(Head);
  // Insert(Head, 10, 5);
  Delete(Head, 0);
  Display(Head);
  return 0;
}