//
//printkgram2.cpp
//
//program to print all possible k-grams;
//
#include<iostream>
#include<string>
#include<limits>
using namespace std;

void getwords(string words[], int n)
{
    for( int i = 0 ; i < n ; i++)
    {
        cout << "Enter word " << i + 1 << " : ";
        getline(cin, words[i]);
    }
}

void printwords(string words[], int n)
{
        for( int i = 0 ; i < n ; i++)
        cout << words[i] << " ";
}

void printKgram(string words[], int n, int k )
{
    for( int i = 0 ; i < n - k + 1 ; i++)
    {
        cout << "\"";
        for( int j = i ; j < i + k ; j++)
        {
            cout << words[j];
            if(j != i + k - 1) cout << " ";
        }
        cout << "\"";
        if(i != n - k) cout << ", "; 
    }
}

int main()
{
    int noOfWords;
    
    cout << "Enter no of words : ";
    cin >> noOfWords;
    string words[noOfWords];
 
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cout << endl;
    
    getwords(words, noOfWords);
    cout << endl << "String : ";
    printwords(words, noOfWords);
    
    for(int k = 1 ; k < noOfWords ; k++)
    {
       cout << endl << endl << k << "-gram : " ;
       printKgram(words, noOfWords, k);
    }

    return 0;
}