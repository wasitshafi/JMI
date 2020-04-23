// It was one of the Test Case on hackerrank . Solution to this was suggested to me by Arjun on 12-10-19
#include<bits/stdc++.h>
using namespace std;

void multiply(int x, int y, int z)
{

    // for type conversion the dominate datatype will decide the range from the RHS otherwise overflow may occur
    
    long long int xyz = x * y * z; // for correct answer do  xyz = (long long int)x * y * z;
    unsigned long long int Uxyz = x * y * z;

    cout << "x, y, z            : " << x << ", " << y << ", " << z << endl;
    cout << "xyz                : " << xyz << endl;      // WA
    cout << "Uxyz               : " << Uxyz << endl;     // WA
    cout << "x * y * z          : " << x * y * z << endl;          // WA
    cout << "1039 * 3749 * 8473 : " << 1039 * 3749 * 8473 << endl; // WA  //because by default is also integer    

    long long int xy = x * y;
    xyz = xy * z;

    cout << endl;
    cout << "xy * z : " << xy * z << endl;       // Correct answer but not correct way
    cout << "xyz    : " << xyz << endl;          //             --do--
    
    // correct way
    cout << endl << endl << "Correct Way...!" << endl;
    cout <<"(long long int) x * y * z : " << (long long int) x * y * z; 
}

int main()
{
    int x, y, z;

    x = 1039; 
    y = 3749;
    z = 8473;
    
    multiply(x, y, z);
    return 0;
}