#include<iostream>
using namespace std;
class Point{
   public:
   int x, y;
   Point(){}
   Point(int a, int b){
      x = a;
      y = b;
   }
   friend ostream & operator<<( ostream & a,Point p)
   {
        a <<"(" << p.x << ", " << p.y << ")";
        return a;
    }
};

class Stack{
   Point *a;
   int length, tos;
   public:
   Stack(int n){
      a = new Point[n];
      length = n;
      tos = -1;
   }
   bool isEmpty(){
     if(tos == -1)
       return true;
     else
       return false;
   }
   void push(Point x){
      a[++tos] = x;
   }
   Point pop(){
     return a[tos--];
   }
 void display();
};


 void Stack::display()
{
	for(int i=0;i<=tos;i++)\
       {
      cout<<a[i];
       }
 }



int main()
{
int m,n;
//cout<<"\n\n Enter the maximum size of the row and column of the maze";
//cin>>m>>n;
m = n = 4;
int maze[4][4] = {{0, 1, 1, 0}, {0,0, 0, 1}, {0, 1, 1, 0}, {0, 0, 0, 0}};

//int maze[m][n]=0,row=1,col=1;
int row = 0, col = 0;
maze[row][col]=1;
Stack s(m*n-1);

while(row != m-1 || col != n-1)
{
 if(col<n-1 && maze[row][col+1]==0) //right
    {
       s.push(Point(row,col));
       col=col+1;
       maze[row][col]=1;
     }

 else if(row < m-1 && maze[row+1][col]==0) //down
    {
     s.push(Point(row,col));
      row=row+1;
      maze[row][col]=1;
     }

 else if(col>0 && maze[row][col-1]==0) //left
    {
     s.push(Point(row,col));
      col=col-1;
     maze[row][col]=1;
     }
 else if(row>0 && maze[row-1][col]==0) //up
    {
     s.push(Point(row,col));
      row=row-1;
      maze[row][col]=1;
     }
    else
     {
    if(s.isEmpty()==true)
      {
       cout<<"There is no path";
         break;
      }
     Point p=s.pop();
     row=p.x;
     col=p.y;
     }
  }
cout<<"The path is: \n";
s.display();
cout<<"("<<m-1<<","<<n-1<<")\n";
return 0;
}
