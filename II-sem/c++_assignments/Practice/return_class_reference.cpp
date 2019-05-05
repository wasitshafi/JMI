//
//
//
//

#include<bits/stdc++.h>

using namespace std;

class student{
    string name;
    int id;

    public:
    student(){}
    student(string name , int id)
    {
        this->name = name;
        this->id = id;
    }
    
    void getdata()
    {
        cout << endl << "Enter name : ";
        getline(cin, name);

        cout << endl << "Enter id: ";
        cin >> id; 
    }
    
    void putdata()
    {
        cout << endl << "Name = " << name << "\tID = " << id;
    }
    student copy1()
    {
        student s;

        s.name = name;
        s.id = id;

        return s;
    }

    student copy2()
    {
        return (student(name, id)); // this will create an object using an constructor and will return it 
                                    // this is more precise to return an object as compare to method above
    }
};

int main()
{
    student s1, s2, s3;

    s1.getdata();

    s2 = s1.copy1();
    s3 = s1.copy2();
    
    s1.putdata();
    s2.putdata();
    s3.putdata();

    return 0;
}