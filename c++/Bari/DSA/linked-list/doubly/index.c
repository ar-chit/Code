#include <stdio.h>
#include <stdlib.h>

struct Node {
  struct Node *prev;
  int data;
  struct Node *next;
} *first = NULL;

void create(int A[], int n) {
  first = (struct Node *)malloc(sizeof(struct Node));
  first->data = A[0];
  first->prev = first->next = NULL;
  struct Node *last = first;

  for (int i = 1; i < n; i++) {
    struct Node *t = (struct Node *)malloc(sizeof(struct Node));
    t->data = A[i];
    t->next = last->next;
    t->prev = last;
    last->next = t;
    last = t;
  }
}

void Display(struct Node *p) {
  while (p) {
    printf("%d ", p->data);
    p = p->next;
  }
  printf("\n");
}

int Length(struct Node *p) {
  int length = 0;
  while (p) {
    length++;
    p = p->next;
  }

  return length;
}

void Insert(struct Node *p, int x, int index) {
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  newNode->data = x;
  if (index == 0) {
    newNode->prev = NULL;
    newNode->next = p;
    p->prev = newNode;
    first = newNode;
  } else {
    for (int i = 1; i < index; i++) {
      p = p->next;
    }

    struct Node *prevNode = p;
    struct Node *nextNode = p->next;

    newNode->prev = prevNode;
    prevNode->next = newNode;

    newNode->next = nextNode;
    if (nextNode) {
      nextNode->prev = newNode;
    }
  }
}

void Delete(struct Node *p, int index) {
  if (index == 0) {
    struct Node *toDelete = p;
    first = p->next;
    toDelete->next = NULL;
    first->prev = NULL;
    free(toDelete);
  } else {
    for (int i = 1; i < index; i++) {
      p = p->next;
    }

    struct Node *prev = p;
    struct Node *toDelete = p->next;
    struct Node *next = toDelete->next;

    toDelete->prev = NULL;
    toDelete->next = NULL;

    prev->next = next;
    if (next) {
      next->prev = prev;
    }

    free(toDelete);
  }
}

void Reverse(struct Node *p) {
  while (p) {
    struct Node *temp = p->next;
    p->next = p->prev;
    p->prev = temp;

    p = p->prev;
    if (p && p->next == NULL) {
      first = p;
    }
  }
}

int main() {
  int A[] = {10, 20, 30, 40, 50};
  create(A, 5);

  Display(first);
  // Insert(first, 100, 5);
  // Delete(first, 3);
  Reverse(first);
  Display(first);

  return 0;
}