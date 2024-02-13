#include <stdio.h>
int main()
{
    int n, k, i, j;
    printf("plese enter a number\n");
    scanf("%d", &n);
    int a = 3;
    for (i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++)
        {
            printf(" ");
        }
        for (j = 1; j <= i; j++)
        {
            printf("%d", j);
        }
        k = i - 1;
        for (j = 1; j <= i - 1; j++)
        {
            printf("%d", k);
            k--;
        }
        printf("\n");
    }

    return 0;
}