#include <stdio.h>
#include <stdlib.h>


int* total_number_of_books;
int** total_number_of_pages;

int main()
{
    int total_number_of_shelves;
    scanf("%d", &total_number_of_shelves);
    
    int total_number_of_queries;
    scanf("%d", &total_number_of_queries);
    
    total_number_of_books = malloc(total_number_of_shelves * sizeof(int));        // calloc will automatically initilize all the memory location with 0, i.e. no of books on shelf will be initilized to 0
    total_number_of_pages = malloc((total_number_of_shelves + 1) * sizeof(int));
    
    for(int i = 0 ; i < total_number_of_shelves + 1 ; i++)
    {
        total_number_of_pages[i] = NULL;
        total_number_of_books[i] = 0;
    }

    printf("Total no of pages : %d ", total_number_of_pages);
    printf("Total no of books : %d ", total_number_of_books);
/*
    while (total_number_of_queries--) {
        int type_of_query;
        scanf("%d", &type_of_query);
        
        if (type_of_query == 1) {
            int x, y;
            scanf("%d %d", &x, &y);
            total_number_of_books[x]++;

            if(total_number_of_books[x] == 1)
            {
                total_number_of_pages[x] = malloc(sizeof(int));
            }
            else
            {
                int *temp;
                temp = realloc(total_number_of_pages[x], total_number_of_books[x] * sizeof(int));
                total_number_of_pages[x] = temp;
            }

        total_number_of_pages[x][total_number_of_books[x]-1] = y;
         
        } else if (type_of_query == 2) {
            int x, y;
            scanf("%d %d", &x, &y);
            printf("%d\n", *(*(total_number_of_pages + x) + y));
        } else {
            int x;
            scanf("%d", &x);
            printf("%d\n", *(total_number_of_books + x));
        }
    }




/*
    if (total_number_of_books) {
        free(total_number_of_books);
    }
    
    for (int i = 0; i < total_number_of_shelves; i++) {
        if (*(total_number_of_pages + i)) {
            free(*(total_number_of_pages + i));
        }
    }
    
    if (total_number_of_pages) {
        free(total_number_of_pages);
    }
*/

    return 0;
}