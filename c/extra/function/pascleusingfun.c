#include <stdio.h>
int ncr(int, int);
int fac(int);
void main()
{
	int j, i, n;
	printf("plese enter a number\n");
	scanf("%d", &n);
	for (i = 0; i <= n; i++)
	{
		for (j = 0; j <= n - i; j++)
		{
			printf("  ");
		}
		for (j = 0; j <= i; j++)
		{
			int ncrs = ncr(i, j);
			printf(" %d  ", ncrs);
		}
		printf("\n");
	}
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