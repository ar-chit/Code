#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

struct Node {
  struct Node *next;
  int data;
} *top = NULL;

void push(int x) {
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  if (newNode == NULL) {
    printf("Stack Overflow!");
    return;
  }
  newNode->data = x;
  newNode->next = top;
  top = newNode;
}

void pop() {
  struct Node *toDelete = top;
  if (!top) {
    printf("Stack Underflow!");
    return;
  }
  top = top->next;
  free(toDelete);
}

void Display() {
  struct Node *temp = top;
  while (temp) {
    printf("%d ", temp->data);
    temp = temp->next;
  }
  printf("\n");
}

int peek(int pos) {
  struct Node *temp = top;
  for (int i = 0; i < pos; i++) {
    temp = temp->next;
  }
  const int data = temp->data;
  return data;
}

bool isEmpty() { return top == NULL; }

bool isFull() {
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  const bool isFull = newNode == NULL;
  return isFull;
}

int main() {
  push(10);
  push(20);
  push(30);
  push(40);
  push(50);

  pop();

  Display();
}