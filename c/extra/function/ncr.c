// nCr = n! / (r! (n – r)!)
#include <stdio.h>
int ncr(int, int);
int fac(int);
int main()
{
    int n, r;
    printf("plese enter n and r\n");
    scanf("%d %d", &n, &r);
    int ncrs = ncr(n, r);
    printf("%d", ncrs);
    return 0;
}
int fac(int num)
{
    int ans = 1;
    for (int i = num; i >= 1; i--)
    {
        ans = ans * i;
    }
    return ans;
}
int ncr(int n, int r)
{
    int ans;
    ans = fac(n) / (fac(n - r) * fac(r));
    return ans;
}