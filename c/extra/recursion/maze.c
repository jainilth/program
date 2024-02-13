#include<stdio.h>
int path(int,int,int,int);
int main(){
    int n,m;
    printf("plese enter row and colum\n");
    scanf("%d %d",&n,&m);
    int ans=path(1,1,n,m);
    printf("the total paths in the diben area is %d",ans);
    return 0;
}
int path(int cr,int cc,int er,int ec){
    int downways=0;
    int rightways=0;
    if(cr==er&&cc==ec){
        return 1;
    }
    if(cr==er){
        rightways+=path(cr,cc+1,er,ec);
    }
    if(cc==ec){
        downways+=path(cr+1,cc,er,ec);
    }
    if(cr<er&&cc<ec){
        rightways=path(cr,cc+1,er,ec);
        downways=path(cr+1,cc,er,ec);
    }
    int totalways=rightways+downways;
    return totalways;
}