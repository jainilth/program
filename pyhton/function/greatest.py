def great(a,b,c):
    if(a>b):
        if(a>c):
            return a
        else:
            return c
    else:
        if(b>c):
            return b
        else:
            return c
        
a=int(input("enter a:"))
b=int(input("enter b:"))
c=int(input("enter c:"))

print(great(a,b,c))