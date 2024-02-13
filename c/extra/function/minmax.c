#include <stdio.h>
int min(int, int);
int main()
{
    int a, b;
    printf("plese enter a and b\n");
    scanf("%d %d", &a, &b);
    int minimum = min(a, b);
    printf("the minimum number between a and b is:-%d", minimum);
    return 0;
}
int min(int a, int b)
{
    if (a > b)
    {
        return b;
    }
    else
    {
        return a;
    }
}