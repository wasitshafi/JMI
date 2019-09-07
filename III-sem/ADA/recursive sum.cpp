#include<bits/stdc++.h>

using namespace std;

int sum(int arr[], int n)
{
    if(n < 0)
      return 0;
    else
      return arr[n] + sum(arr, n - 1);
}

int main()
{
    int n; 
    
    cout << "Enter no. of elements : ";
    cin >> n;

    int arr[n];

    for(int i = 0; i < n ; i++)
    {
        cout << "Arr[" << i + 1 << "]  << ";
        cin >> arr[i];
    }

    cout << endl << "Array elements are as : ";
    for(int i = 0 ; i < n ; i++) cout << arr[i] << " ";

    cout << endl << "Sum of all the elements are as : " << sum(arr, n - 1);

    return 0;
}