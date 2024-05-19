#include <bits/stdc++.h>
using namespace std;
int main()
{
    vector<int> a = {1, 6, 3, 7, 9, 5, 2};
    sort(a.begin(), a.end());
    for (auto it : a)
    {
        cout << it << " ";
    }
    cout << endl;
    int b[5] = {3, 5, 2, 7, 5};
    sort(b, b + 5);
    for (int i = 0; i < 5; i++)
    {
        cout << b[i] << " ";
    }
    string s="123";
    do
    {
        cout<<s<<endl;
    } while (next_permutation(s.begin(),s.end()));
    
    return 0;
}