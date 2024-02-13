#include <stdio.h>
void dec(int);
int main()
{
    int a;
    printf("plese enter a number\n");
    scanf("%d", &a);
    printf("the series is:-");
    dec(a);
    return 0;
}
void dec(int a)
{
    if (a == 0)
    {
        return;
    }
    printf("%d ", a);
    dec(a-1);
    return;
}