a=5
b=8
c=20
d=7
if(a>b and a>c and a>d):
    print("a is the largest number")
elif(b>c and b>d):
    print("b is the largest number")
elif(c>d):
    print("c is the largest number")
else:
    print("d is the largest number")

print(max(a,b,c,d))#you can also use predefinied function