#include<stdio.h>
int fac(int);
int main(){
    int n;
    printf("plese enter a number\n");
    scanf("%d",&n);
    int i;
    for(i=1;i<=n;i++){
        int factorial=fac(i);
        printf("the factorial of %d is %d\n",i,factorial);
    }
    return 0;
}
int fac(int a){
    int ans=1;
    for(int i=1;i<=a;i++){
        ans=ans*i;
    }
    return ans;
}