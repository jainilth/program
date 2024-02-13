#include <stdio.h>
void swap(int *, int *);
int main()
{
    int a, b;
    printf("plese enter a number\n");
    scanf("%d %d", &a, &b);
    swap(&a, &b);
    printf("the vale of swaped a is %d\n", a);
    printf("the vale of swaped b is %d", b);
    return 0;
}
void swap(int *a, int *b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
    return;
}