number=int(input("enter a number"))
j=1
while(j<11): #using while loop
    print(number*j)
    j+=1
for i in range(1,11): #using for loop
    print(i*number)

l = ["Harry", "Soham", "Sachin", "Rahul"]
for i in l:
    if(i.startswith("S")):
        print("hello",i)


#check if number is prime or not
count=0
for i in range(1,number+1):
    if(number%i==0):
        count+=1
if(count==2):
    print(number,"is a prime number")
else:
    print(number,"is not a prime number")