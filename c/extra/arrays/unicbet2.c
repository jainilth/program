#include <stdio.h>
#include <stdbool.h>
int main()
{
    int a[7] = {1, 2, 3, 4, 3, 2, 1};
    for (int i = 0; i < 7; i++)
    {
        bool flage=false;
        for (int j = i + 1; j < 7; j++)
        {
            if(a[i]==a[j]){
                flage=true;
            }
        }
        if(flage==false){
            printf("the number is %d",a[i]);
            break;
        }
    }
    return 0;
}