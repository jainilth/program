#include <bits/stdc++.h>
using namespace std;
int main()
{
    int age;
    cout << "plese enter your age" << endl;
    cin >> age;
    if(age>18){
        cout<<"eligible for job";
        if(age>=55&&age<=57){
            cout<<",but retirment soon";
        }
    }
    else if(age>57){
        cout<<"retirment time";
    }
    else{
        cout<<"you are not eligible for job";
    }
    return 0;
}