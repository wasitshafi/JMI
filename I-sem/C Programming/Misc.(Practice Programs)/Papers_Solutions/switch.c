#include<stdio.h>

int main()
{
	
	char ch;
	
	ch = 'A';
	
	while( ch <= 'F')
	{
		switch(ch)
		{
			case'A':case 'B':case'C':case'D':ch++;break;
			case'E':case'F':ch++;
		}
		
		putchar(ch);
    }

			
}
