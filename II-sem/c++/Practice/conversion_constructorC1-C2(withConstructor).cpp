//
//
//
//
#include<iostream>
using namespace std;

class item;
class product{
    string pName;
    int pId;
    public:
    friend class item;
    void getdata()
    {
        cout << endl << "Enter product name: ";
        getline(cin, pName);
        
        cout << endl << "Enter product id: ";
        cin >> pId;
    }
    void putdata()
    {
        cout << endl << "Product : " << pName << endl << "Id : " << pId;
    }
};

class item{
    string name;
    int id;
    public:
    item(){}
    item(product p)
    {
        name = p.pName;
        id = p.pId;
    }
    void putdata()
    {
        cout << endl << "Item name : " << name << endl << "Item id : " << id;
    }
};

int main()
{
    item i;
    product p;

    p.getdata();

    i = p;
    p.putdata();
    i.putdata();

    return 0;
}