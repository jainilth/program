#include <bits/stdc++.h>
using namespace std;
int main()
{
    int s;
    cin >> s;
    int ans=0;
    for (int i = 1; i <= s; i++)
    {
        for (int j = 1; j <= sqrt(i); j++)
        {
            if (i % j == 0)
            {
                ans+=j;
                if ((i / j) != j)
                ans+=(i / j);
            }
        }
    }
    cout<<ans;
    return 0;
}
// #include <bits/stdc++.h>
// using namespace std;
// int div(int i)
// {
//     int ans = 0;
//     for (int j = 1; j <= sqrt(i); j++)
//     {
//         if (i % j == 0)
//         {
//             ans += j;
//             if ((i / j) != j)
//                 ans += (i / j);
//         }
//     }
//     return ans;
// }
// int main()
// {
//     int s;
//     cin >> s;
//     int a = 0;
//     for (int i = 1; i <= s; i++)
//     {
//         a += div(i);
//     }
//     cout << a;
//     return 0;
// }