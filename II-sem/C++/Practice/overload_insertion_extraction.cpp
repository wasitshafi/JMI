//
//
//
//
//
#include<iostream>

using namespace std;

class person{
    int id;
    char name[20];
public:

    friend ostream &operator <<(ostream &op, person &);
    friend istream &operator >>(istream &ip, person &);
};

ostream &operator << ( ostream &op, person &p )
{
  op << endl << "Id = " << p.id << "\tName = " << p.name;
  return op;
}

istream &operator >> ( istream &ip, person &p )
{
  ip >> p.id >> p.name;
  return ip;
}

int main()
{
  person p;

  cout << endl << "Enter id & name : \t";
  cin >> p;
  cout << p;

  return 0;
}
