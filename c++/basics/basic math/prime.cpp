#include<bits/stdc++.h>
using namespace std;
int checkprime(int n){
    int count=0;
    for(int i=1;i<=sqrt(n);i++){
        if(n%i==0){
            count++;
            if(count>1){
                return 0;
            }
        }
    }
        return 1;
}
int main(){
    int n;
    cin>>n;
    int c=checkprime(n);
    cout<<c;
    return 0;
}