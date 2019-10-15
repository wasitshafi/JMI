
//2 pending cases height and delete node

//bst.cpp on 20-03-19
//
//program to implement binary search tree using linked list
//
#include<bits/stdc++.h>
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
   void delete_node(int);
   int height(node*);
   bool isempty()
   {
    if(root == NULL)
     return true;
    else
     return false;
   }
   node* getroot(){return root;}


   int minimumElement()
   {
     node* cur = root;
     while(cur->left) cur = cur->left;
     return cur->data;
   }

   vector<int> commonPredecessors(int x , int y)
   {
     vector<int> v;
     set <int> s;

     node* cur = root;

     while(cur->data != x)
     {
       s.insert(cur->data);
       if(cur->data > x)
        cur = cur->left;
       else 
        cur = cur->right; 
     }

     cur = root;
     while(cur->data != y)
     {
       if(s.find(cur->data)!= s.end())
        v.push_back(cur->data);

       if(cur->data > y)
        cur = cur->left;
      else
        cur = cur->right;
     }
     return v;

   }


   int minimumCommonPredecessor()
   {
     return 44;
   }
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
   cout << r-> data << " ";
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

int bst::height(node * r)
{
  if(r == NULL)
    return 0;

  int left_height = height(r->left);
  int right_height = height(r->right);

  if(left_height > right_height)
   return left_height + 1;
  else
   return right_height + 1;
}

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
 void bst::delete_node(int key)
 {
   cout << endl << __func__ << "() is incomplete yet...!";
}


int main()
{
   bst tree;
   int x;
   int choice;

   while(1)
   {
     cout << endl << endl << " 1-> Insert";
     cout << endl << " 2-> Inorder Traversal";
     cout << endl << " 3-> Find Minimum";
     cout << endl << " 4-> Common Predecessor";
     cout << endl << " 5-> Minimum Predecessor";    
     cout << endl << " 0-> Exit.";
     cout << endl << "-1-> clear screen.";

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
                 cout << "Minimum Element in BST is : " << tree.minimumElement();
               }
               break;

       case 4: if(tree.isempty())
                 cout << "Empty Binary Search Tree.";
               else
               {
                 int x, y;
                 cout << endl << "Enter x, y : ";
                 cin >> x >> y;

                 cout << endl << "Common Predecessor are : ";
                 vector<int> v = tree.commonPredecessors(x,y);
                 for(int i = 0 ; i < v.size() ; i++) cout << v[i] << "  ";
               }
               break;
       case 5: if(tree.isempty())
                 cout << "Empty Binary Search Tree.";
               else
                cout << endl << "Minimum Predecessor is : " << tree.minimumCommonPredecessor();
               break;
       case 6: if(tree.isempty())
               cout << "Empty Binary Search Tree.";
               else
               {
                cout << endl << "Height of tree is : " << tree.height(tree.getroot());
               }
               break;
       case 7: if(tree.isempty())
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

       case 8: if(tree.isempty())
                cout << "Empty Binary Search Tree.";
               else
               {
                 int key;
                 cout << endl << "Enter key Element to be deleted : ";
                 cin >> key;
                 tree.delete_node(key);
               }
               break;

       case 0: exit(0);
               break;
       case -1:system("clear");
               break;
       default: cout << "Invalid choice ....!";
     }
   }
 return 0;
}
