#include <iostream>
using namespace std;

class Queue
{
private:
  int front;
  int rear;
  int size;
  int *Q;

public:
  Queue()
  {
    front = rear = -1;
    size = 10;
    Q = new int[size];
  }
  Queue(int size)
  {
    this->size = size;
    front = rear = -1;
    Q = new int[size];
  }
  bool isEmpty();
  bool isFull();
  void enqueue(int x);
  int dequeue();
  void Display();
  ~Queue()
  {
    delete[] Q;
  }
};

bool Queue::isEmpty()
{
  return front == rear;
}

bool Queue::isFull()
{
  return rear == size - 1;
}

void Queue::enqueue(int x)
{
  if (isFull())
  {
    cout << "Queue is full" << endl;
  }
  else
  {
    Q[++rear] = x;
  }
}

int Queue::dequeue()
{
  if (isEmpty())
  {
    cout << "Nothing to pop, queue is empty" << endl;
    return -1;
  }
  return Q[++front];
}

void Queue::Display()
{
  for (int i = front + 1; i <= rear; i++)
  {
    cout << Q[i] << " ";
  }
  cout << endl;
}
int main()
{
  Queue *q = new Queue(5);

  q->enqueue(100);
  q->enqueue(200);
  q->enqueue(300);

  cout << "Queue after enqueues: ";
  q->Display();

  q->dequeue();
  cout << "Queue after dequeue: ";
  q->Display();

  delete q;
  return 0;
}