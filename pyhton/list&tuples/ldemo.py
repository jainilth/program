l1 = [1,8,7,2,21,15]
# work only for same datatype
l1.reverse()#: updates the list to [15,21,2,7,8,1]
print(l1)
l1.sort()#: updates the list to [1,2,7,8,15,21]
print(l1)
l1.append(8)#: adds 8 at the end of the list
print(l1)
l1.insert(3,8)#: This will add 8 at 3 index
print(l1)
l1.pop(2)#: Will delete element at index 2 and return its value.
print(l1)
l1.remove(21)#: Will remove 21 from the list. 
print(l1)
print(sum(l1))#print sum of entire list
