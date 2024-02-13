#include<stdio.h>
void factor(int);
int main(){
    int n;
    printf("plese enter a nuumber\n");
    scanf("%d",&n);
    factor(n);
    return 0;
}
void factor(int a){
    int i;
    for(i=2;i<a;i++){
        if(a%i==0){
            printf("the factor of a is %d\n",i);
        }
    }
}