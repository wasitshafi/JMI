#include<stdio.h>
#include<stdlib.h>

int main()
{
    unsigned int *a = calloc(5,4);
    unsigned int **b= malloc(4);

    b[0] = NULL;

    if(b[0])
    {
        printf("hello world");
    }

    printf("%x",b[0]);
/*
    for(int i=0;i<5;i++)
    
    for(int i=0;i<5;i++)
    {
        printf("%u\n",*(b+i));
    }*/
    return 0;
}