#include <bits/stdc++.h>
using namespace std;
int main()
{
    int marks;
    char grade;
    cout << "plese enter your marks" << endl;
    cin >> marks;
    if (marks < 25)
    {
        grade = 'f';
    }
    else if (marks < 44)
    {
        grade = 'e';
    }
    else if (marks < 49)
    {
        grade = 'd';
    }
    else if (marks < 59)
    {
        grade = 'c';
    }
    else if (marks < 79)
    {
        grade = 'b';
    }
    else
    {
        grade = 'a';
    }
    cout<<"you've got "<<grade<<" grade";
    return 0;
}