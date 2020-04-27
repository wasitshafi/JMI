//
//
//
//
#include<stdio.h>
//#define begin main      //method1
//#define begin m##a##i##n  //method2  using Token-pasting operator (##) // for info read : https://www.geeksforgeeks.org/and-operators-in-c/


      // method 3
#define decode(s,t,u,m,p,e,d) m##s##u##t  // for more info read : https://www.quora.com/How-can-I-write-a-C-program-without-a-main-function
#define begin decode(a,n,i,m,a,t,e)


int begin()
{
    printf("Hello world...");
    return 0;
}
