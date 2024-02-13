#include <stdio.h>
int main()
{
    int arr[8] = {-9, -2, -11, -15, -13, -40, -8, -7};
    int a = arr[0], i;
    for (i = 0; i < 7; i++)
    {
        if (a < arr[i])
        {
            a = arr[i];
        }
    }
    printf("%d", a);
    return 0;
}