#include<stdio.h>

struct point{
    int x, y;
    point(){};
    point(int x1, int y1)
    {
        x = x1;
        y = y1;
    }
};

int main()
{
    struct point p(10, 20);
    struct point p2;
    
    printf("x : %d\ny : %d\n\n", p.x, p.y);
    
    p2.x = 55;
    p2.y = 66;
    printf("x : %d\ny : %d\n\n", p2.x, p2.y);

    return 0;
}
