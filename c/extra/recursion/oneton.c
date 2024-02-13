#include <stdio.h>
int add(int, int);
int main()
{
    int a;
    printf("plese enter a number\n");
    scanf("%d", &a);
    printf("the series is:-");
    printf("%d", add(a, 1));
    return 0;
}
int add(int a, int i)
{
    printf("%d ", i++);
    if (i > a - 1)
    {
        return a;
    }
    return add(a, i);
}

//another method//

// #include <stdio.h>
// void dec(int);
// int main()
// {
//     int a;
//     printf("plese enter a number\n");
//     scanf("%d", &a);
//     printf("the series is:-");
//     dec(a);
//     return 0;
// }
// void dec(int a)
// {
//     if (a == 0)
//     {
//         return;
//     }
//     dec(a-1);
//     printf("%d ", a);
//     return;
// }