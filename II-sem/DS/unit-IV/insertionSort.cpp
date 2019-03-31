//
//
//
//
#include<iostream>

using namespace std;

void sort(int array[], int n)
{
  int i, j, key;

  for(i = 1 ; i < n ; i++)
  {
    key = array[i];
    j = i - 1;

    while(j >= 0 && array[j] > key)
    {
      array[j + 1] = array[j];
      j--;
    }
    array[j + 1] = key;
  }
}
int main()
{
    int n, i;
    
    cout << endl << "Enter no of elements : ";
    cin >> n;
    
    int array[n];    
    
    cout << endl << "You have to enter " << n << " elements : " << endl;
    for(i = 0 ; i < n ; i++ )
      cout << "Array[" << i + 1 << "] : ", cin >> array[i];

    cout << endl << "Array before sorting : ";
    for(i = 0 ; i < n ; i++ ) cout << array[i] << " ";
    
    sort(array, n);
    
    cout << endl << "Array after sorting  : ";
    for(i = 0 ; i < n ; i++ ) cout << array[i] << " ";

    return 0;
}