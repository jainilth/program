#include <stdio.h>
int main()
{
    int i, j, n;
    printf("plese enter a number\n");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n; j++)
        {
            int a = n / 2 + 1;
            if (i == a || j == a)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
    return 0;
}