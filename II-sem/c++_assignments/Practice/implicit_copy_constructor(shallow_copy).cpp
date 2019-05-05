//
//
//
//

#include<iostream>
using namespace std;  // for more info watch https://www.youtube.com/watch?v=nCAVr_T4DbM&list=PLLYz8uHU480j37APNXBdPz7YzAi4XlQUF&index=55

class student{
  string name;
  int age;
public:
  void getdata()
  {
    cout << endl << "Enter name of student : ";
    getline(cin , name);
    cout << "Enter age of student : ";
    cin >> age;
  }
  void putdata()
  {
    cout << endl << "Name = " << name << "\tAge = " << age;
  }
};
int main()
{

  student s1;

  s1.getdata();
                     // Implemtation of shallow copy  // do read about read deep copy
  student s2 = s1;// by implicit copy constructor
  student s3;
  s3 = s1;// by implicit copy assignment operator

  s1.putdata();      // there is also a problem associated with shallow copy (Dangling pointer)
  s2.putdata();      // by which by prefer deep copy(creating a copy constructor)
  s3.putdata();

  return 0;
}
