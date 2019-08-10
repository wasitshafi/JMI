#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;
void sort_by_area(triangle* tr, int n) {
	/**
	* Sort an array a of the length n
	*/
    double area[n];
    
    for(int i = 0 ; i < n ;i++)
    {
        int a, b, c, p;
        a = tr[i].a;
        b = tr[i].b;
        c = tr[i].c;

        p = (a + b + c)/2;

        area[i] = sqrt(p*(p - a)*(p - b)*(p - c));
    }

    // sorting area
    for(int i = 0 ; i < n - 1; i++)
    {
        for(int j = 0 ;  j < n - i - 1 ; j++)
        {
            if(area[j] > area[j + 1])
            {
                int temp = area[j];
                area[j] = area[ j + 1];
                area[j + 1] = temp;

                int a, b, c;

                // swap a
                a = tr[j].a;
                tr[j].a = tr[ j + 1].a;
                tr[j + 1].a = a;

                // swap b
                b = tr[j].b;
                tr[j].b = tr[ j + 1].b;
                tr[j + 1].b = b;

                // swap c
                c = tr[j].c;
                tr[j].c = tr[ j + 1].c;
                tr[j + 1].c = c;
            }
        }
    }

    // now print sides

    for( int i = 0 ; i < n ; i++)
    {
        printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
    }
}

int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
		printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}