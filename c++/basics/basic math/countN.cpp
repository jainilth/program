#include <bits/stdc++.h>
using namespace std;
int main()
{
    int N = 22074;
    int b = 0;
    int c = N;
    int count = 0;
    while (N > 0)
    {
        b = N % 10;
        N = N / 10;
        if(b==0){
            continue;
        }
        if(c%b==0){
            count++;
        }
    }
    cout<<count;
    return 0;
}