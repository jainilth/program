#include<stdio.h>
int main(){
    int i,j,n;
    printf("plese enter a number\n");
    scanf("%d",&n);
    int sp=1;
    int st=n-1;
    for(i=1;i<=2*n-1;i++){
        printf("*");
    }
    printf("\n");
    for(i=1;i<=n;i++){
        for(j=1;j<=st;j++){
            printf("*");
        }
        for(j=1;j<=sp;j++){
            printf(" ");
        }
        for(j=1;j<=st;j++){
            printf("*");
        }
        st--;
        sp+=2;
        printf("\n");
    }
    return 0;
}