#include <bits/stdc++.h>
using namespace std;
int sum(int a, int b)
{
    int c = a + b;
    return c;
}
int main()
{
    int a, b;
    cout << "plese enter a and b" << endl;
    cin >> a >> b;
    int c = sum(a, b);
    cout << "your suym is:-" << c;
    return 0;
}
//arrays will always be pass by reference we don't have to convert into it