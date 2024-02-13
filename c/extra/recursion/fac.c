#include <stdio.h>
int fac(int);
int main()
{
    int n;
    printf("plese enter a number\n");
    scanf("%d", &n);
    printf("the factorial og given number is:-%d", fac(n));
    return 0;
}
int fac(int n)
{
    if (n == 0 || n == 1)
    {
        return 1;
    }
    else
    {
        return n * fac(n - 1);
    }
}