#include <stdio.h>
int main()
{
    int stu[10];
    printf("plese enter students marks\n");
    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &stu[i]);
    }
    for (int i = 0; i < 10; i++)
    {
        if (stu[i] < 35)
        {
            printf("the roll number is:-%d\n", i + 1);
        }
    }
    return 0;
}