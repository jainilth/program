//all time right
#include<stdio.h>
#include<limits.h>
int main(){
    int a[3]={10,10,10};
    int max=INT_MIN;
    int smax=INT_MIN;
    for (int i = 0; i < 3; i++)
    {
        if(max<a[i]){
            max=a[i];
        }
    }
    for (int i = 0; i < 3; i++){
        if(a[i]!=max&&smax<a[i]){
            smax=a[i];
        }
    }
    if(smax==INT_MIN){
        printf("No second max\n");
    }
    printf("%d ",max);
    printf("%d",smax);
    return 0;
}