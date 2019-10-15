#include<iostream>
using namespace std;

int odd(int n, int k)
{
  if( k == 1)
    return n;
  else
    return odd(n + 2, k - 1);
}

int odd2(int k)
{
  if(k == 1)
    return 1;
  else
    return (k - 1) + 2;
}

int main()
{
  int k;
  cout << "Enter value of k : ";
  cin >> k;

  for(int i = 1 ; i <= k ; i++)
  {
    cout << "Kth odd natural no is : " << odd(1, i) << endl;
    cout << "Kth odd natural no is : " << odd2(i) << endl << endl ;
  }

  return 0;
}
