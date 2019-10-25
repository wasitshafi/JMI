//
//
//
//
#include<iostream>
using namespace std;

template<class T>
void Create2dArray(T** &a, int NumberOfRows,int NumberOfColumns )
{
 a = new T*[NumberOfRows];

 for(int i = 0 ; i < NumberOfColumns;i++)
 {
  a[i] = new T[NumberOfColumns];
 }
}

template<class T>
void Delete2dArray(T** &a, int NumberOfRows)
{
  for( int i = 0; i < NumberOfRows ;++i)
  {
    delete [] a[i];
  }
  delete [] a;
  a = NULL;

}
int main()
{
 int** int_arr;
 float** float_arr;
 char ** char_arr;
 int NumberOfRows = 3;
 int NumberOfColumns = 4;
 int n = 1;
 float f = 1.1;
 char c = 65;

 try{Create2dArray(int_arr,NumberOfRows, NumberOfColumns);}
 catch(bad_alloc)
 {
  cerr << "Out of memory";
 }

 try{Create2dArray(float_arr,NumberOfRows, NumberOfColumns);}
 catch(bad_alloc)
 {
  cerr << "Out of memory";
 }
 try{Create2dArray(char_arr,NumberOfRows, NumberOfColumns);}
 catch(bad_alloc)
 {
  cerr << "Out of memory";
 }


  for(int i = 0 ; i < NumberOfRows ; i++)
  {
   for(int j = 0 ; j < NumberOfColumns ; j++)
   {
    int_arr[i][j] = n++;
    float_arr[i][j] = f++;
    char_arr[i][j] = c++;
   }
  }


cout << endl << "Integer Array A is : " << endl ;
 for(int i = 0 ; i < NumberOfRows ; i++)
 {
  for(int j = 0 ; j < NumberOfColumns ; j++)
  {
   cout << int_arr[i][j] << "\t";
  }
  cout << endl;
 }

 cout << endl << endl << "Float Array A is : " << endl ;
  for(int i = 0 ; i < NumberOfRows ; i++)
  {
   for(int j = 0 ; j < NumberOfColumns ; j++)
   {
    cout << float_arr[i][j] << "\t";
   }
   cout << endl;
  }

  cout << endl << endl << "Char Array A is : " << endl ;
   for(int i = 0 ; i < NumberOfRows ; i++)
   {
    for(int j = 0 ; j < NumberOfColumns ; j++)
    {
     cout << char_arr[i][j] << "\t";
    }
    cout << endl;
   }

//  Delete2dArray(int_arr, NumberOfRows);
//  Delete2dArray(float_arr, NumberOfRows);
//  Delete2dArray(char_arr, NumberOfRows);

  return 0;
}
