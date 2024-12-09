n=int(input("enter the number"))
#print in reverce order
for i in range(10,0,-1):
    print(f"{n} X {i} = {n*i}")

print("-"*100)

#another method
for i in range(1,11):
    print(f"{n} X {11-i} = {n*(11-i)}")