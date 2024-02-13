#include<stdio.h>
int fibnum(int);
int main(){
    int x;
    printf("plese enter a number");
    scanf("%d",&x);
    printf("the paths of given number is:-%d",fibnum(x));
    return 0;
}
int fibnum(int n){
    if(n==1||n==2) return n;
    if(n==3) return n+1;
    return fibnum(n-1)+fibnum(n-2)+fibnum(n-3);
}