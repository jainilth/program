#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cout << "plese enter a number" << endl;
    cin >> n;
    int d = n;
    int count = 0;
    while (n > 0)
    {
        n = n / 10;
        count++;
    }
    n = d;
    int b = 0;
    int ans = 0;
    while (n > 0)
    {
        b = n % 10;
        n = n / 10;
        ans += pow(b, count);
        cout << ans << " ";
    }
    if (ans == d)
    {
        cout << "armstrong";
    }
    else
    {
        cout << "not";
    }
    return 0;
}