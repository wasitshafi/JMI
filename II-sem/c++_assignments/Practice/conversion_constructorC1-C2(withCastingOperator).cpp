//
//
//
//
#include<iostream>
using namespace std;

class product;

class item{
    string name;
    int id;
    public:
    friend class product;
    void putdata()
    {
        cout << endl << "Item name : " << name << endl << "Item id : " << id;
    }
};
class product{
    string pName;
    int pId;
    public:
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
    operator item()
    {
        item i;
        i.name = pName;
        i.id = pId;
        return i;
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