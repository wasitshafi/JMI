#include <stdio.h>
#include <stdlib.h>

/*
 * This stores the total number of books in each shelf.
 */
int* total_number_of_books;

/*
 * This stores the total number of pages in each book of each shelf.
 * The rows represent the shelves and the columns represent the books.
 */
int** total_number_of_pages;

int main()
{
    int total_number_of_shelves;
    scanf("%d", &total_number_of_shelves);
    
    int total_number_of_queries;
    scanf("%d", &total_number_of_queries);
    
    total_number_of_books = calloc(total_number_of_shelves, sizeof(int));//calloc will automatically initilize all the memory location with 0, i.e. no of books on shelf will be initilized to 0
    total_number_of_pages = calloc((total_number_of_shelves + 2) ,  sizeof(int));

    
    while (total_number_of_queries--) {
        int type_of_query;
        scanf("%d", &type_of_query);
        
        if (type_of_query == 1) {
            int x, y;
            scanf("%d %d", &x, &y);
            total_number_of_books[x]++; // we are going to put the very first book on shelf...

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

    if (total_number_of_books) {
        free(total_number_of_books);
    }
    

    printf("Total no of shelves is : %d", total_number_of_shelves);
    

    for (int i = 0; i < total_number_of_shelves; i++) {
        if (*(total_number_of_pages + i)) {
            free(*(total_number_of_pages + i));
        }
    }
    
    if (total_number_of_pages) {
        free(total_number_of_pages);
    }
    
    return 0;
}