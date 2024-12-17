# give path properly


# to read file
f = open("D://jainil//program//pyhton//file IO//file.txt")
data=f.read()
print(data)
f.close()


s="hi my name is jainil"
f=open("D://jainil//program//pyhton//file IO//myfile.txt","w")
f.write(s)
f.close()

# readline method
f=open("D://jainil//program//pyhton//file IO//file.txt")
lines=f.readlines()
print(lines,type(lines))
f.close()


with open("D://jainil//program//pyhton//file IO//file.txt") as f:
    print(f.read())

# you don't have to close file "with" read statment