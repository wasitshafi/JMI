//
//
//
//
#include<iostream>
#include<iomanip>
using namespace std;

template<class T>
void sort(T &arr, int n)
{
  int i, j;
  float key;      // float can hold value both 'int' as well as 'float' while comparison without data loss
    for (i = 1; i < n; i++) // Insertion sort
    { 
      key = arr[i]; 
      j = i - 1; 
        while (j >= 0 && arr[j] > key)
        { 
          arr[j + 1] = arr[j]; 
          j = j - 1; 
        } 
      arr[j + 1] = key; 
    } 
}

int main()
{
    int n1, n2, i;
    int *intArray;
    float *floatArray;

   do{
      cout << endl << "Enter no integer elements : ";
      cin >> n1;
      if(n1 < 1) cout << "Invalid input...! Try Again." << endl;
     }while(n1 < 1);
    
    do{
       cout << endl << "Enter no float elements : ";
       cin >> n2;
       if(n2 < 1) cout << "Invalid input...! Try Again." << endl;
      }while(n2 < 1);
    
    intArray = new int[n1];
    floatArray = new float [n2];
    
    cout << endl << "You have to enter " << n1 << " elements for Integer Array:" << endl;
    for(i = 0 ; i < n1 ; i++)
    {
        cout << "intArray[" << i + 1 << "] : ";
        cin >> intArray[i];
    }

    cout << endl << endl << "You have to enter " << n2 << " elements for Float Array:" << endl;
    for(i = 0 ; i < n2 ; i++)
    {
        cout << "floatArray[" << i + 1 << "] : ";
        cin >> floatArray[i];
    }

    cout << endl << endl << "Integer array before sorting : ";
    for(i = 0 ; i < n1 ; i++) cout << intArray[i] << "  ";
    sort(intArray, n1);
    cout << endl << "Integer array after sorting : ";
    for(i = 0 ; i < n1 ; i++) cout << intArray[i] << "  ";


    cout << endl << endl << "Float array before sorting : ";
    for(i = 0 ; i < n2 ; i++) cout << setprecision(2) << floatArray[i] << "  ";    
    sort(floatArray, n2);
    cout << endl << "Float array after sorting : ";
    for(i = 0 ; i < n2 ; i++) cout << setprecision(2) << floatArray[i] << "  ";

    return 0;
}