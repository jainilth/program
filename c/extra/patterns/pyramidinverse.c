#include<stdio.h>
int main(){
    int i,j,n;
    printf("plese enter a nubmer\n");
    scanf("%d",&n);
    for(i=n;i>=1;i--){
        for(j=n;j>=n-i+1;j--){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}