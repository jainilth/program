//all time right
#include<stdio.h>
#include<limits.h>
int main(){
    int a[5]={5,4,4,2,1};
    int max=INT_MIN;
    int smax=INT_MIN;
    for (int i = 0; i < 5; i++)
    {
        if(max<a[i]){
            max=a[i];
        }
    }
    for (int i = 0; i < 5; i++){
        if(a[i]!=max&&smax<a[i]){
            smax=a[i];
        }
    }
    printf("%d ",max);
    printf("%d",smax);
    return 0;
}