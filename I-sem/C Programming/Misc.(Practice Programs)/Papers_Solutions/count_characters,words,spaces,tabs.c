#include <stdio.h>


int main()
{
    char str[100];
    int i, words = 0, characters = 0, tabs = 0,spaces = 0;

    printf("Enter any string: ");
    gets(str);

    for( i = 0 ; str[i] != '\0' ; i++)
    {
        if(str[i]==' ' || str[i]=='\n' || str[i]=='\t')words++;
        if(str[i]==' ')spaces++;
        if(str[i]=='\t')tabs++;
        if(  (str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z') ||(str[i] >= '0' && str[i] <= '9') )
        characters++;
	}

    printf("\n\nTotal number of characters = %d", characters);
    printf("\nTotal number of words = %d", words + 1);
    printf("\nTotal number of spaces = %d", spaces);
    printf("\nTotal number of tabs = %d", tabs);

    return 0;
}
