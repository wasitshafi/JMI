//
// atoi.c
//
// A program to convert a string to integer.
//
#include<stdio.h>
#include<assert.h>


int atoi__(char *str){
  int result = 0;

  while( (*str != EOF) && isdigit(*str) )
  {
    result = result * 10 + (*str - '0');
    str++;
  }

  return result;
}


int main(void){

  assert(atoi__("888") == 888);
  assert(atoi__("784abc") == 784);
  assert(atoi__("abcd") == 0);
  assert(atoi__("abcd7474") == 0);

  return 0;
}

