//
//
//
//

#include<iostream>
#include<stdlib.h>

using namespace std;

struct node{
    int data;
    node *link;
};

class linkedlist{
    node *first;
public:

    linkedlist()
    {
        first = NULL;
    }

    void create( int );
    void display()const;
    //void insert( int, int );
    void deletenode( int );
    bool isempty()const;
    int getsize()const;
    int indexof( int )const;
    void getelement( int )const;
};

void throwexception(const char *msg)  // we can't change the msg
{
    cout << endl << msg;
}

void linkedlist::create(int n)
{
    if( first != NULL )
        throwexception("Linked list already created....!");
    else
    {
        node *cur;

        for( int i = 1 ; i <= n ; i++ )
        {
            if( i == 1 )
                first = cur = new node;
            else
            {
                cur->link = new node;
                cur = cur->link;
            }

            cout << endl << "Enter data :\t";
            cin >> cur->data;
        }
        cur->link = first;
        cout << endl << "Nodes added successfully";
    }
}

void linkedlist::display()const
{
    if( first == NULL )
      throwexception("Linked list is Empty...!");
    else
    {
        node* cur = first;

        cout << endl << endl;

         do{
            cout << cur->data << "\t";
            cur = cur -> link;
        }while(cur != first );
    }
}


/*
void linkedlist :: insert( int element, int index )
{
    if( index < 0 || index > getsize() )
    throwexception("Invalid index...! TRY AGAIN");
    else
    {
        node* newnode = new node;
        newnode->data = element;

        if(index == 0)
        {
            newnode->link = first;
            first = newnode;
        }
        else
        {
            node* cur = first;

            for( int i = 1 ; i < index ; i++)
               cur = cur->link;

            newnode->link = cur->link;
            cur->link = newnode;
        }
        cout<< endl << "Node inserted successfully";
    }
}
*/


void linkedlist:: deletenode( int index )
{
 if( index < 0 || index >= getsize() )
    throwexception("Invalid index...! TRY AGAIN.");
 else
 {
 	node* cur = first;
  node* del;

 	if( index == 0 )
 	{
    del = first;
    if( getsize() == 1 )
      first = NULL;
    else
    {
         while( cur-> link != first)
           cur = cur-> link;
      cur->link = first->link;
      first = first->link;
    }
    delete del;
	}
  
	else
	{
		for( int i = 0 ; i < index - 1  ; i++ )
			cur = cur->link;

		node* del = cur->link;

		cur->link = cur->link->link;
		delete del;
	}
 	cout << endl << "Node deleted.";
 }
}



bool linkedlist::isempty( )const
{
    if( first == NULL )
        return true;
    else
        return false;
}
int linkedlist::getsize()const
{
    int count = 0;
    node* cur = first;

    if( first != NULL )
    {
     do{
        count++;
        cur = cur->link;
     }while( cur != first );
    }
  return count;
}

int linkedlist::indexof( int element )const
{
    node* cur = first;
    int index = 0;
    bool is_found = false;

    if( first == NULL )
      return -1; // refers linked list is empty
    else
    {
     do{
          if( cur->data == element )
          {
           is_found = true;
           break;
          }
         index++;
         cur = cur->link;
       }while( cur != first );

    if(is_found)
    return index; // otherwise return index
    else
    return -2; // refers not found
    }
}


void linkedlist::getelement( int index )const
{

    if( index < 0 || index >= getsize() )
    {
        throwexception("Invalid index...!");
    }
    else
    {
        node* cur = first;

        for( int i = 0 ; i < index ; i++ )
            cur = cur->link;

        cout << endl << "Data at index " << index << " is : \t" << cur->data;
    }
}

int main()
{
    int choice;
    long int n, temp;
    linkedlist linked;

    do{

    system("cls");
    cout << endl << "1 => Create().";
    cout << endl << "2 => Display().";
    //cout << endl << "3 => Insert().";
    cout << endl << "4 => Delete().";
    cout << endl << "5 => Isempty().";
    cout << endl << "6 => Size().";
    cout << endl << "7 => Indexof().";
    cout << endl << "8 => Getelement().";
    cout << endl << "0 => Exit";

    cout << endl << endl << "Enter your choice:\t";
    cin >> choice;

     switch(choice)
     {
      case 1:
        do{
           cout << endl << "Enter no of nodes :\t";
           cin >> n;

           if( n < 1)
               cout << endl << "Invalid no of nodes....! TRY AGAIN";
          }while(n < 1);

        linked.create(n);
        break;

      case 2 :
        linked.display();
        break;

      /*case 3:
          cout << endl << "Enter element :\t";
          cin >> temp;
          cout << endl << "Enter index :\t";
          cin >> n;

          linked.insert( temp , n );


        break;
*/
      case 4:
      	cout << endl << "Enter index:\t";
      	cin >> n;

      	linked.deletenode(n);

        break;

      case 5:
        if( linked.isempty() )
            cout << endl << "Linked list is empty.";
        else
            cout << endl << "Linked list is not empty.";

        break;

      case 6:
          n = linked.getsize();
          if( !n )
            cout << endl << "Linked list is Empty..!";
          else
            cout << endl << "Size of linked list is : " << n;
        break;

      case 7:
          cout << endl << "Enter element:\t";
          cin >> n;

          temp = linked.indexof(n);
          if(temp == -1)
            throwexception("Linked list is Empty...!");
          else if(temp == -2) // if return value is 0
            cout << endl << "Element not found...!";
          else
            cout << endl << "Element found at index : \t" << temp ;
        break;

      case 8:
          cout << endl << "Enter index:\t";
          cin >> n;

          linked.getelement(n);
        break;

      case 0: exit(EXIT_SUCCESS);

      default : cout << endl << "INVALID CHOICE...! TRY AGAIN.";
     }

     cout << endl, system("pause");

    }while( choice != 0 );
 return 0;
}
