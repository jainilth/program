#include <stdio.h>
int power(int, int);
int main()
{
    int n, w;
    printf("plese enter n number and its power\n");
    scanf("%d %d", &n, &w);
    int p = power(n, w);
    printf("the power of given number is:-%d", p);
    return 0;
}
int power(int x, int y)
{
    if (y == 0)
        return 1;
    return x * power(x, y - 1);
}

// another method//advance method

// #include <stdio.h>
// int power(int, int);
// int main()
// {
//     int n, w;
//     printf("plese enter n number and its power\n");
//     scanf("%d %d", &n, &w);
//     int p = power(n, w);
//     printf("the power of given number is:-%d", p);
//     return 0;
// }
// int power(int x, int y)
// {
//     if (y == 0)
//         return 1;
//     int a = power(x, y / 2);
//     if (y % 2 == 0)
//     {
//         return a * a;
//     }
//     else
//     {
//         return a * a * x;
//     }
// }