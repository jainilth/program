# elements can not be repeated
# can contain different type of datatype
e=set()# empty set
s={1,3,8,5,"jainil"}# set
print(s)
s.add(6)# add element
print(s)
s.remove(1)
print(s)
print(s.union({8,11}))#: Returns a new set with all items from both sets. {1,8,2,3,11}.
print(s.intersection({8,11}))#: Return a set which contains only item in both sets {8}.