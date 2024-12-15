def sum(n):
    if(n==0):
        return 0
    else:
        return n + sum(n-1)

def factorial(n):
    if(n==0 or n==1):
        return 1
    else:
        return n * factorial(n-1)


a=int(input("etner the number:"))
print(sum(a))
print(factorial(a))

