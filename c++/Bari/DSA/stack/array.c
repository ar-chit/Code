#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

struct Stack {
  int size;
  int top;
  int *S;
};

void create(struct Stack *st) {
  printf("Enter size");
  scanf("%d", &st->size);
  st->top = -1;
  st->S = (int *)malloc(st->size * sizeof(int));
}

void Display(struct Stack *st) {
  for (int i = st->top; i >= 0; i--) {
    printf("%d ", st->S[i]);
  }
  printf("\n");
}

void push(struct Stack *st, int x) {
  if (st->top == st->size - 1) {
    printf("Stack Overflow\n");
    return;
  }

  int top = ++st->top;
  st->S[top] = x;
}

int pop(struct Stack *st) {
  if (st->top == -1) {
    printf("Stack Underflow\n");
    return -1;
  }

  int val = st->S[st->top];

  st->S[st->top] = 0;
  st->top--;

  return val;
}

int peek(struct Stack *st, int pos) {
  if (pos > st->top || pos < 0) {
    printf("Invalid position");
    return -1;
  }

  int index = st->S[st->top] - pos;

  return st->S[index];
}

bool isEmpty(const struct Stack *st) { return st->top == -1; }

bool isFull(struct Stack *st) { return st->top == st->size - 1; }

int main() {
  struct Stack st;

  create(&st);

  push(&st, 10);
  push(&st, 20);
  push(&st, 30);
  push(&st, 40);
  push(&st, 50);

  printf("%d \n", pop(&st));

  Display(&st);
  return 0;
}