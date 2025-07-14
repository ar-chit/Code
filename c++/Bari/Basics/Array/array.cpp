#include <iostream>
using namespace std;

void print(int a[], int size)
{
  for (int i = 0; i < size; i++)
  {
    cout << a[i] << endl;
  }
}

int sum(int a[], int size)
{
  int sum = 0;
  for (int i = 0; i < size; i++)
  {
    sum += a[i];
  }

  return sum;
}

int maxi(int a[], int size)
{
  int maxi = INT8_MIN;

  for (int i = 0; i < size; i++)
  {
    if (maxi < a[i])
    {
      maxi = a[i];
    }
  }

  return maxi;
}

int mini(int a[], int size){
  int mini = INT8_MAX;

  for (int i = 0; i < size; i++){
    if (mini > a[i]){
      mini = a[i];
    }
  }

  return mini;
}

int linearSearch (int a[], int element, int size){

  for (int i = 0; i < size;i++){
    if(element == a[i]){
      return i;
    }
  }

  return -1;
}

int binarySearch(int a[], int element, int size){
  int start = 0;
  int end = size;

  while(start<=end){
    int mid = start + (end - start) / 2;

    if(a[mid] == element){
      return mid;
    }else if(a[mid] < element){
      start = mid + 1;
    }else{
      end = mid - 1;
    }
  }

  return -1;
}

int[] numberOfPositivesAndNegatives(int a[], int size){
  int pos = 0;
  int neg = 0;

  for (int i = 0; i < size; i++){
    if(a[i] <= 0){
      pos++;
    }else{
      neg++;
    } 
  }

  return new int[]{pos, neg};
}

int main()
{
  int a[] = {0, 1, 2, 3, 4, 15, 30};
  int size = sizeof(a) / sizeof(a[0]);
  // print(a, size);
  // cout << sum(a, size) << endl;
  // cout << maxi(a, size) << endl;
  cout << mini(a, size) << endl;
  // cout << linearSearch(a, 40, size) << endl;
  // cout << binarySearch(a, 15, size) << endl;
  return 0;
}
