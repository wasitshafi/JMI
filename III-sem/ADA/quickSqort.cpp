//
//quickSort.cpp
//
//program to implement quicksort algorithm
//
#include<iostream>
using namespace std;

int partition(int arr[], int lb, int ub)
{
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

    while(start < end)
    {
        //Remind it like - "<= >" pivot
        while(arr[start] <= pivot) start++;
        while(arr[end] > pivot)  end--;
        
        if(start < end) // swapping
        {
                arr[start] = arr[start] + arr[end];
                arr[end]   = arr[start] - arr[end];
                arr[start] = arr[start] - arr[end];
         }
    }

    if(lb!=end) // sswapping without using third variable .Note : here there is scope of having same index of arrar so we use if to avoid that
    {
        arr[lb]  = arr[lb] + arr[end];
        arr[end] = arr[lb] - arr[end];
        arr[lb]  = arr[lb] - arr[end];
    }
     
    return end;
}

void quickSort(int arr[], int lb, int ub)
{
   if(lb < ub)
   {
    int pi = partition(arr, lb, ub);
    quickSort(arr, lb, pi - 1);
    quickSort(arr, pi + 1, ub);    
   }
}

int main()
{
    int n, *arr;
 
    cout << endl << "Enter no. of elements : ";
    cin >> n;
    arr = new int[n];

    for ( int i = 0 ; i < n ; i++)
    {
        cout << "arr[" << i + 1 << "] << ";
        cin >> arr[i];
    }

    cout << "Array elements before quick sort : ";
    for (int i = 0 ; i < n ; i++) cout << arr[i] << " ";

    quickSort(arr, 0, n - 1);
    
    cout <<  endl << "Array elements after quick sort  : ";
    for (int i = 0 ; i < n ; i++) cout << arr[i] << " ";

    return 0;
}