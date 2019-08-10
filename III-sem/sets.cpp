//
//
//
//
#include<iostream>
#include<set>
using namespace std;

int main()
{
    set<int> s;


    cout << "s.empyt() = " << s.empty();
    cout << endl << "Max. no of elements that sets can hold : " << s.max_size();

    for( int i = 10 ; i > 0 ; i-- )
        s.insert(i * 11);  // Internally they will be stored in sorted order
    
    cout << endl << endl << "Total no of elements are as : " << s.size();
    cout << endl << "s.empyt() = " << s.empty();
    cout << endl << "Sets elements are as : ";
    //Inorder to print sets elements we have to use iterator 

    for( set<int>::iterator ir = s.begin() ; ir != s.end() ; ir++)
        cout << *ir << "  ";

    // CTM: we can't edit the set elements as the elements itself are the keys. Although we can delete the element that
 

       s.insert(5); // as 5 is already stored if we want to add again 5 then we have to use multiset
       s.insert(5);
          
    cout << endl << "Sets elements are as after inserting 5 two times : ";    
    for( set<int>::iterator ir = s.begin() ; ir != s.end() ; ir++)
        cout << *ir << "  ";

    s.erase(45); // 45 is not present in set
    
    // s.erase(11);   
    //    or
    set<int>::iterator ir = s.find(11); // find will return the pointer to the key
    if(ir != s.end()) s.erase(ir);  // If the element is not found, then the iterator points to the position just after the last element in the set.

    cout << endl << "Sets elements are as after erase(45) & erase(11) : ";    
    for( set<int>::iterator ir = s.begin() ; ir != s.end() ; ir++)
        cout << *ir << "  ";

    return 0;
}