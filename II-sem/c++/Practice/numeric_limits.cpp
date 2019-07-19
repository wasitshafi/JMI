//
//
//
//
#include<limits>
#include<cstddef>
#include<iostream>

using namespace std;


//ref: https://www.codeproject.com/Tips/737853/Cplusplus-Numeric-Limits-and-Template-Specializati
//     http://www.enseignement.polytechnique.fr/informatique/INF478/docs/Cpp/en/cpp/types/numeric_limits.html
//     https://en.cppreference.com/w/cpp/types/numeric_limits/max


int main()
{
    cout << "short(min): "<< numeric_limits<short>::min() << endl
         << "short(max): "<< numeric_limits<short>::max() << endl << endl
         << "int(min)  : "  << numeric_limits<int>::min() << endl
         << "int(max)  : "  << numeric_limits<int>::max() << endl << endl
         << "float(min): " << numeric_limits<float>::min() << endl
         << "float(max): " << numeric_limits<float>::max() << endl << endl
         << "streamsize: " << dec << numeric_limits<streamsize>::max(); // show the max. stream size
 
 return 0;
}