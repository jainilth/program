#include<stdio.h>
int main(){
    int a[8]={1,2,3,4,5,6,7,8};
    int i,j,x=12;
    for(i=0;i<8;i++){
        for(j=i+1;j<8;j++){
            for(int k=j+1;k<8;k++){
                if(a[i]+a[j]+a[k]==x){
                printf("the pair is (%d,%d,%d)\n",i+1,j+1,k+1);
            }
            }
        }
    }
    return 0;
}