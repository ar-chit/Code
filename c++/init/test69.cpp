#include <iostream>
using namespace std;

void bubbleSort(int array[], int size)
{

    for (int step = 0; step < size; ++step)
    {

        for (int i = 0; i < size - step; ++i)
        {

            if (array[i] < array[i + 1])
            {

                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }
}

void printArray(int array[], int size)
{
    for (int i = 0; i < size; ++i)
    {
        cout << " " << array[i];
    }
    cout << endl;
}

int main()
{
    int data[] = {82, 12, 1234, 1, 9};
    int size = sizeof(data);
    bubbleSort(data, size);
    cout << "sort in ascending order" << endl;
    printArray(data, size);
    return 0;
}

//bubble sort code?
