#include<iostream>
#include<algorithm>
using namespace std;
// refer : https://www.youtube.com/watch?v=6j-vHQMXXiA
class Student
{
    //If we don't set is public than sort() function will not be able to access..otherwise there will be error...
    public:
    string name;
    int rollno;
    void setData()
    {
        cout << "Enter rollno : ";
        cin >> rollno;
    
        cin.ignore(numeric_limits <streamsize>::max(), '\n');
        cout << "Enter name : ";
        getline(cin, name);
    }

    void getData()
    {
        cout << rollno << "\t" << name << endl;
    }
};
    bool compare(Student s1, Student s2)
    {
        return s1.rollno < s2.rollno;
    }


int main()
{
    int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, n;

    cout << "Array Elements(Before Sorting) : ";
    for(int i = 0 ; i < 10 ; i++)
        cout << arr[i] << " ";
    sort(arr, arr + 10);
    
    cout << endl << "Array Elements(After sorting) : ";
    for(int i = 0 ; i < 10 ; i++)

        cout << arr[i] << " ";
    cout << endl;

    // Suppose we have Student class student and we want to sort object based on their total marks we also use sort() function;
    cout << endl << "Enter no. of Students : ";
    cin >> n;
    Student *S = new Student[n];
    
    for(int i = 0 ; i < n ; i++)
        S[i].setData(), cout << endl;

    cout << "Student data are as : " << endl;
    for(int i = 0 ; i < n ; i++)
        S[i].getData();
    
    sort(S, S + n, compare);
    cout << "Student data are as(Sorted in Rollno): " << endl;
    for(int i = 0 ; i < n ; i++)
        S[i].getData();
    
    return 0;
}