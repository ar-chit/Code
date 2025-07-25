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
  q->front = q->rear = 0;
}

bool isEmpty(struct Queue *q) { return q->front == q->rear; }

bool isFull(struct Queue *q) { return (q->rear + 1) % q->size == q->front; }

int dequeue(struct Queue *q)
{
  if (isEmpty(q))
  {
    printf("Queue is empty, cannot dequeue.\n");
    return -1;
  }

  q->front = (q->front + 1) % q->size;
  return q->Q[q->front];
}

void enqueue(struct Queue *q, int value)
{
  if (isFull(q))
  {
    printf("Error: Queue is already full");
  }
  else
  {
    q->rear = (q->rear + 1) % q->size;
    q->Q[q->rear] = value;
  }
}

void Display(struct Queue *q)

{
  int i = (q->front + 1);

  do
  {
    printf("%d ", q->Q[i]);
    i = (i + 1) % q->size;
  } while (i != (q->rear + 1) % q->size);
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