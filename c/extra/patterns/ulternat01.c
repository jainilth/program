#include <stdio.h>
int main()
{
    int i, j, n, temp;
    printf("plese enter a number\n");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= i; j++)
        {
            if ((i + j) % 2 == 0)
            {
                temp = 1;
            }
            else
            {
                temp = 0;
            }
            printf("%d", temp);
            // another method//
            // if (i % 2 == 0)
            // {
            //     temp = 0;
            // }
            // else
            // {
            //     temp = 1;
            // }
            // printf("%d", temp);
            // if (temp == 1)
            // {
            //     temp = 0;
            // }
            // else
            // {
            //     temp = 1;
            // }
        }
        printf("\n");
    }
    return 0;
}