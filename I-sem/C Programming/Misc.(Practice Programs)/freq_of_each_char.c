//char_freq.c
//
//
//programe to compute frequency of character.
#include<stdio.h>
#include<stdlib.h>

int main()
{
	char *str;
	int freq[256] = {0}; // 256 char in ASCII
	int i;
	str = malloc(1024 * sizeof(char));
	
	printf("\nEnter string:\t");
	scanf("%[^\n]", str);
	
	for(i = 0 ; str[i] != '\0' ; i++) freq[str[i]]++;
	
	printf("\nFrequency of character is:\n\n");
	
	for(i = 0 ; i < 255 ; i++)
	  if(freq[i] != 0)
	  	printf("\n'%c' occurs %d times.", i, freq[i] ) ;

	free(str);
	
	return 0;
}
