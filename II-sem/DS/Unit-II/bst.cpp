
//2 pending cases height and delete node

//bst.cpp on 20-03-19
//
//program to implement binary search tree using linked list
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
/*   bool isfound = false;
   node* d_node;

       if(key == root->data)
       {
         d_node = root;
         isfound = true;

         if(root->left == NULL && root->right == NULL) // when only 1 node is there i.e root node
         {
           root = NULL;
           cout << endl << "root deleted having no childs";
         }
         else //check whether root has only left child or right child or it has both childs
         {    // now we know root has atleast 1 child
             if(root->left == NULL)       //root has only right child
             {
               root = root->right;
               cout << endl << "root deleted having right childs";
             }
             else if(root->right == NULL) //root has only left child
             {
               root = root->left;
               cout << endl << "root deleted having left childs";
             }
             else // root has both childs
             {


             }
         }
       }
         else // means node to be deleted is not root node
         {

           cout << endl << "Node to be deleted is not a root node.";
         node* cur;
         node* p;   //for parent

         p = cur = root;

         while(cur != NULL && isfound == false)
         {
           if(cur->data == key)
           {
             d_node = cur;
             isfound = true;
             // now we have find the node to be deleted now chech how many childs it have and perform operations accordingly
                 if(cur->left == NULL && cur->right == NULL) // leaf node
                 {
                   // now check whether its left/right child of its parent
                   if(cur->data > p->data)
                     p->right = NULL;
                   else
                     p->left = NULL;
                  }
                  else // node to be deleted is not a leaf node
                  {    // now we know node to be delete has atleast 1 child

                    if(cur->data > p->data)
                    {

                    }
                  }

           } // cur->data != key so traverse nodes
           else if(key < cur->data)
              p = cur, cur = cur->left;
           else
              p = cur, cur = cur->right;

       } // end of while means either cur == null or isfound == 0

   }  // end of else
       // if curr == null means there is no node with data as key. then the value of isfound = 0
        //  incase isfound =1 then node has been found so loop terminates
   if(isfound)
   {
    free(d_node);
    d_node = NULL;
    cout << endl << key << " is deleted from binary search tree.";
   }
   else
   {
     cout << endl << key << " is not present in binary search tree.";
   }*/
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
     cout << endl << " 3-> Preorder Traversal";
     cout << endl << " 4-> Postorder Traversal";
     cout << endl << " 5-> Levelorder Traversal";
     cout << endl << " 6-> Height of tree";
     cout << endl << " 7-> Search.";
     cout << endl << " 8- Delete.";
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
