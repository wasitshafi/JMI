#include<bits/stdc++.h>

using namespace std;


int sum(int arr[], int i, int n)
{
    if(i > n)
      return 0;
    else
      return arr[i] + sum(arr, i + 1, n);
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

    cout << endl << "Sum of all the elements are as : " << sum(arr, 0 , n - 1);

    return 0;
}