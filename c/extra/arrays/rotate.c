#include<stdio.h>
void rev(int a[],int b,int c){
    int i,j;
    for(i=b,j=c;i<j;i++,j--){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    return;
}
int main(){
    int n;
    printf("plese enter total array element\n");
    scanf("%d",&n);
    int a[n];
    for (int i = 0; i < n; i++)
    {
        printf("plese enter %d element:-",i+1);
        scanf("%d",&a[i]);
    }
    printf("the array is:-{");
    for (int i = 0; i < n; i++)
    {
        printf("%d",a[i]);
        if(i<n-1){
            printf(",");
        }
    }
    printf("}\n");
    int k;
    printf("plese enter a number you eant to rotate:-\n");
    scanf("%d",&k);
    k=k%n;
    rev(a,0,n-1);
    rev(a,0,k-1);
    rev(a,k,n-1);
    for (int i = 0; i < n; i++)
    {
        printf("%d ",a[i]);
    }
    return 0;
}  