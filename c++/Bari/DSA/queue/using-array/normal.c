#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

struct Queue
{
  int front;
  int rear;
  int size;
  int *Q;
};

void create(struct Queue *q)
{
  printf("Enter size: ");
  scanf("%d", &q->size);
  q->Q = (int *)malloc(q->size * sizeof(int));
  q->front = -1;
  q->rear = -1;
}

bool isEmpty(struct Queue *q) { return q->front == q->rear; }

bool isFull(struct Queue *q) { return q->rear == q->size - 1; }

int dequeue(struct Queue *q)
{
  if (isEmpty(q))
  {
    printf("Queue is empty, cannot dequeue.\n");
    return -1;
  }

  int x = q->Q[q->front];

  q->Q[q->front++] = -1;

  return x;
}

void enqueue(struct Queue *q, int value)
{
  if (!isFull(q))
  {
    q->Q[q->rear++] = value;
  }
}

void Display(struct Queue *q)
{
  for (int i = q->front; i < q->rear; i++)
  {
    printf("%d ", q->Q[i]);
  }
  printf("\n");
}

int main()
{
  struct Queue q;
  create(&q);

  printf("empty-> %d\n", isEmpty(&q));

  enqueue(&q, 1);
  enqueue(&q, 2);
  enqueue(&q, 3);
  enqueue(&q, 4);
  enqueue(&q, 5);
  enqueue(&q, 6);
  enqueue(&q, 7);
  enqueue(&q, 8);
  enqueue(&q, 9);
  enqueue(&q, 10);

  printf("empty-> %d\n", isEmpty(&q));
  printf("full-> %d\n", isFull(&q));

  printf("dequeue-> %d\n", dequeue(&q));
  printf("dequeue-> %d\n", dequeue(&q));
  printf("dequeue-> %d\n", dequeue(&q));
  printf("dequeue-> %d\n", dequeue(&q));

  Display(&q);
}