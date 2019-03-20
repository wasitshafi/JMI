//bst.cpp on 20-03-19
//
//program to implement binary search tree
//
#include<iostream>
#include<stdlib.h>
#include<queue>
using namespace std;

class bst;
class node{
   node *left, *right;
   int data;
 public:
   node()
   {
    left = right = NULL;
   }
   friend class bst;
 };

 class bst{
   node* root;
 public:
   bst(){root = NULL;}
   void insert(int);
   void inorder(node*);
   void preorder(node*);
   void postorder(node*);
   void levelorder();
   bool search(int);
   bool isempty()
   {
    if(root == NULL)
     return true;
    else
     return false;
   }
   node* getroot(){return root;}
};

 void bst::insert(int x)
 {
  if(root == NULL)
  {
   root = new node;
   root->data = x;
  }
  else
  {
   node* cur = root;
   node* newnode;

   while(1)
   {
     if(x < cur->data && cur->left != NULL)
       cur = cur->left;
     else if(x > cur->data && cur->right != NULL)
       cur = cur->right;
     else if(x == cur->data)
     {
       cout << endl << "Element already exixts in binary search tree.";
       return;
     }
     else
      break; // found node where new node to be inserted as its left or right child is NULL so we don't have to traverse further now
    }
    newnode = new node;
    newnode->data = x;

    if(x < cur->data)
     cur->left = newnode;
   else
     cur->right = newnode;
  }
  cout << endl << "Element " << x << " inserted successfully.";


}

 void bst::inorder(node* r)
 {
   if(r->left != NULL)
    inorder(r->left);
   cout << r->data << " ";
   if(r->right != NULL)
    inorder(r->right);
 }

 void bst::preorder(node* r)
 {
   cout << r->data << " ";
   if(r->left != NULL)
    preorder(r->left);
   if(r->right != NULL)
    preorder(r->right);
 }

 void bst::postorder(node* r)
 {
   if(r->left != NULL)
    postorder(r->left);
   if(r->right != NULL)
    postorder(r->right);
   cout << r-> data << endl;
 }

 void bst::levelorder()
 {
  int front, rear;
   front = rear = -1;
   node* queue[100];

   front++;
   queue[++rear] = root;
   node* cur;

   while(rear != -1) // while queue is not empty
   {
     cur = queue[front];
     cout << cur->data << " ";

     if(cur->left != NULL)
       queue[++rear] =cur->left;
     if(cur->right != NULL)
       queue[++rear] =cur->right;

    if(++front > rear) // dequeue element and chech whether a queue is empty
     front = rear = -1; //empty queue;
   }
  }
/*################## METHOD 2 for levelorder traversal ######################*/

/* level order traversal using standard template library 'queue' in header file
 void bst::levelorder()
 {
  queue <node*> Q;
  Q.push(root);
  node* cur;

  while(!Q.empty())
  {
   cur  = Q.front();
   cout << cur->data << " ";

    if(cur->left != NULL)
      Q.push(cur->left);
    if(cur->right != NULL)
      Q.push(cur->right);
   Q.pop();
}*/

 bool bst::search(int key)
 {
   bool isfound = false;
   node* cur = root;

   while(cur)
   {
     if(cur->data == key)
     {
       isfound = true;
       cout << "["<<cur->data<<"]";
       break;
     }
     else if(key < cur->data)
          cur = cur->left;
       else
         cur = cur->right;
   }

  return isfound;
 }

int main()
{
   bst tree;
   int x;
   int choice;

   while(1)
   {
     cout << endl << endl << "1-> Insert";
     cout << endl << "2-> Inorder Traversal";
     cout << endl << "3-> Preorder Traversal";
     cout << endl << "4-> Postorder Traversal";
     cout << endl << "5-> Levelorder Traversal";
     cout << endl << "6-> Search.";
     cout << endl << "0-> Exit.";

     cout << endl << "Enter your choice : ";
     cin >> choice;

     switch(choice)
     {
       case 1: cout << endl << "Enter data : ";
               cin >> x;
               tree.insert(x);
               break;

       case 2: if(tree.isempty())
                cout << "Empty Binary Search Tree.";
               else
               {
                cout << endl << "Inorder traversal is : ";
                tree.inorder(tree.getroot());
               }
              break;

       case 3: if(tree.isempty())
               cout << "Empty Binary Search Tree.";
               else
               {
                cout << endl << "Preorder traversal is : ";
                tree.preorder(tree.getroot());
               }
               break;

       case 4: if(tree.isempty())
               cout << "Empty Binary Search Tree.";
               else
               {
                cout << endl << "Postorder traversal is : ";
                tree.postorder(tree.getroot());
               }
               break;
       case 5: if(tree.isempty())
               cout << "Empty Binary Search Tree.";
               else
               {
                cout << endl << "Levelorder traversal is : ";
                tree.levelorder();
               }
               break;
       case 6: if(tree.isempty())
                cout << "Empty Binary Search Tree.";
               else
               {
                 int key;
                 cout << endl << "Enter key Element : ";
                 cin >> key;

                 if( tree.search(key) )
                  cout << endl << "Element found.";
                 else
                  cout << endl << "Element not found.";
               }
               break;

       case 0: exit(0);
               break;
       default: cout << "Invalid choice ....!";
     }
   }
 return 0;
}
