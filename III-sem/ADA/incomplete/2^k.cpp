#include <iostream>
using namespace std;

int twoPowerK(int k)
{
  if( k == 0)
    return 1;
  else
    return 2 * twoPowerK(k - 1);
}

int main()
{
  int k;

  cout << "Enter value of k : ";
  cin >> k;

 for(int i = 0 ; i <= k ; i++)
   cout << "2 ^ " << i << " : " <<  twoPowerK(i) << endl;
  return 0;
}
