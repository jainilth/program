#include<stdio.h>
void rev(int a[]){
    int i,j;
    for(i=0,j=7;i<j;i++,j--){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    return;
}
int main(){
    int a[8]={1,2,3,4,5,6,7,8};
    rev(a);
    for (int i = 0; i < 8; i++)
    {
        printf("%d ",a[i]);
    }
    
    return 0;
}  