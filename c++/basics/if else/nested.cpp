#include <bits/stdc++.h>
using namespace std;
int main()
{
    int age;
    cout << "plese enter your age" << endl;
    cin >> age;
    if (age <= 18)
    {
        cout << "ypu are not eligible for job";
    }
    else if(age<=54){
        cout<<"you are eligible for job";
    }
    return 0;
}