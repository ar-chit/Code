#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

struct Queue {
  int front;
  int rear;
  int size;
  int *Q;
};

void create(struct Queue *q) {
  printf("Enter size: ");
  scanf("%d", &q->size);
  q->Q = (int *)malloc(q->size * sizeof(int));
  q->front = -1;
  q->rear = -1;
}

bool isEmpty(struct Queue *q) { return q->front == q->rear; }

bool isFull(struct Queue *q) { return q->rear == q->size - 1; }

void deque(struct Queue *q) { q->Q[q->front++] = -1; }

void enque(struct Queue *q, int value) {
  if (!isFull(q)) {
    q->Q[q->rear++] = value;
  }
}

void Display(struct Queue *q) {
  for (int i = q->front; i < q->rear; i++) {
    printf("%d ", q->Q[i]);
  }
  printf("\n");
}

int main() {
  struct Queue q;
  create(&q);

  printf("empty-> %d", isEmpty(&q));

  enque(&q, 1);
  enque(&q, 2);
  enque(&q, 3);
  enque(&q, 4);
  enque(&q, 5);
  enque(&q, 6);
  enque(&q, 7);
  enque(&q, 8);
  enque(&q, 9);
  enque(&q, 10);

  printf("empty-> %d", isEmpty(&q));
  printf("full-> %d", isFull(&q));

  deque(&q);

  Display(&q);
}