#include <bits/stdc++.h>
using namespace std;
int main()
{
    int day;
    cout << "plese enter a day number"<<endl;
    cin >> day;
    switch (day)
    {
    case 1:
        cout << "sunday";
        break;
    case 2:
        cout << "monday";
        break;
    case 3:
        cout << "tuesday";
        break;
    case 4:
        cout << "wednesday";
        break;
    case 5:
        cout << "thursday";
        break;
    case 6:
        cout << "friday";
        break;
    case 7:
        cout << "saturday";
        break;
    default:
        cout << "plese enter number between 1 to 7";
        break;
    }
    return 0;
}