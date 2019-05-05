//
//
//
//
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int rows, cols, i, j;
    int rows2;
    do{
    cout << endl << "Enter no. rows for Matrix :\t";
    cin >> rows;
    cout << endl << "Enter no. of columns for Matrix :\t";
    cin >> cols;
   
   do{
       cout << endl << "Enter no of rows for Vector : \t";
       cin >> rows2;

       if( cols != rows2 )
         cout << endl << "Vector-Matrix Multiplication not possible......! Try again.";
     
     }while( cols != rows2 );

    if( rows < 1 || cols < 1 || rows2 < 1)
     cout << endl << "Invalid Input.....! Try Again";
    }while( rows < 1 || cols < 1 || rows2 < 1);


    int matrix[rows][cols], temp[rows][cols];
    int vector[cols], resultant_vector[rows] = {0};
   
    cout << endl << "Enter Matrix Elements" << endl;
    for( i = 0 ; i < rows; i++ )
    {
      cout << endl;
        for( j = 0 ; j < cols ; j++ )
        {
            cout << "Matrix[" << i+1 << "][" << j+ 1 << "] > ";
            cin >> matrix[i][j]; 
        }
    }
 
   cout << endl << "Enter Vector Matrix Elements :";
   for( i = 0 ; i < cols ; i++ )
   {
       cout << endl << "Vector[ " << i + 1 << "] :\t"; 
       cin >> vector[i];
   }
//########## VECTOR-MATRIX MULTIPLICATION CALCULATIONS ##########
   for( i = 0 ; i < cols ; i++ )
   {
      for( j = 0 ;  j < rows ; j++ )
        temp[j][i] = matrix[j][i] * vector[i];  
   }
   for( i = 0 ; i < rows ; i++ )
   {
       for ( j = 0 ; j < cols; j++ )
           resultant_vector[i] +=  temp[i][j];
   }
   
//########## VECTOR-MATRIX MULTIPLICATION CALCULATIONS ##########
   system("clear");
   cout << "Matrix : " << endl ;    
   for( i = 0 ; i < rows; i++ )
   {
       for( j = 0 ; j < cols ; j++ )
          cout << matrix[i][j] << "\t";
      cout << endl;
    }
   
    cout << endl << "Vector : ";
    for( i = 0 ; i < cols ; i++ )
        cout << endl << vector[i] ;
  
   cout << endl << "Vector-Matrix Multiplication" << endl;
    for(i = 0 ; i < rows ; i++)
        cout << endl << resultant_vector[i];
    return 0;
}