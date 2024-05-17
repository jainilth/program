#include <bits/stdc++.h>
using namespace std;
int main()
{
    // pair<int,pair<int,int>> p={1,{3,4}};
    // cout<<p.first;
    // vector<pair<int, int>> v;
    // v.push_back({1, 2});
    // v.emplace_back(1, 2);
    vector<int> v = {12, 3, 4, 4, 5, 5};
    v.push_back(1);
    v.emplace_back(2);
    // cout<<v[1]<<" ";
    vector<int> copy(5, 100);
    v.insert(v.begin() + 3, copy.begin(), copy.end());
    for (auto it = v.begin(); it != v.end(); it++)
    {
        cout << *(it) << " ";
    }
    cout << endl;
    v.pop_back();
    for (auto it : v)
    {
        cout << it << " ";
    }
    return 0;
}