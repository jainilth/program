import math
f=open('D://jainil//program//pyhton//file IO//myfile.txt','r')
f.seek(5)
data=f.read(5)
print(data)
f.seek(2)
data=f.read(5)
print(data)
f.close()


print(math.log(2,10)) #log base 10
print(math.log10(2)) #log base 10