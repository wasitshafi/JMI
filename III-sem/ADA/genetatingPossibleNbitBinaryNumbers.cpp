//
//generatingPossibleNbitBinaryNumbers.cp
//
//program to generate all possible binary number each of n bits in length
//
#include<bits/stdc++.h>

using namespace std;
vector <string> generate(int numberOfBits)
{
    
    int n;
    vector<string> result;
    queue<string> q;
    string front;

    n = pow(2 , numberOfBits) - 1;

    result.push_back("0");
    

    q.push("1"); // CTM: for stack/queue we hava push() rather push_back()

    while(n--)
    {
        front = q.front();
        result.push_back(front);
 
        q.pop();
        q.push(front + "0");
        q.push(front + "1");
    }
    
    for(int i = 0 ; i < result.size() ; i++)
        while(result[i].length() != numberOfBits) // if the length is less than noOfBits then it will continue prefix "0" until its becomes exactly 'n' bits
            result[i] = "0" + result[i];
    
    return result;
}

int main()
{
    int numberOfBits;
    vector<string> result;
    char choice;
    
    do{
        cout << "Enter no. of bits : ";
        cin >> numberOfBits;
         
        cout << endl << "All possible " << numberOfBits << " bits binary numbers are as : " << endl;
        result = generate(numberOfBits);
        
        // display result
        for(auto itr = result.begin() ; itr != result.end() ; itr++)
            cout << *itr << endl;
        
        cout << endl << "Do you want to continue(y/n) : ";
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        choice = getchar();
      }while(choice == 'y' || choice == 'Y');

    return 0;
}