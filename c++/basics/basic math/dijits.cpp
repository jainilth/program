#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a = 1234;
    int b = a;
    int count = 0;
    while (a > 0)
    {
        a = a / 10;
        count++;
    }
    cout << count << endl;
    cout << a << endl;
    int c[count];
    for (int i = count - 1; i >= 0; i--)
    {
        c[i] = b % 10;
        b = b / 10;
    }
    for (int i = 0; i < count; i++)
    {
        cout << c[i] << " ";
    }
    cout << endl;
    for (int i = 0; i < count; i++)
    {
        a = (a * 10) + c[i];
    }
    cout << a << endl;
    return 0;
}