#include <limits.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

struct Node {
  int data;
  struct Node *next;
} *first = NULL;

void create(int A[], int n) {
  struct Node *t, *last;

  first = (struct Node *)malloc(sizeof(struct Node));
  first->data = A[0];
  first->next = NULL;
  last = first;

  for (int i = 1; i < n; i++) {
    t = (struct Node *)malloc(sizeof(struct Node));
    t->data = A[i];
    t->next = NULL;
    last->next = t;
    last = t;
  }
}

void Display(struct Node *p) {
  while (p) {
    printf("%d ", p->data);
    p = p->next;
  }
}

void RDisplay(struct Node *p) {
  if (p != NULL) {
    printf("%d ", p->data);
    RDisplay(p->next);
  }
}

void RDisplayReverse(struct Node *p) {
  if (p != NULL) {
    RDisplayReverse(p->next);
    printf("%d ", p->data);
  }
}

int count(struct Node *p) {
  int count = 0;
  while (p) {
    count++;
    p = p->next;
  }
  return count;
}

int RCount(struct Node *p) {
  if (p) {
    return RCount(p->next) + 1;
  }
  return 0;
}

int sum(struct Node *p) {
  int sum = 0;
  while (p) {
    sum += p->data;
    p = p->next;
  }
  return sum;
}

int RSum(struct Node *p) {
  if (p) {
    return RSum(p->next) + p->data;
  }
  return 0;
}

int max(struct Node *p) {
  int m = INT_MIN;
  while (p) {
    if (p->data > m) {
      m = p->data;
    }
    p = p->next;
  }

  return m;
}

int RMax(struct Node *p) {
  if (p) {
    return RMax(p->next) > p->data ? RMax(p->next) : p->data;
  }
  return INT_MIN;
}

struct Node *linearSearch(struct Node *p, int key) {
  while (p) {
    if (key == p->data) {
      return p;
    }
    p = p->next;
  }

  return NULL;
}

struct Node *RLinearSearch(struct Node *p, int key) {
  if (!p) {
    return NULL;
  }
  return p->data == key ? p : RLinearSearch(p->next, key);
}

struct Node *MoveToHead(struct Node *p, int key) {
  if (p->data == key) {
    return p;
  }

  struct Node *prev = NULL;
  struct Node *curr = p;

  while (curr) {
    if (key == curr->data) {
      prev->next = curr->next;
      curr->next = first;
      first = curr;

      return curr;
    }
    prev = curr;
    curr = curr->next;
  }
  return NULL;
}

void insert(struct Node *p, int x, int index) {
  struct Node *NodeToInsert = (struct Node *)malloc(sizeof(struct Node));
  NodeToInsert->data = x;

  int i = 0;

  if (index == 0) {
    NodeToInsert->next = p;
    first = NodeToInsert;
    return;
  }

  while (p && i < index - 1) {
    p = p->next;
    i++;
  }

  if (!p) {
    free(NodeToInsert);
    return;
  }

  NodeToInsert->next = p->next;
  p->next = NodeToInsert;
}

void push(struct Node *p, int x) {
  struct Node *NodeToInsert = (struct Node *)malloc(sizeof(struct Node));
  NodeToInsert->data = x;

  struct Node *prev = p;
  struct Node *curr = p;
  while (curr) {
    prev = curr;
    curr = curr->next;
  }

  prev->next = NodeToInsert;
}

void sortedInsert(struct Node *p, int x) {
  struct Node *NodeToInsert = (struct Node *)malloc(sizeof(struct Node));
  NodeToInsert->data = x;
  NodeToInsert->next = NULL;

  struct Node *prev = NULL;
  struct Node *curr = p;

  while (curr && curr->data < x) {
    prev = curr;
    curr = curr->next;
  }

  if (curr == p) {
    NodeToInsert->next = p;
    first = NodeToInsert;
  } else {
    NodeToInsert->next = prev->next;
    prev->next = NodeToInsert;
  }
}

void deleteNode(struct Node *p, int index) {
  if (index == 0) {
    if (p->next) {
      first = p->next;
    }
    free(p);
    return;
  }

  int i = 1;

  while (p && i < index) {
    p = p->next;
    i++;
  }

  if (p) {
    struct Node *toDelete = p->next;
    p->next = toDelete->next;
    toDelete->next = NULL;
    free(toDelete);
  }
}

bool isSorted(struct Node *p) {
  if (p->next) {
    struct Node *prev = p;
    struct Node *curr = p->next;

    while (curr) {
      if (prev->data > curr->data) {
        return false;
      }
      prev = curr;
      curr = curr->next;
    }
  }

  return true;
}

void removeDuplicates(struct Node *p) {
  if (p->next) {
    struct Node *prev = p;
    struct Node *curr = p->next;

    while (curr) {
      if (prev->data == curr->data) {
        prev->next = curr->next;
        struct Node *toDelete = curr;
        curr = prev->next;
        free(toDelete);
      } else {
        prev = curr;
        curr = curr->next;
      }
    }
  }
}

void reverse(struct Node *p, int size) {
  struct Node *head = p;
  int *arr = (int *)malloc(sizeof(int) * size);

  int i = 0;
  while (p) {
    arr[i] = p->data;
    p = p->next;
    i++;
  }

  p = head;
  i = size - 1;
  while (p) {
    p->data = arr[i];
    p = p->next;
    i--;
  }
}

void reverseLinks(struct Node *p) {
  struct Node *prev = NULL;
  struct Node *curr = NULL;
  struct Node *next = p;

  while (next) {
    prev = curr;
    curr = next;
    curr->next = prev;
    next = next->next;
  }

  first = curr;
}

void RReverseLinks(struct Node *q, struct Node *p) {
  if (!p) {
    first = q;
    return;
  }

  RReverseLinks(p, p->next);
  p->next = q;
}

int mid(struct Node *p) {
  struct Node *slow = p;
  struct Node *fast = p;

  while (fast != NULL && fast->next != NULL) {
    slow = slow->next;
    fast = fast->next->next;  
  }

  return slow->data;
}

int main() {
  int A[] = {1, 2, 3, 4, 5, 6, 7 ,8};

  int size = 8;
  create(A, size);

  // Display(first);
  // RDisplay(first);
  // RDisplayReverse(first);

  // printf("%d ", count(first));
  // printf("%d ", RCount(first));

  // printf("%d ", sum(first));
  // printf("%d ", RSum(first));

  // printf("%d ", max(first));
  // printf("%d ", RMax(first));

  // printf("%p ", linearSearch(first, 25));
  // printf("%d ", RLinearSearch(first, 10)->data);

  // MoveToHead(first, 15);

  // insert(first, 69, 5);

  // push(first, 28);

  // insert(first, 8, 0);
  // insert(first, 3, 1);
  // insert(first, 6, 2);
  // insert(first, 5, 0);
  // insert(first, 9, 3);

  // sortedInsert(first, 100);

  // Display(first);

  // deleteNode(first, 0);

  // printf("%d \n", isSorted(first));

  // removeDuplicates(first);

  // reverse(first, size);
  // RReverseLinks(NULL, first);
  // Display(first);
  printf("%d ", mid(first));

  return 0;
}